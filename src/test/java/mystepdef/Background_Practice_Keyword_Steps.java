
package mystepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import  cucumber.api.java.en.When;

public class Background_Practice_Keyword_Steps 
{
	static WebDriver driver;
	static String user_dir=null;
	boolean flag=false;


	@Given("^navigate to the login page$") 
	public void navigate_to_the_login_page() throws Throwable 
	{
		user_dir=System.getProperty("user.dir"); 
		System.out.println(user_dir+"\\src\\test\\resource\\Drivers\\chromedriver.exe");



		System.setProperty("webdriver.chrome.driver",user_dir+  "\\src\\test\\resources\\Drivers\\chromedriver.exe"); 
		driver=new ChromeDriver(); driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.navigate().to("https://www.saucedemo.com/");

	}

	@When("^submit username and password$") 
	public void submit_username_and_password() throws Throwable 
	{
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

	}

	@Then("user should be logged in$") 
	public void user_should_be_logged_in() throws Throwable 
	{
		if(driver.findElement(By.xpath("//div[@class='header_secondary_container']/child::span[text()='Products']")).isDisplayed())
		{
			System.out.println("User Login is successful");
		}
	}


	@When("^Add product to the cart$")
	public void add_product_to_the_cart() throws Throwable 
	{
		driver.findElement(By.xpath("//div[@class='inventory_item_name'][text()='Sauce Labs Backpack']/ancestor::div[@class='inventory_item_label']/following-sibling::div[@class='pricebar']/descendant::button")).click();

	}

	@Then("^User basket should display with added item$") 
	public void user_basket_should_display_with_added_item() throws Throwable 
	{
		if(driver.findElement(By.xpath("//span[@class='shopping_cart_badge'][text()=1]")).isDisplayed())
		{
			System.out.println("Product is Added to cart");
		}
	}

	@When("remove all the products from cart and close the browser$")
	public void remove_all_the_products_from_cart_and_close_the_browser() throws Throwable 
	{
		driver.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(4000L);
		driver.findElement(By.id("remove-sauce-labs-backpack")).click();
		Thread.sleep(2000L);
		driver.quit();
	}

}
