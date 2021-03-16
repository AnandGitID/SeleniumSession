package SeleniumSessions;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListWithStreams {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver ();
		driver.get("https://www.amazon.in");
		
		List <WebElement > linksList=driver.findElements(By.tagName("a"));
		System.out.println(linksList.size());
		//linksList.stream().forEach(ele-> System.out.println(ele.getText()));
		
	List <String> amazonList=linksList.stream().filter(ele->!ele.getText().isEmpty()).map(ele-> ele.getText()).collect(Collectors.toList());
	amazonList.stream().forEach(ele->System.out.println(ele));
	
	

	}

}
