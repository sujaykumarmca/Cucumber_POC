package pagemanager;

import org.openqa.selenium.WebDriver;

public class PageObjectManager 
{
	private WebDriver driver;
	
	private CartPage cartpage;
	
	private HomePage homepage;
	
	private CheckoutPage checkout_page;
	
	private OrderPlacementPage final_order_page;
	
	private OrderConfirmationPage order_confrim_page;
	
	private ProductDetailPage prod_detail_page;
	
	//Constructor
	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Get HomePage
	public HomePage get_HomePage()
	{

		return (homepage == null) ? homepage = new HomePage(this.driver) : homepage;

	}
	
	//Product Detail Page()
	public ProductDetailPage get_Product_Detail_Page()
	{
		return (prod_detail_page == null) ? prod_detail_page = new ProductDetailPage(this.driver) : prod_detail_page;
	}
	
	//Cart Review Page
	public CartPage get_CartPage()
	{
		return (cartpage == null) ? cartpage = new CartPage(this.driver) : cartpage;
	}
	
	//Checkout Page
	public CheckoutPage get_checkout_Page()
	{
		return (checkout_page == null) ? checkout_page = new CheckoutPage(this.driver) : checkout_page;
	}
	
	//Order Placement Page
	
	public OrderPlacementPage get_Order_Placement_Page()
	{
		return (final_order_page == null) ? final_order_page = new OrderPlacementPage(this.driver) : final_order_page;
	}

	
	//Order Confirmation Page
	public OrderConfirmationPage get_Order_Confirmation_page()
	{
		return (order_confrim_page == null) ? order_confrim_page = new OrderConfirmationPage(driver) : order_confrim_page;
	}
}
