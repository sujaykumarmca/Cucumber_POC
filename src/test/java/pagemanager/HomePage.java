package pagemanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	WebDriver driver=null;
	
	//constructor
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	}
	
	public void navigateTo_HomePage() 
	{
		driver.get("https://www.saucedemo.com/inventory.html");
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
		
		if(driver.findElement(By.xpath("//div[@class='inventory_list']/descendant::div[@class='inventory_item']/descendant::img[@alt='Sauce Labs Backpack']")).isDisplayed())
		{
			flag=true;
		}
			
		
		return flag;
	}
	
	//Navigate to Product Detail Page
	public void go_To_Product_Detail_Page()
	{
		if(driver.findElement(By.xpath("//div[@class='inventory_list']/descendant::div[@class='inventory_item']/descendant::img[@alt='Sauce Labs Backpack']")).isDisplayed())
		{
			
			driver.findElement(By.xpath("//div[@class='inventory_list']/descendant::div[@class='inventory_item']/descendant::img[@alt='Sauce Labs Backpack']")).click();
		}
	}
	
	public void click_on_cart_link()
	{
		driver.findElement(By.className("shopping_cart_link")).click();
	}


}
