package SeleniumSessions;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderHandle {
  static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("datepicker")).click();
		
		By calender=By.cssSelector(".ui-datepicker-calendar tr a");
		selectDay(calender, "20");
		
		
		
	//	driver.findElement(By.xpath("//a[text()='15']")).click();
		
		//selectDay("20");
		
		//List <WebElement> daysList=driver.findElements(By.cssSelector(".ui-datepicker-calendar tr a"));
		
//		for (WebElement e: daysList){
//			String date=e.getText();
//			System.out.println(date);
//			
//			if (date.contains("17")){
//				e.click();
//				break;
//			}
//		}
//		
		
	}
	
	public static void selectDay(String day){
		
		driver.findElement(By.xpath("//a[text()='"+day+"']")).click();
	}
	
	public static void selectDay(By locator, String Day){

		List <WebElement> daysList=driver.findElements(locator);
		
		for (WebElement e: daysList){
			String date=e.getText();
			System.out.println(date);
			
			if (date.contains(Day)){
				e.click();
				break;
			}
	}

}}
