package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		// JavaScriptPopUpHandle or Alert
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(4000);
		
		Alert alert=driver.switchTo().alert();
		
		String alerttext= alert.getText();
		
		System.out.println(alerttext);
		
		alert.accept();
		
		driver.switchTo().defaultContent();
		
		String defaultTitle= driver.getTitle();
		System.out.println(defaultTitle);
		
		

		

	}

}
