package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementConcept {
   static WebDriver driver;
	

	public static void main(String[] args){
	
		WebDriverManager.chromedriver().setup();

	 driver = new ChromeDriver();
		 driver.get("https://demo.opencart.com/index.php?route=account/login");

		// locators (id)
		// create the element /perform the action

		// driver.findElement(By.id("input-email")).sendKeys("anandsingh@gmail.com");
		// //
		// driver.findElement(By.id("input-password")).sendKeys("asd@1234");

		// WebElement email = driver.findElement(By.id("input-email")); // 2nd
		// approach
		// WebElement password = driver.findElement(By.id("input-password"));
		//
		// email.sendKeys("anandsingh@gmail.com");
		// password.sendKeys("asd@12345");
		
		// by locators 3rd approach (object repository )

//		 By email = By.id("input-email");
//		 By password = By.id("input-password");
		 
		
		// WebElement emailid = driver.findElement(email);
		// WebElement pwd = driver.findElement(password);
		
		// emailid.sendKeys("anand@gmail.com");
		// pwd.sendKeys("asd@12345");

		// getElement(email).sendKeys("anand@gmail.com");
		// getElement(password).sendKeys("asd@12345");

		// 4th approach
		// getElement(email).sendKeys("anand@gmail.com");
		// getElement(password).sendKeys("asd@12345");

		// doSendkeys(email, "anand@gmail.com");
		// doSendkeys(password, "asd@12345");
		 
		 
		 By email = By.id("input-email");
		 By password = By.id("input-password");
		 By loginButton=By.xpath("//input[@value='Login']");
		 
		 doSendkeys(email, "anandsingh@gmail.com");
		 doSendkeys(password, "admin@123");
		 doClick(loginButton);
		 
		 
	}

		 public static WebElement getElement(By locator){
		 return driver.findElement(locator);
		 }
		
		 public static void doSendkeys(By locator, String value)
		 {
		 getElement(locator).sendKeys(value);
		 }
		 public static void doClick(By locator){
			 getElement(locator).click();
		 }
		 
		// second locator: name (id is always unique attribute) it is address of
		// the
		//driver.get("https://classic.crmpro.com/");
		// driver.findElement(By.name("username")).sendKeys("test@gmail.com");

		// 3. classname locator

		// 4. x path: x path is a locator not attribute
        // 5. css selector
		// 6. linktext
		//7. partial link text
		//8. tag name

	}


