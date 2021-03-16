package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		    By rightMenu= By.xpath("//span[@class='context-menu-one btn btn-neutral']");
		    WebElement rightClickMenu=driver.findElement(rightMenu);
		    
		    Actions act=new Actions (driver);
		    act.contextClick(rightClickMenu).perform();
		    
		   List<WebElement> rightClickMenus = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']//span"));
		   
		   for (WebElement e: rightClickMenus){
			   System.out.println(e.getText());
			   
			   if(e.getText().equals("Copy")){
				   e.click();
				   break;
			   }
			   driver.quit();
		   }
		

	}

}
