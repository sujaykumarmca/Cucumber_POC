package dataProviders;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import enums.DriverType;

public class WebDriverManager 
{
	private WebDriver driver;
	private static DriverType driver_type;
	private static final String CHROME_DRIVER_PROPERTY=	"webdriver.chrome.driver";
	
	//constructor to get driver_type
	public WebDriverManager() 
	{
		driver_type = FileReaderManager.getInstance().getConfigReader().getBrowser();
		
	}
	
	public WebDriver getDriver() 
	{
		if(driver == null)
		{
			System.out.println("Driver Object is NULL");
			System.setProperty(CHROME_DRIVER_PROPERTY, FileReaderManager.getInstance().getConfigReader().getDriverPath());
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			System.out.println("Driver Object(after Creation)::"+driver);
		}	
		
		return driver;
	}
	
	public void closeDriver()
	{
		driver.quit();
	}

	
	private WebDriver createLocalDriver() 
	{
        switch (driver_type) 
        {	    
        	case FIREFOX : driver = new FirefoxDriver();
	    	break;
        case CHROME : 
        	System.setProperty(CHROME_DRIVER_PROPERTY, FileReaderManager.getInstance().getConfigReader().getDriverPath());
        	driver = new ChromeDriver();
    		break;
        case INTERNETEXPLORER : driver = new InternetExplorerDriver();
    		break;
        }//End of switch;

        driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);
		return driver;
	}	

	
}
