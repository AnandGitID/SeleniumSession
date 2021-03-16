package TestngSessions;

import org.testng.annotations.Test;

public class InvocationCountTest {

	
	@Test(invocationCount=10)
	public void f_test(){
		System.out.println("F test....");
	}
}
