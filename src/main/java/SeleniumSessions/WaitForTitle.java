package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForTitle {

	static WebDriver driver;
	public static void main(String[] args) {
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
//			
//			WebDriverWait wait=new WebDriverWait(driver, 10);
//			Boolean title=wait.until(ExpectedConditions.titleContains("Rediff"));
//			System.out.println(title);
//			System.out.println(driver.getTitle());
			
			
			String title=waitFortitleContains("Red", 10);
			System.out.println(title);
			
			
			String title1=waitFortitle("Rediffmail", 10);
			System.out.println(title1);
			

	}
	
	public static String waitFortitleContains(String title, long timeout){
		WebDriverWait wait=new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();
		
	}
	
	public static String waitFortitle(String title, long timeout){
		WebDriverWait wait=new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.titleIs(title));
		return driver.getTitle();

}
	
}
