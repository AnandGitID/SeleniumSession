package SeleniumSessions;

import org.openqa.selenium.By;

public class CartPage {
	
	public CartPage (){}
	
	private By cartbutton=By.id("cart");


	public void clickonCart()
	{
		System.out.println("clic on cart" + cartbutton);
	}
}
