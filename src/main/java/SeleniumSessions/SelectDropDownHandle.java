package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownHandle {
	
	static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/open-source/demo/");

		By industry = By.id("Form_submitRequest_Industry");
		WebElement indus_ele = driver.findElement(industry);

//		Select select = new Select(indus_ele);
//		select.selectByIndex(5);
//		select.selectByValue("Education");
//		select.selectByValue("health");
//
		By employee = By.id("Form_submitRequest_NoOfEmployees");
		WebElement empList = driver.findElement(employee);
//		Select select1 = new Select(empList);
//		select1.selectByValue("76 - 100");
//		select1.selectByVisibleText("401 - 450");
		
		
		doSelectByVisibleText(industry, "Education");
		doSelectByVisibleText(employee, "76 - 100");
		
		

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
    }
	
	public static void doSelectByVisibleText(By locator, String text){
		Select select = new Select(getElement(locator));
		select.selectByValue(text);
		
	}
	
	public static void doSelectByValue(By locator, String value){
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	
}
	public static void doSelectByIndex(By locator, int index){
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
		
	}
	
}
