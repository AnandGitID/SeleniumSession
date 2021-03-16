package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVSCloseConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anandsingh\\Desktop\\chromedriver_win32\\chromedriver.exe");
		
        WebDriver driver= new ChromeDriver();
        
        driver.get("https://www.google.com");
        
       String pagetitle = driver.getTitle();
      System.out.println("page title is : " + pagetitle);
      
      driver.quit();
      
      driver= new ChromeDriver(); // after quit or close you have to again initialize your driver
      driver.get("https://www.google.com");
      
     System.out.println(driver.getTitle()); //no such session exception : sesssion id is null
	}

}
