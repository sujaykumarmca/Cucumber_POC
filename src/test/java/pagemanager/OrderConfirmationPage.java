package pagemanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmationPage 
{
	WebDriver driver=null;
	
	@FindBy(xpath="//h2[@class='complete-header']")
	private WebElement confirmation_msg;
	
	@FindBy(xpath="//button[@id='back-to-products']")
	private WebElement back_to_Home_button;
	
	//constructor
	public OrderConfirmationPage(WebDriver driver)
	{
			this.driver=driver;
			PageFactory.initElements(this.driver, this);
	}
	
	public String get_order_Confirmation_msg()
	{
		String str=null;
		str=confirmation_msg.getText();
		System.out.println("Confirmation Msg Displayed is::"+str);
		return str;
	}
	
	public boolean navigate_To_HomePage()
	{
		boolean flag=false;
		
		if(back_to_Home_button.isDisplayed())
		{
			back_to_Home_button.click();
			flag=true;
		}
		
		return flag;
	}
	
}
