package TestngSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMTest extends BaseTestClass {

	
	@Test(priority=1)
		public void orangeTitletest(){
	
		String title=driver.getTitle();
		System.out.println("page title is :" + title);
		Assert.assertEquals(title, "Free Human Resource Management Software | 30 Day Trial Creation");
	}
	
	@Test(priority=2)
	public void contactSaleTest(){
		Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Contact Sales']")).isDisplayed());
		
	}
	
	

}
