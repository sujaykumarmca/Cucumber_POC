package pagemanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPlacementPage 
{
	WebDriver driver=null;
	
	@FindBy(xpath="//div[@class='cart_list']")
	WebElement cart_list_displayed_or_not;
	
	@FindBy(xpath = "//div[@class='summary_value_label'][1]")
	WebElement card_info;
	
	@FindBy(xpath= "//div[@class='summary_total_label']")
	WebElement summary_total;
	
	@FindBy(id="finish")
	WebElement finish_button;
	
	//constructor
	public OrderPlacementPage(WebDriver driver)
	{
			this.driver=driver;
			PageFactory.initElements(this.driver, this);
	}
	
	//Get Card Info
	public String get_Card_info()
	{
		String str=null;
		str=card_info.getText();
		System.out.println("Card info::"+str);
		return str;
	
	}
	
	//Get Summary Total
	public String get_summary_total()
	{
		String str=null;
		str=summary_total.getText();
		System.out.println("Summary Total::"+str);
		return str;
	}
	
	public void goTo_Order_Confirmation_Page()
	{
		if(finish_button.isDisplayed())
		{
			finish_button.click();
		}
	}
	
}
