package TestngSessions;

import org.testng.annotations.Test;

public class DependOnMethodConcept {
	
	@Test ()
	public void registerTest(){
		System.out.println("register to app");
	}
	@Test ()
	public void loginTest(){
		System.out.println("login to app");
		int i=9/0;
	}
	
	@Test (dependsOnMethods= {"loginTest", "registerTest"}, priority=1)
	public void searchTest(){
		System.out.println("search test");
	}
	
	@Test (dependsOnMethods= "loginTest", priority=2)
	public void paymentTest(){
		System.out.println("payment test");
	}


}
