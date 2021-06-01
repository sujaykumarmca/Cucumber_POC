package pagemanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import dataProviders.FileReaderManager;
import dataProviders.TestContext;

public class HomePage 
{
	WebDriver driver=null;
	
	String url="https://www.saucedemo.com";
	
	private String product_name=null;
	
	//constructor
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
		product_name=FileReaderManager.getInstance().getConfigReader().get_Product_Name();
	}
	
		
	public void navigateTo_HomePage() 
	{
		driver.get(url+"/inventory.html");
	}
	
	//In homepage check dropdown is displayed or not
	public boolean is_dropdown_dispalyed_or_not()
	{
		boolean flag=false;
		
		if(driver.findElement(By.className("product_sort_container")).isDisplayed())
		{
			flag=true;
		}
	
	   return flag;
	}
	
	//In homepage check products are displayed or not
	public boolean is_products_displayed()
	{
		boolean flag=false;
		
		if(driver.findElement(By.xpath("//div[@class='inventory_list']/descendant::div[@class='inventory_item']/descendant::img[@alt='" +this.product_name+"']")).isDisplayed())
		{
			flag=true;
		}
			
		
		return flag;
	}
	
	//Navigate to Product Detail Page
	public void go_To_Product_Detail_Page()
	{
		if(driver.findElement(By.xpath("//div[@class='inventory_list']/descendant::div[@class='inventory_item']/descendant::img[@alt='" +this.product_name+"']")).isDisplayed())
		{
			
			driver.findElement(By.xpath("//div[@class='inventory_list']/descendant::div[@class='inventory_item']/descendant::img[@alt='" +this.product_name+"']")).click();
		}
	}
	
	public void click_on_cart_link()
	{
		driver.findElement(By.className("shopping_cart_link")).click();
	}


}
