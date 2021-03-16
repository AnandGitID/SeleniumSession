package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FooterLinkFreshWorks {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		
//		List<WebElement> freshLinks =driver.findElements(By.xpath("(//ul[@class='footer-nav'])[1]//a"));
//		
//		for(WebElement e: freshLinks){
//			System.out.println(e.getText());
//		} 
		
		int colmCount= driver.findElements(By.xpath("//ul[@class='footer-nav']")).size();
		
		
		for(int i=1; i<=colmCount ;i++){
			List<WebElement> freshFooterLinks = driver.findElements(By.xpath("(//ul[@class='footer-nav'])["+i+"]//a"));
			
			
			for (WebElement e: freshFooterLinks){
				System.out.println(e.getText());
			}
		}

	}

}
