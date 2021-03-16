package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownoptionsHandle {

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

			Select select=new Select(emp_ele);
			List<WebElement> emp_list = select.getOptions();
			System.out.println(emp_list.size());
			
			for(WebElement e: emp_list){
				System.out.println(e.getText());
				
			}
				Select select1=new Select(indus_ele);
				List<WebElement> indusOptions = select1.getOptions();
				System.out.println(indusOptions.size());
				for (int i=0; i<indusOptions.size(); i++){
					System.out.println(indusOptions.get(i).getText());
					
					
				}
				
				List <String> indus_list= getDropdownoptionsList(industry);
				System.out.println(indus_list.contains("Electronics"));
				System.out.println(indus_list.contains("Automotive"));
				System.out.println(indus_list.contains("Healthcare"));
				System.out.println(indus_list.contains("IT"));
	
	}
		
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
    }
	
	public static List <String > getDropdownoptionsList(By locator){
		Select select=new Select (getElement(locator));
		List <String> optionsTextList= new ArrayList <String>();
		List<WebElement> OptionsList = select.getOptions();
		System.out.println(OptionsList.size());
		System.out.println(OptionsList.size());
		
		for(WebElement e: OptionsList){
			System.out.println(e.getText());
			optionsTextList.add(e.getText());
			
		}
		return optionsTextList;
	}	
	}


