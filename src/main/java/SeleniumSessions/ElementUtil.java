package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {
	WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);

	}
	public  List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public void doSendkeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public String doGetElement(By locator) {
		return getElement(locator).getText();
	}

	public boolean doisDisplayed(By locator) {
		return getElement(locator).isDisplayed();

	}
	

	public  void doLinkClick(By locator, String value) {

		List<WebElement> linkslist = getElements(locator);

		System.out.println("total no of links : " + linkslist.size());

		for (WebElement e : linkslist) {
			String text = e.getText();
			System.out.println(text);

			if (text.equals(value)) {
				e.click();
				break;
			}}}
	
  //******************************************Dropdown utils
	
	public  void doSelectByVisibleText(By locator, String text){
		Select select = new Select(getElement(locator));
		select.selectByValue(text);
		
	}
	
	public  void doSelectByValue(By locator, String value){
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	
}
	public  void doSelectByIndex(By locator, int index){
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
		
	}
	
	public  List <String > getDropdownoptionsList(By locator){
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
// this method is used to select the dropdown without select class
	
	public  void doSelectByTextOption(By locator, String text) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionList = select.getOptions();

		for (WebElement e : optionList) {

			if (e.getText().contains("text")) {
				e.click();
				break;
			}}}
			
			public  void doselectDropDownWithoutSelectClass(By locator, String value) {
				
				List<WebElement> optionlist = getElements(locator);
				
				 for (WebElement e: optionlist){
					 
					 if (e.getText().equals("value")){
						 e.click();
						 break;
					 }
				
}}}
