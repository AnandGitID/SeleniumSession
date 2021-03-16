package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleWithOutSelect {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/open-source/demo/");
		
		By country_option= By.xpath("//select[@id='Form_submitRequest_Country']/option");
		
		 List<WebElement> country_list = driver.findElements(country_option);
		 
		 doselectDropDownWithoutSelectClass(country_option, "Cuba");
		
		 for (WebElement e: country_list){
			 
			 if (e.getText().equals("Albania")){
				 e.click();
				 break;
			 }
		 }
		 
		}

	public static void doselectDropDownWithoutSelectClass(By locator, String value) {
		
		List<WebElement> optionlist = driver.findElements(locator);
		
		 for (WebElement e: optionlist){
			 
			 if (e.getText().equals("value")){
				 e.click();
				 break;
			 }
}}}
