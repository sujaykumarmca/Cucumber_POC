package mystepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class mygooglesearchsteps 
{
	static WebDriver driver;
	String user_dir=null;
	String actual_value=null;
	String exp_value="Google Test";
	




	@Given("^Browser is open$") 
	public void browser_is_open() throws Throwable {
		
		

		System.out.println("Before Starting Browser"); 
		user_dir=System.getProperty("user.dir"); 
		System.out.println(user_dir+"\\src\\test\\resource\\Drivers\\chromedriver.exe");



		System.setProperty("webdriver.chrome.driver",user_dir+  "\\src\\test\\resources\\Drivers\\chromedriver.exe"); 
		driver=new ChromeDriver(); driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);




	}

	@And("^user is on google search page$") 
	public void User_is_on_google_search_page() throws Throwable {

		driver.navigate().to("https://google.co.in");

	}

	@When("^User enters a text in google search page$") 
	public void user_enters_a_text_in_google_search_page() throws Throwable {

		driver.findElement(By.name("q1")).sendKeys("Selenium");

	}

	@And("^hits Enter button$") 
	public void hits_Enter_button() throws Throwable
	{

		driver.findElement(By.name("q1")).sendKeys(Keys.ENTER); 
	}



	@Then("^user is navigated to google search page$")
	public void user_is_navigated_to_google_search_page() throws Throwable 
	{


		driver.getPageSource().contains("selenium");
		
	}
	
	@Given("^Compare page titles$")
	public void compare_page_title() throws Throwable 
	{
		actual_value=driver.getTitle();
	}
	

	@After("@Two")
	public void after_scenario()
	{
		Assert.assertEquals(exp_value, actual_value);
		driver.close();
	}
	
	







}
