package pagemanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage 
{

	WebDriver driver=null;
	
	@FindBy(xpath="//span[@class='title'][text()='Checkout: Your Information']")
	WebElement checkout_page_title;
	
	@FindBy(id="first-name")
	WebElement first_name;
	
	@FindBy(id="last-name")
	WebElement last_name;
	
	@FindBy(id="postal-code")
	WebElement postal_code;
	
	@FindBy(id="continue")
	WebElement continue_button;
	
	
	//constructor
		public CheckoutPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(this.driver, this);
		}
		
		public void set_Checkout_Data()
		{
			first_name.sendKeys("sujay");
			last_name.sendKeys("kumar");
			postal_code.sendKeys("55409");
		}
		
		public void go_TO_Order_Placement_Page()
		{
			continue_button.click();
		}
		
		public boolean checkout_page_is_displayed_or_not()
		{
			boolean flag=false;
			if(checkout_page_title.isDisplayed())
			{
				flag=true;
			}
			return flag;
		}
		
}
