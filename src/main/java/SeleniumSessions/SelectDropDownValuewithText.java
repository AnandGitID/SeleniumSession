package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownValuewithText {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/open-source/demo/");

		By industry = By.id("Form_submitRequest_Industry");
		WebElement indus_ele = driver.findElement(industry);

		By employee = By.id("Form_submitRequest_NoOfEmployees");
		WebElement emp_ele = driver.findElement(employee);

		Select select = new Select(indus_ele);
		List<WebElement> indus_list = select.getOptions();

		for (WebElement e : indus_list) {

			if (e.getText().contains("Healthcare")) {
				e.click();
				break;
			}
			doSelectByTextOption(employee, "401 - 450");
		}
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSelectByTextOption(By locator, String text) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionList = select.getOptions();

		for (WebElement e : optionList) {

			if (e.getText().contains("text")) {
				e.click();
				break;
			}

		}
	}
	
	
}
