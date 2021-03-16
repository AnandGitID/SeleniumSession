package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
        
        driver.get("https://www.google.com");
        
       String pagetitle = driver.getTitle();
      System.out.println("page title is : " + pagetitle);
      
      if (pagetitle.equals("Google")){
   	   
   	   System.out.println("correct page title");
      }
      else {
   	   System.out.println("incorrect title");
      }
		
		
	}

}
