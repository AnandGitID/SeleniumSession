package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextFieldElements {
static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		By regForm=By.xpath("//input[@class='form-control']");
		By loginLink=By.linkText("Login");
		
		ElementUtil eleUtil=new ElementUtil(driver);
		List <WebElement> formList=eleUtil.getElements(regForm);
		
		if (eleUtil.doisDisplayed(loginLink)){
			System.out.println("login link is present");
		}
		
		if (eleUtil.getElements(loginLink).size()==1){
			System.out.println("login is present");
		};
		
		
		if (formList.size()==6){
			System.out.println("yes fields are present");
		}
		for (WebElement e: formList){
			e.sendKeys("testing");
		}


	}
}
