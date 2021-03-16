package TestngSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest extends BaseTestClass{
	
	@Test(priority=1)
		public void titletest(){
		
		String title=driver.getTitle();
		System.out.println("page title is :" + title);
		Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}
	@Test(priority=2)
	public void urlTest(){
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("amazon"));
	}
	
	@Test(priority=3)
	public void logoTest(){
		boolean b=driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
		Assert.assertTrue(b);
	}



}
