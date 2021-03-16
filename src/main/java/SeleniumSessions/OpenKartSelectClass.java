package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenKartSelectClass {
	static WebDriver driver;
	
		
				public static void main(String[] args) {
					WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver();
					driver.get("https://www.orangehrm.com/open-source/demo/");
					
					By indus_option=By.id("Form_submitRequest_Industry");
					
//					Select select=new Select(driver.findElement(indus_option));
//					select.selectByValue("Education");
					
					doSelectbyValue(indus_option, "Education");

	}
		public static WebElement getElement(By locator){
			return driver.findElement(locator);
		}	
		
		
		public static void doSelectbyValue(By locator, String value){
		
			Select select=new Select(getElement(locator));
			select.selectByValue(value);
		}

}
