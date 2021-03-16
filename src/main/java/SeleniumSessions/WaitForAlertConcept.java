package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForAlertConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			
			driver.findElement(By.name("proceed")).click();
			
//			WebDriverWait wait=new WebDriverWait(driver, 10);
//			Alert alert=wait.until(ExpectedConditions.alertIsPresent());
//			System.out.println(alert.getText());
//			alert.accept();
			
			String text= getAlertText(10);
			System.out.println(text);
			acceptAlert (10);

	}
	
	public static Alert waitForAlertPresent(long timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.alertIsPresent());
	}

	public static String getAlertText(long timeout) {
		return waitForAlertPresent(timeout).getText();
	}
	

	public static void acceptAlert (long timeout) {
		waitForAlertPresent(timeout).accept();
	}
	
	public static void dismissAlert (long timeout) {
		waitForAlertPresent(timeout).dismiss();

}}
