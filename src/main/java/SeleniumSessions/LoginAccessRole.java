package SeleniumSessions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginAccessRole {
  static WebDriver driver;
	public static void main(String[] args) {
	
		//admin, seller, supplier, distributor, product manager, .... many logins
		
		WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		String admin_cred= getCredentialMap().get("seller");
		String un=admin_cred.split(":")[0];
		String pwd=admin_cred.split(":")[1];
		
		dologin(un, pwd);

	}
	
	public static void dologin(String un, String pwd){
		System.out.println(un + ":"+ pwd);
		By userName= By.id("input-email");
		By passWord=By.id("input-password");
		By loginBtn= By.xpath("//input[@value='Login']");
		
		driver.findElement(userName).sendKeys(un);
		driver.findElement(passWord).sendKeys(pwd);
		driver.findElement(loginBtn).click();
		
	}
	
	public static Map<String, String> getCredentialMap(){
		Map<String, String> credMap=new HashMap <String, String>();
		credMap.put("admin", "admin@gmail.com: admin123");
		credMap.put("seller", "seller@gmail.com: seller123");
		credMap.put("vendor", "vendor@gmail.com: vendor123");
		
		return credMap;
	}

}
