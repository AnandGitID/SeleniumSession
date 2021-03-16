package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClickandsendKeys {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/open-source/demo/");
		
		By firstname=By.id("Form_submitRequest_FirstName");
	    //WebElement fname=driver.findElement(firstname);
	
//	      Actions act= new Actions (driver);
//	      act.sendKeys(fname, "Anand").perform();
//	      
//	      act.click(driver.findElement(By.xpath("//a[@class='btn-orange contact-ohrm ']"))).perform();
	     
	    
	    doActionsSendkeys(firstname, "Anand");

	}
	

	public static  WebElement getElement(By locator) {
		return driver.findElement(locator);

	}
	public static void doActionsClick(By locator){
		Actions act= new Actions (driver);
		act.click(getElement(locator)).perform();
	}
	public static void doActionsSendkeys(By locator, String value){
		Actions act= new Actions (driver);
		act.sendKeys(getElement(locator), value).perform();
	}

}
