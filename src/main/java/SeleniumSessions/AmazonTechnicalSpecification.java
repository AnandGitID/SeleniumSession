package SeleniumSessions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTechnicalSpecification {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver ();
		driver.get("https://www.amazon.in/dp/B08T2NBQRH?pf_rd_r=4XDTSNVGA2D3G6TQZ1W5&pf_rd_p=68bbedeb-223b-41ee-9002-b010bc2f1f53");
		
		
		
		List <WebElement> headerList=driver.findElements(By.xpath("//table[@id='productDetails_techSpec_section_1']//th"));
		List <WebElement> techList=driver.findElements(By.xpath("//table[@id='productDetails_techSpec_section_1']//td"));
		
//		for (WebElement e: headerList){
//			System.out.println(e.getText());
//		}
//		
//		for (WebElement e1: techList){
//			System.out.println(e1.getText());
//		}
		
       Map<String, String> proMap= new HashMap <String, String>();
       
       if (headerList.size()==techList.size()){
    	   
    	   for (int i=0; i<headerList.size(); i++){
    		   proMap.put(headerList.get(i).getText(), techList.get(i).getText()) ;
    	   }
    	   
    	   for( Entry<String, String> entry: proMap.entrySet()){
    		   System.out.println(entry.getKey()+ ":" + entry.getValue());
    	   }
       }
		
	



	}}


