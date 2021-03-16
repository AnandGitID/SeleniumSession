package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomCSS {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login?");
		
		By loginForm= By.cssSelector("input#username, input#password,button#loginBtn,footer.copyright");
		int ele=driver.findElements(loginForm).size();
		System.out.println(ele);
		

	}

}
