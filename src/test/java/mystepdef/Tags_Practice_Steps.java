package mystepdef;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Tags_Practice_Steps 
{
	static WebDriver driver=null;
	static String user_dir=null;
	
	@Before("@Element")
	public void beforeCucumberScenario(Scenario scenario) throws Exception{
	    System.out.println(scenario.getName());
	}
	
	
	@Given("^browser is open$")
	public void browser_is_open() throws Throwable
	{
		System.out.println("Before Starting Browser"); 
		 user_dir=System.getProperty("user.dir");
		 
		 System.out.println(user_dir+"\\src\\test\\resources\\drivers\\chromedriver.exe");
		  
		  
		 System.setProperty("webdriver.chrome.driver",user_dir+"\\src\\test\\resources\\drivers\\chromedriver.exe"); 
		  
		 if(Tags_Practice_Steps.driver==null)
		  {
			 Tags_Practice_Steps.driver=new ChromeDriver();
			 
			 Tags_Practice_Steps.driver.manage().window().maximize();

			 Tags_Practice_Steps.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 Tags_Practice_Steps.driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			 
		  } 


	}
	

	@Given("^navigate to toolsa practice page$")
	public void navigate_to_toolsa_practice_page() throws Throwable 
	{
		System.out.println("In Elements page");
		Tags_Practice_Steps.driver.navigate().to("https://demoqa.com/text-box");
	}
	
	@When("^In Elements page enter data for below forms and clickon submit$")
	public void in_Elements_page_enter_data_for_below_forms_and_clickon_submit(DataTable formdata) throws Throwable
	
	{
		//Entering Data using datatable 
				List<Map< String, String>> get_data =formdata.asMaps (String.class,String.class);
				
				for(Map< String, String> columns : get_data)
				{
					System.out.println(columns.get("Lastname"));
					System.out.println(columns.get("Email"));
					System.out.println(columns.get("Current_address"));
					System.out.println(columns.get("Permanent_address"));
					Tags_Practice_Steps.driver.findElement(By.id("userName")).sendKeys(columns.get("Lastname"));
					Tags_Practice_Steps.driver.findElement(By.id("userEmail")).sendKeys(columns.get("Email"));
					Tags_Practice_Steps.driver.findElement(By.id("currentAddress")).sendKeys(columns.get("Current_address"));
					Tags_Practice_Steps.driver.findElement(By.id("permanentAddress")).sendKeys(columns.get("Permanent_address"));
					Tags_Practice_Steps.driver.findElement(By.id("submit")).click();
					
				}

	}
	

	

	@Then("^check for lastname email current address permanent address is diaplyed or not$")
	public void check_for_lastname_email_current_address_permanent_address_is_diaplyed_or_not() throws Throwable
	{
	   System.out.println("User Name::"+Tags_Practice_Steps.driver.findElement(By.xpath("//p[@id='name']")).getText());
	   System.out.println("Email Address::"+Tags_Practice_Steps.driver.findElement(By.xpath("//p[@id='email']")).getText());
	   System.out.println("Current Address::"+Tags_Practice_Steps.driver.findElement(By.xpath("//p[@id='currentAddress']")).getText());
	   System.out.println("Permanent Address::"+Tags_Practice_Steps.driver.findElement(By.xpath("//p[@id='permanentAddress']")).getText());
	   Tags_Practice_Steps.driver.navigate().to("https://demoqa.com/radio-button");
	}
	

	@Given("^Radio button page should display$")
	public void radio_button_page_should_display() throws Throwable
	{
		System.out.println("Radio button page might be displayed");
	}
	
	@And("^Select Yes$")
	public void select_Yes() throws Throwable 
	{

		Tags_Practice_Steps.driver.findElement(By.xpath("//div[@class='custom-control custom-radio custom-control-inline']/child::input[@id='yesRadio']/following-sibling::label[@for='yesRadio']")).click();
	}
	

	@Then("^Yes should display$")
	public void yes_should_display() throws Throwable 
	{
	   System.out.println("Radio Button Selected is::"+Tags_Practice_Steps.driver.findElement(By.xpath("//span[@class='text-success']")).getText());
	}

	

	@After("@Radio")
	public void after_scenario()
	{
		
		Tags_Practice_Steps.driver.quit();
	}

}
