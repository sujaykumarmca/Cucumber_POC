package pagemanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPage 
{
	WebDriver driver=null;

	//constructor
	public ProductDetailPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	}
	
	
	//check product image is displayed or not
	public boolean is_product_image_displayed()
	{
		boolean flag=false;
		
		if(driver.findElement(By.xpath("//img[@class='inventory_details_img']")).isDisplayed())
		{
			flag=true;
		}
		
		return flag;
	}
	
	//Add product to cart
	public void add_product_To_Cart()
	{
		if(driver.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory'][text()='Add to cart']")).isDisplayed())
		{
			driver.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory'][text()='Add to cart']")).click();
		}
	}
	
	public boolean product_price_is_displayed()
	{
		boolean flag=false;
		if(driver.findElement(By.xpath("//div[@class='inventory_details_price']")).isDisplayed())
		{
			System.out.println("Product Price is displayed");
			flag=true;
			
		}
		
		return flag;
	}
	
	
}
