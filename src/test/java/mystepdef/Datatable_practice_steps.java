package mystepdef;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Datatable_practice_steps 
{
	static  WebDriver driver=null;
	 String user_dir=null;
	 
	@Given("^Demo login page should be open$")
	public void demo_login_page_should_be_open() throws Throwable 
	{
		 System.out.println("Before Starting Browser"); 
		 user_dir=System.getProperty("user.dir");
		 
		 System.out.println(user_dir+"\\src\\test\\resources\\drivers\\chromedriver.exe");
		  
		  
		 System.setProperty("webdriver.chrome.driver",user_dir+"\\src\\test\\resources\\drivers\\chromedriver.exe"); 
		  
		 if(Datatable_practice_steps.driver==null)
		  {
			 Datatable_practice_steps.driver=new ChromeDriver();
			 
			 Datatable_practice_steps.driver.manage().window().maximize();

			 Datatable_practice_steps.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 Datatable_practice_steps.driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			 Datatable_practice_steps.driver.navigate().to("https://example.testproject.io/web/");
		  } 
	}

	@When("^User Enters to login and click on login$")
	public void user_Enters_to_login_and_click_on_login(DataTable usercredentials) throws Throwable
	{
		List<List<String>> data=usercredentials.raw();
		System.out.println("Demo application page is opened");
		 Datatable_practice_steps.driver.findElement(By.id("name")).sendKeys(data.get(0).get(0));
		  Datatable_practice_steps.driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));
		  Datatable_practice_steps.driver.findElement(By.id("login")).click(); 
	}

	@Then("^Homepage should display$")
	public void homepage_should_display() throws Throwable
	{
		if(Datatable_practice_steps.driver.findElement(By.id("logout")).isDisplayed())
		{
			System.out.println("Homepage is displayed");
		}
	}
	@When("^click on logout$")
	public void click_on_logout() throws Throwable
	{
		Datatable_practice_steps.driver.findElement(By.id("logout")).click();
	}
	
	@Then("^login page should display$")
	public void login_page_should_display()
	{
		if(Datatable_practice_steps.driver.findElement(By.id("login")).isDisplayed())
		{
			System.out.println("Login page is displayed");
		}
	}
	
	@When("^close the browser$")
	public void close_the_browser()
	{
		Datatable_practice_steps.driver.quit();
	}
}
