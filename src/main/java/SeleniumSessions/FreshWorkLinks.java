package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FreshWorkLinks {

	
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			
			By amazonFooterLink=By.xpath("//div[@class='navFooterVerticalColumn navAccessibility']//a");
			
			doClick(amazonFooterLink, "Amazon Cares");
			}
		
		public static List<WebElement> getElements(By locator){
			return driver.findElements(locator);
			
		}
			
		public static void doClick(By locator, String value){
			List<WebElement>footerLink=getElements(locator);
			for(WebElement e: footerLink){
				String text=e.getText();
				System.out.println(text);

				if(text.equals(value)){
					e.click();
					break;
			
			
		}}}}
	
		
	


