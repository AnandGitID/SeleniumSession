package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLanguageList {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/?gws_rd=ssl");

		 List <WebElement> langlist=
		 driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		
		 System.out.println("total no of links : " + langlist.size());
		
		 for(int i=0; i<langlist.size(); i++){
		 String text=langlist.get(i).getText();
		 System.out.println(text);
		
		 if(langlist.equals("मराठी")){
			 langlist.get(i).click();
		 }

		// for(WebElement e: langlist){
		// String text= e.getText();
		// System.out.println(text);
		//
		// if(text.equals("मराठी")){
		// e.click();
		// break;

//		By langLinks = By.xpath("//div[@id='SIvCob']/a");
//
////		doLinkClick(langLinks, "मराठी");
////	}
//
//	public static List<WebElement> getElements(By locator) {
//		return driver.findElements(locator);
//	}
//
//	public static void doLinkClick(By locator, String value) {
//
//		List<WebElement> langlist = getElements(locator);
//
//		System.out.println("total no of links : " + langlist.size());
//
//		for (WebElement e : langlist) {
//			String text = e.getText();
//			System.out.println(text);
//
//			if (text.equals(value)) {
//				e.click();
//				break;
			}
		}
	}

