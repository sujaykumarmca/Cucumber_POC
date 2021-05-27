package mystepdef;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class demologinlogoutsteps
{
	static WebDriver driver=null;
	static String user_dir=null;
	
	@Before("@First")
	@Given("^open the browser$")
	public void open_the_browser() throws Throwable
	{

		  System.out.println("Before Starting Browser"); 
			 user_dir=System.getProperty("user.dir");
			 
			 System.out.println(user_dir+"\\src\\test\\resources\\drivers\\chromedriver.exe");
			  
			  
			 System.setProperty("webdriver.chrome.driver",user_dir+"\\src\\test\\resources\\drivers\\chromedriver.exe"); 
			  
			 if(demologinlogoutsteps.driver==null)
			  {
				  demologinlogoutsteps.driver=new ChromeDriver();
				 
				  demologinlogoutsteps.driver.manage().window().maximize();

				  demologinlogoutsteps.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				  demologinlogoutsteps.driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
				  demologinlogoutsteps.driver.navigate().to("https://example.testproject.io/web/");
			  } 
	}
	
	
	@Given("^Demo Login page is opened$")
	public void browser_is_open() throws Throwable 
	{
		System.out.println("Demo application page is opend");
	}
	

	@And("^Enter the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_the_and(String uname, String pwd) throws Throwable 
	{
		  
		  demologinlogoutsteps.driver.findElement(By.id("name")).sendKeys(uname);
		  demologinlogoutsteps.driver.findElement(By.id("password")).sendKeys(pwd);
		 
	}

	@When("^Click on Login button$")
	public void click_on_Login_button() throws Throwable 
	{
		 demologinlogoutsteps.driver.findElement(By.id("login")).click(); 
	}
	
	@Then("^Homepage should be displayed$")
	public void homepage_should_be_displayed() throws Throwable 
	{
		if(demologinlogoutsteps.driver.findElement(By.id("logout")).isDisplayed())
		{
			System.out.println("Homepage is displayed");
		}
	
	}

	
	@When("^Click on logout link$")
	public void click_on_logout_link() throws Throwable
	{
		demologinlogoutsteps.driver.findElement(By.id("logout")).click();

	}

	@Then("^Logout should be successful$")
	public void Logout_should_be_successful() throws Throwable 
	{
		if(demologinlogoutsteps.driver.findElement(By.id("login")).isDisplayed())
		{
			System.out.println("Logout is working fine");
		}
		
	}
	
	@After("@Second")
	@Given("^Please close the browser$")
	public void please_close_the_browser() throws Throwable 
	{
		demologinlogoutsteps.driver.quit();
	}

}
