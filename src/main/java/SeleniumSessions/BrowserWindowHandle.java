package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();

		Set<String> handles = driver.getWindowHandles();

		Iterator<String> it = handles.iterator();

		String parenWindowID = it.next();

		System.out.println("parent window ID is: " + parenWindowID);

		String childWindowID = it.next();

		System.out.println("child window ID is: " + childWindowID);
		
		driver.switchTo().window(childWindowID);
		
		System.out.println("child window title is: " + driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parenWindowID);
		
		System.out.println("parent window title is: " + driver.getTitle());
		
		driver.quit();

	}

}
