package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDropConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		      By sourcerpath=By.id("draggable");
		      By destinationpath=By.id("droppable");
		      
		     WebElement srcfile= driver.findElement(sourcerpath);
		     WebElement destinationfile= driver.findElement(destinationpath);
		     
	    Actions act=new Actions(driver);
//		    act.clickAndHold(srcfile).moveToElement(destinationfile).release().build().perform();
		    
		    
		    act.dragAndDrop(srcfile, destinationfile).perform();
		

	}

}
