package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitConcept {
static WebDriver driver;
	public static void main(String[] args) {
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.opencart.com/index.php?route=account/login");
			By email=By.id("input-email");
			By pwd=By.id("input-password");
			By submit=By.xpath("//input[@value='Login']");
			
//			WebDriverWait wait=new WebDriverWait(driver, 10, 2);
//			WebElement emailEle= wait.until(ExpectedConditions.presenceOfElementLocated(email));
//		emailEle.sendKeys("anandsingh@gmail.com");
//			waitForPresenceOfElement(email, 10).sendKeys("anandsingh@gmail.com");
			
//			By rightPanelLinks=By.cssSelector(".list-group a");
//			waitForPresenceOfAllElement(rightPanelLinks, 10).stream().forEach(ele->System.out.println(ele.getText()));
			
		//	By submit1=By.xpath("//input[@value='Login']");
			
//			WebDriverWait wait=new WebDriverWait(driver, 10);
//			WebElement submit2=wait.until(ExpectedConditions.elementToBeClickable(submit1));
//			submit2.click();
			By logo=By.xpath("//a[text()='Your Store']");
			boolean logotext = waitForelementTexttobe(logo, 10, "Your Store");
			System.out.println(logotext);
			
			driver.findElement(By.xpath("(//a[text()='Forgotten Password'])[2]")).click();
			
			boolean urltext = waitForUrlToBe("forgotten", 10);
			System.out.println(urltext);
			
			System.out.println("------------------------------");
			
			boolean eleCheck = waitForElementToBeSelected(submit, 10);
			
			System.out.println(eleCheck);

	}
	
	public static WebElement waitForPresenceOfElement(By locator, long timeout){
		WebDriverWait wait=new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	public static WebElement waitForVisiblityOfElement(By locator, long timeout){
		WebElement ele=driver.findElement(locator);
		WebDriverWait wait=new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	public static List<WebElement> waitForPresenceOfAllElement(By locator, long timeout){
		
		WebDriverWait wait=new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	
	public static boolean waitForelementTexttobe(By locator, int timeout, String value){
		WebDriverWait wait=new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.textToBe(locator, value));
		
	}
	
	public static boolean waitForUrlToBe(String url, int timeout){
		WebDriverWait wait=new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.urlContains(url));
	}
	public static boolean waitForElementToBeSelected(By locator, int timeout){
		WebDriverWait wait=new WebDriverWait(driver, timeout);
	return  wait.until(ExpectedConditions.elementToBeSelected(locator));

}}
