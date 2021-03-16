package SeleniumSessions;

public class AmazonPageTest {

	public static void main(String[] args) {
		
		String browserName="chrome";
		
		BrowserUtil br=new BrowserUtil();
		br.launchBrowser(browserName);
		br.launchUrl("https://www.amazon.in/");
		
	         String title=br.getPageTitle();
	         System.out.println(title);
		
	         if (title.contains("Shop Online")){
	        	 System.out.println("title is correct");
	         }
	         else {
	        	 System.out.println("title is incorrect"); 
	         }
	         
	        String url = br.getPageUrl();
	        System.out.println(url);
	        
	        if (url.contains("amazon")){
	        	System.out.println("correct url");
	        }
	        else {
	        	System.out.println("incorrect url");
	        }
	        
	        br.closeBrowser();
		
}}
