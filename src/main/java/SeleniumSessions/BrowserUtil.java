package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * This class is having different generic methods related to browser
 * @author AnandSingh
 *
 */

public class BrowserUtil {

	
	WebDriver driver;

	/**
	 * This method returns webdriver refrence
	 */
	public WebDriver launchBrowser(String browserName) {

		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		default:
			System.err.println("Browser is not present");
			break;
		}

		return driver;
	}
/**
 * This method is used to enter the url in browser
 * @param url
 */
	public void launchUrl(String url) {
    System.out.println("url is : "+ url);
		if (url.isEmpty()) {
			System.out.println("url is blank: " + url);
			return;
		}

		driver.get(url);
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public String getPageUrl() {
		return driver.getCurrentUrl();
	}

	public void quitBrowser() {
		driver.quit();
	}

	public void closeBrowser() {
		driver.close();

	}}

