package dataProviders;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import enums.Context;
import pagemanager.CartPage;
import pagemanager.CheckoutPage;
import pagemanager.HomePage;
import pagemanager.Login;
import pagemanager.OrderConfirmationPage;
import pagemanager.OrderPlacementPage;
import pagemanager.PageObjectManager;
import pagemanager.ProductDetailPage;

public class Ecommerce_Steps_V2_Impl_TestContext
{
	static String user_dir;
	 WebDriver driver;
	 
	 //TestContext Object
	 TestContext testContext;
	
	 Login login_obj;
	 PageObjectManager page_manager_obj;
	 HomePage home_page;
	 ProductDetailPage prod_detail_page;
	 CartPage cart_page;
	 CheckoutPage checkout_page;
	 OrderPlacementPage orderplacement_page;
	 OrderConfirmationPage orderconfirm_page;
	 WebDriverManager web_driver_manager;
	 boolean flag=false;
	 ScenarioContext scenario_obj;	 
	 
	 //Constructor
	 public Ecommerce_Steps_V2_Impl_TestContext(TestContext context)
	 {
		 testContext = context;
		 web_driver_manager=testContext.getWebDriverManager();
		 page_manager_obj=testContext.getPageObjectManager();
		 scenario_obj=testContext.getScenarioContext();
		 scenario_obj.setContext(Context.PRODUCT_NAME, context);
		 
	 }
	
	@Given("Login page is displayed")
	public void login_page_is_displayed() throws Throwable
	{
		login_obj= page_manager_obj.go_To_Login();
	}
	
	
	  @And("^Enter username and password and click on login button$") 
	  public void  enter_username_as_and_password_and_click_on_login_button() throws Throwable
	  {
		  
		  login_obj.login("standard_user", "secret_sauce");  
	  }
	  
	  @Then("^Homepage should be displayed\\.$") 
	  public void  homepage_should_be_displayed() throws Throwable 
	  { 
		  
		  	flag=false;
		  	home_page=page_manager_obj.get_HomePage();

		  	flag=home_page.is_dropdown_dispalyed_or_not();
		  	if(flag)
		  	{
		  		System.out.println("Products are Displayed");
		  	}
		  	else
		  	{
		  		System.out.println("Products are NOT displayed");
		  	}
	  }
	  
	  @Given("^In homepage Click on \"([^\"]*)\" image link$") 
	  public void in_homepage_Click_on_image_link(String arg1) throws Throwable 
	  {
		  home_page.go_To_Product_Detail_Page(); 
	  }
	  
	  @Then("^Navigate to product detail page$") 
	  public void navigate_to_product_detail_page() throws Throwable 
	  {
		  prod_detail_page=page_manager_obj.get_Product_Detail_Page(); 
	  }
	  
	  @Then("^In Product detail page Click on Add to Cart button$") 
	  public void in_Product_detail_page_Click_on_Add_to_Cart_button() throws Throwable 
	  {
		  prod_detail_page.add_product_To_Cart(); 
	  }
	  
	  @Then("^Product should be added to cart$") 
	  public void  product_should_be_added_to_cart() throws Throwable
	  {
		 home_page.click_on_cart_link();
	}
	  
	  @Then("^Click on Cart page link$") 
	  public void click_on_Cart_page_link()  throws Throwable
	  { 
		  cart_page=page_manager_obj.get_CartPage(); 
	}
	  
	  @Then("^Cart Page should be displayed$") 
	  public void  cart_Page_should_be_displayed() throws Throwable 
	  {
	  
		  flag=false; 
		  flag=cart_page.check_grid_displayed_or_not(); 
		  if(flag)
		  {
			  System.out.println("Cart Page displays Grid"); 
		  } 
	}
	  
	  @Then("^Click on checkout button$") 
	  public void click_on_checkout_button() throws Throwable 
	  { 
		  cart_page.go_To_Checkout_page();
	  }
	  
	  @Then("^Checkout page is displayed$") 
	  public void checkout_page_is_displayed() throws Throwable 
	  {
	 	checkout_page=page_manager_obj.get_checkout_Page();
	 	flag=checkout_page.checkout_page_is_displayed_or_not();
	 		if(flag)
	 		{
	 		  System.out.println("Checkout Page is displayed");
	 		}
	  
	  }
	  
	  @Then("^In checkout page Enter username as \"([^\"]*)\" and lastName as \"([^\"]*)\" and zipcode as \"([^\"]*)\"$")
	  public void  in_checkout_page_Enter_username_as_and_lastName_as_and_zipcode_as(String arg1, String arg2, String arg3) throws Throwable
	  {
		  checkout_page.set_Checkout_Data();
	  
	  }
	  
	  @When("^Click on Finish button$") 
	  public void click_on_finish_button() throws Throwable 
	  { 
		  checkout_page.go_TO_Order_Placement_Page();
		  orderplacement_page=page_manager_obj.get_Order_Placement_Page();
		  System.out.println("Order Placemenet Page::"+orderplacement_page.get_summary_total()); 
		  orderplacement_page.goTo_Order_Confirmation_Page();
	}
	  
	  
	  @Then("^In order placement page check for thankyou message$")
	  public void in_order_placement_page_check_for_thankyou_message() throws Throwable 
	  {
		  orderconfirm_page=page_manager_obj.get_Order_Confirmation_page();
		  System.out.println(orderconfirm_page.get_order_Confirmation_msg());
		  
		  web_driver_manager.closeDriver();
	  }
	 
}
