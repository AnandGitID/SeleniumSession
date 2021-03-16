package TestngSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnnotations {

	@BeforeSuite

	public void creteUser() {
		System.out.println("BS-create user");
	}

	@BeforeTest

	public void connectWithDB() {
		System.out.println("BT-connet with DB");
	}

	@BeforeClass

	public void launchBrowser() {
		System.out.println("Bc-launch browser");
	}

	@BeforeMethod

	public void login() {
		System.out.println("BM-login to app");
	}
	
	@Test(priority=1)
	public void searchTest(){
		System.out.println("search test....");
	}
	@Test(priority=1)
	public void addToCartTest(){
		System.out.println("addToCart test....");
	}
	@Test(priority=2)
	public void paymentTest(){
		System.out.println("payment test....");
	}
	
	
	@AfterMethod
	public void logout() {
		System.out.println("AM-logout");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC-close the browser");
	}
	
	@AfterTest
	public void disconnectWithDB() {
		System.out.println("AT-Disconnect with DB");
	}
	@AfterSuite
	public void deleteUser() {
		System.out.println("AC-delete user");
	}
}
