package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomXpathFunction {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		getLinkElement("Forgotten Password").click();
		
		Thread.sleep(4000);
		
		getLinkElement("Register");
		
		Actions act=new Actions (driver);
		act.click(getLinkElement("Register")).perform();

	}
	
	public static WebElement getLinkElement (String text){
		return driver.findElement(By.xpath("//a[text()='"+text+"']"));
	}
	public static WebElement getLinkElement (String tag, String text){
		return driver.findElement(By.xpath("//"+tag+"[text()='"+text+"']"));

}}
