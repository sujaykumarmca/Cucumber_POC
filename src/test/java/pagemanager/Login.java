package pagemanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
	String url="https://www.saucedemo.com";
	WebDriver driver=null;
	
	@FindBy(id="user-name")
	private WebElement user_name;
	
	@FindBy(id="password")
	private WebElement user_password;
	
	@FindBy(id="login-button")
	private WebElement login_button;
	
	
	//constructor
	public Login(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	}
	
	public void login(String username,String password)
	{		
		this.driver.navigate().to(url);
		user_name.sendKeys(username);
		user_password.sendKeys(password);
		login_button.click();
		
	}
}
