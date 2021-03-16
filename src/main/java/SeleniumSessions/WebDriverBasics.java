package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\anandsingh\\Desktop\\chromedriver_win32\\chromedriver.exe");
	
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

}}
