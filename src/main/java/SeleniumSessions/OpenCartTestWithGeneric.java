package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCartTestWithGeneric {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		By firstName=By.name("firstname");
		By lastName=By.name("lastname");
		By email=By.name("email");
		By phoneNumber=By.name("telephone");
		By pwd=By.name("password");
		By conwd=By.name("confirm");
		By tnc=By.name("agree");
		By submit= By.xpath("//input[@value='Continue']");
		
		doSendkeys(firstName, "Anand");
		doSendkeys(lastName, "Singh");
		doSendkeys(email, "anandsingh@gmail.com");
		doSendkeys(phoneNumber, "9891464035");
		doSendkeys(pwd, "Anand");
		doSendkeys(conwd, "Anan");
		
//		driver.findElement(tnc).click();
//		driver.findElement(submit).click();
		
		doClick(tnc);
		doClick(submit);
		
		
		


	}
	
	public static WebElement getElement(By locator){
		return driver.findElement(locator);
	}
	
	public static void doSendkeys(By locator, String value){
		getElement(locator).sendKeys(value);
		}
	public static void doClick(By locator){
		getElement(locator).click();
	}


}
