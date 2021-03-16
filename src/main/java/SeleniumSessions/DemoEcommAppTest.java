package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoEcommAppTest {

	public static void main(String[] args) {
		
		BrowserUtil br=new BrowserUtil ();
		WebDriver driver=br.launchBrowser("chrome");
	br.launchUrl("https://demo.opencart.com/index.php?route=account/login");
		String title=br.getPageTitle();
		System.out.println(title);
		
		 By email = By.id("input-email");
		 By password = By.id("input-password");
		 By loginButton=By.xpath("//input[@value='Login']");
		By yourStoreLink= By.linkText("Your Store");
		 
		 ElementUtil eleUtil= new ElementUtil(driver);
		 eleUtil.doSendkeys(email, "anandsingh@futuresoftindia.com");
		 eleUtil.doSendkeys(password, "asd@12345");
		 eleUtil.doClick(loginButton);
		 
		String myAccountTitle= br.getPageTitle();
		System.out.println(myAccountTitle);
		
		br.closeBrowser();
		
	
	}}
