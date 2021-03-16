package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleWithList {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		
		Set<String> handle=driver.getWindowHandles();
		
		List <String>handleList= new ArrayList <String> (handle);
		
		String parentWindowID= handleList.get(0);
		System.out.println("parent window ID is: " + parentWindowID);
		String childWindowID=handleList.get(1);
		System.out.println("child window ID is: " + childWindowID);
		
		
		driver.switchTo().window(childWindowID);
		
		System.out.println("child window title is " + driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindowID);
		
		System.out.println("parent window title is " + driver.getTitle());
		
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		
		Set <String> handle1= driver.getWindowHandles();
		
		List <String> handleList1=new ArrayList <String> (handle1);
		
		String parentwindowID1= handleList1.get(0);
		
		System.out.println("parent window ID is: " + parentwindowID1);
		String childwindowID1=handleList1.get(1);
		System.out.println("child window ID is: " + childwindowID1);
		
		
		driver.switchTo().window(childwindowID1);
		
		System.out.println("child window title is " + driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentwindowID1);
		
		System.out.println("parent window title is " + driver.getTitle());
		
		
		 driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
		 
		Set <String> handle2= driver.getWindowHandles();
		
		List <String> handleList2= new ArrayList <String> (handle2);
		
		String parentWindowID2= handleList2.get(0);
		
		System.out.println("parent window ID is: " + parentWindowID2);
		String childWindowID2= handleList2.get(1);
		System.out.println("child window ID is: " + childWindowID2);
		
		driver.switchTo().window(childWindowID2);
		
		System.out.println("child window title is " + driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindowID2);
		
		System.out.println("parent window title is " + driver.getTitle());
		
		driver.quit();
		
		
		
		
		
		
		
		

	}

}
