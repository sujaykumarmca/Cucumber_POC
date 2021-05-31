package mystepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pagemanager.CartPage;
import pagemanager.CheckoutPage;
import pagemanager.HomePage;
import pagemanager.OrderConfirmationPage;
import pagemanager.OrderPlacementPage;
import pagemanager.PageObjectManager;
import pagemanager.ProductDetailPage;

public class Ecommerce_Steps
{
	static String user_dir;
	 WebDriver driver;
	
	 PageObjectManager page_manager_obj;
	 HomePage home_page;
	 ProductDetailPage prod_detail_page;
	 CartPage cart_page;
	 CheckoutPage checkout_page;
	 OrderPlacementPage orderplacement_page;
	 OrderConfirmationPage orderconfirm_page;
	 boolean flag=false;
	
	@Given("Login page is displayed")
	public void login_page_is_displayed() throws Throwable
	{
		user_dir=System.getProperty("user.dir"); 

		System.setProperty("webdriver.chrome.driver",user_dir+"\\src\\test\\resources\\Drivers\\chromedriver.exe"); 
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.navigate().to("https://www.saucedemo.com/");
	}
	
	
	  @And("^Enter username and password and click on login button$") 
	  public void  enter_username_as_and_password_and_click_on_login_button() throws Throwable
	  {
	  driver.findElement(By.id("user-name")).sendKeys("standard_user");
	  driver.findElement(By.id("password")).sendKeys("secret_sauce"); 
	  driver.findElement(By.id("login-button")).click();
	  
	  
	  }
	  
	  @Then("^Homepage should be displayed\\.$") 
	  public void  homepage_should_be_displayed() throws Throwable 
	  { 
		  
		  	page_manager_obj = new  PageObjectManager(driver); 
		  	home_page =page_manager_obj.get_HomePage(); home_page.navigateTo_HomePage();
	  
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
		  
		  driver.close();
	  }
	 
}
