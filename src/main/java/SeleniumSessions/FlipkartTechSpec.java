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

public class FlipkartTechSpec {
		
			static WebDriver driver;
				public static void main(String[] args) {
					WebDriverManager.chromedriver().setup();
					WebDriver driver=new ChromeDriver ();
							
		driver.get("https://www.flipkart.com/poco-m3-power-black-128-gb/p/itm7396538c49897?pid=MOBFZTCUKKJEYTR4&lid=LSTMOBFZTCUKKJEYTR4CKO2X7&marketplace=FLIPKART&srno=b_1_1&otracker=hp_bannerads_1_3.bannerAdCard.BANNERADS_Alt_RSWLHPL0A04N&fm=organic&iid=8524dd5f-18fd-4c9d-9edd-d638fcb5fa22.MOBFZTCUKKJEYTR4.SEARCH&ppt=hp&ppn=homepage&ssid=toez82vb400000001614058995444");
					
			List <WebElement> headerList=driver.findElements(By.xpath("//table[@class='_14cfVK']//tr"));
			List <WebElement> dataList=driver.findElements(By.xpath("//table[@class='_14cfVK']//tr//following-sibling::td"));
			
			Map <String, String> proMap= new HashMap <String, String>();
			
			if (headerList.size()==dataList.size()){
				for (int i=0; i< headerList.size(); i++){
					proMap.put(headerList.get(i).getText(), dataList.get(i).getText());
				}
				
				 
		    	   for( Map.Entry<String, String> entry: proMap.entrySet()){
		    		   System.out.println(entry.getKey()+ ":" + entry.getValue());
		    	   }
			}
			

	}

}
