package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://mrbool.com/search/");
		
		By content= By.xpath("//a[@class='menulink']");
		WebElement content1=driver.findElement(content);
		
		Actions act=new Actions (driver);
		
		act.moveToElement(content1).perform();
		
		Thread.sleep(3000);
	    By course=By.linkText("COURSES");
	    
	    WebElement course1=driver.findElement(course);
	    
	    course1.click();
	
}

	public static  WebElement getElement(By locator) {
		return driver.findElement(locator);

	}
	
	public static void doMoveToElement(By locator){
		Actions act=new Actions (driver);
		act.moveToElement(getElement(locator)).perform();
	}

}
