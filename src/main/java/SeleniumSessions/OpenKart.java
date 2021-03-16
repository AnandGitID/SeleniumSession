package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenKart {
	
	WebDriver driver;
	@BeforeTest
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	

}}
