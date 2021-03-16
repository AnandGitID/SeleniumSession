package TestngSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassicCRMTest extends BaseTestClass{

	
	@Test(priority=1)
		public void crmTitletest(){
		
		String title=driver.getTitle();
		System.out.println("page title is :" + title);
		Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.");
	}
	
	@Test(priority=2)
	public void logoTest(){
	 Assert.assertTrue(driver.findElement(By.xpath("(//img[@class='img-responsive'])[2]")).isDisplayed());
		
	}
	
	


}
