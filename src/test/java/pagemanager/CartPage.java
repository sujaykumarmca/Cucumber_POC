package pagemanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage
{
	WebDriver driver=null;
	
	@FindBy(className="cart_desc_label")
	private WebElement description_tag;
	
	@FindBy(xpath = "//div[@class='cart_item']")
	private WebElement cart_items_grid;
	
	@FindBy(className = "btn btn_secondary btn_small cart_button")
	private WebElement remove_link;
	
	@FindBy(id="continue-shopping")
	private WebElement continue_shopping;
	
	@FindBy(id="checkout")
	private WebElement checkout_button;
	

	//constructor
	public CartPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	}
	
	//In cart page check cart grid is displayed or not
	public boolean check_grid_displayed_or_not()
	{
		boolean flag=false;
		if(cart_items_grid.isDisplayed())
		{
			flag=true;
		}
		return flag;
	}
	
	//Check for continue shopping button link
	
	public boolean check_continue_button()
	{
		boolean flag=false;
		if(continue_shopping.isDisplayed())
		{
			flag=true;
		}
		return flag;
	}
	
	
	public void go_To_Checkout_page()
	{
		boolean flag=false;
		checkout_button.click();
	}
		
	

}
