package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonFooterLink {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	
		
		List <WebElement> footerList= driver.findElements(By.xpath("//div[@class='navFooterVerticalColumn navAccessibility']//a"));
		System.out.println(footerList.size());
		
//		for (WebElement e: footerList){
//			String text=e.getText();
//			String url= e.getAttribute("href");
//			
//			System.out.println(text +  "-------->"+ url);
//		}
		
		for(int i=0; i<footerList.size(); i++){
			String flist=footerList.get(i).getText();
			//System.out.println(flist);
			String hrefList=footerList.get(i).getAttribute("href");
			//System.out.println(hrefList);
			
			System.out.println(flist+ "--->"+ hrefList);
		}
	}

}
