package TestngSessions;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BMOrangeCRM {
	WebDriver driver;
	@BeforeMethod
	
	public void setUp(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/open-source/demo/");
	}
	
	@Test(priority=1)
	public void getTitle(){
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	@Test(priority=2)
	public void topLinks(){
	List<WebElement> links =driver.findElements(By.xpath("//ul[@class='nav navbar-nav navbar-left default-nav']//a"));
	System.out.println(links.size());
	if (links.size()==6){
		System.out.println("correct links are present");
	}}
	
	@Test(priority=3)
	public void formSubmit(){
		driver.findElement(By.id("Form_submitRequest_FirstName")).sendKeys("Anand");
		driver.findElement(By.id("Form_submitRequest_LastName")).sendKeys("Singh");
		driver.findElement(By.id("Form_submitRequest_CompanyName")).sendKeys("FS");
		WebElement indus_name=driver.findElement(By.name("Industry"));
		Select select=new Select(indus_name);
		select.selectByValue("Automotive");
		driver.findElement(By.id("Form_submitRequest_JobTitle")).sendKeys("QA Dept");
		driver.findElement(By.id("Form_submitRequest_Email")).sendKeys("anandsingh@futuresoftindia.com");
		driver.findElement(By.id("Form_submitRequest_Phone")).sendKeys("9891464035");
		WebElement emp_no=driver.findElement(By.id("Form_submitRequest_No_of_Employees"));
		Select select1=new Select(emp_no);
		select1.selectByIndex(4);
		WebElement country_name=driver.findElement(By.id("Form_submitRequest_Country"));
		Select select2=new Select(emp_no);
		select2.selectByIndex(3);
		WebElement state_name=driver.findElement(By.id("Form_submitRequest_State"));
		Select select3=new Select(emp_no);
		select3.selectByIndex(2);
		
		}
	@Test(priority=4)
	public void privacyTest(){
		boolean b=driver.findElement(By.xpath("//a[text()='Privacy Policy']")).isDisplayed();
		System.out.println(b);
	}
	
	@Test(priority=5)
	public void privacyPageTest(){
		driver.findElement(By.xpath("//a[text()='Privacy Policy']")).click();
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWindowID= it.next();
		System.out.println(parentWindowID);
		String childtWindowID= it.next();
		System.out.println(childtWindowID);
		
		driver.switchTo().window(childtWindowID);
		String childTitle=driver.getTitle();
		System.out.println(childTitle);
		driver.switchTo().window(parentWindowID);
		String parentTitle=driver.getTitle();
		System.out.println(parentTitle);
	}


	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
