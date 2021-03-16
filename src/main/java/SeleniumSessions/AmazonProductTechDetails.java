package SeleniumSessions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonProductTechDetails {

	public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.in/dp/B08RSWTH32/ref=gwdb_bmc_0_M02s?pf_rd_s=merchandised-search-6&pf_rd_t=Gateway&pf_rd_i=mobile&pf_rd_m=A1VBAL9TL5WCBF&pf_rd_r=GYHDT2KJDEB6HC1FTKGQ&pf_rd_p=282996c8-e914-46f6-8cf4-838309dae510");

  int rowCount= driver.findElements(By.xpath("//table[@id='productDetails_techSpec_section_1']//tr")).size();
  
  System.out.println(rowCount);
  
 String headerXpath=  "//table[@id='productDetails_techSpec_section_1']//tr/th";
  //table[@id='productDetails_techSpec_section_1']//tr/td
  String tableData="//table[@id='productDetails_techSpec_section_1']//tr/th/following-sibling::td";
  
    List <WebElement> headerList= driver.findElements(By.xpath(headerXpath));
     List <WebElement> tableList =driver.findElements(By.xpath(tableData));
     
     Map<String, String> techDetails= new HashMap<String, String> ();
     
     for (int i=0; i<rowCount; i++){
    	 String productName= headerList.get(i).getText();
    	 String proSpec=tableList.get(i).getText();
    	 techDetails.put(productName, proSpec);
     }
          
       System.out.println(techDetails.get("OS"));
         
         
  

	}

}
