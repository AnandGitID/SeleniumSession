package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\anandsingh\\Desktop\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
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


