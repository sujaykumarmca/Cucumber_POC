package dataProviders;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import enums.DriverType;
//It is used to read configuration file properties file path
public class ConfigFileReader
{
	private Properties prop_obj;
	private final String property_file_path="\\src\\test\\resources\\configuration\\Configuration.properties";
	String user_dir;
	
	public ConfigFileReader()
	{
		BufferedReader buf_reader;
		user_dir=System.getProperty("user.dir"); 
		//System.out.println("User Dir::"+user_dir);
		System.out.println("Configuration File Path::"+user_dir+property_file_path);
		
		try
		{
			buf_reader=new BufferedReader(new FileReader(user_dir+property_file_path));
			prop_obj=new Properties();
			try
			{
				prop_obj.load(buf_reader);
				buf_reader.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();	
			}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at"+prop_obj);
		}//End of catch block;
		
		}//End of Constructor
		
		//In property file get the driver path;
		public String getDriverPath()
		{
			String driver_path=null;
		
			driver_path=prop_obj.getProperty("driverPath");
			
			if(driver_path!=null)
			{
				return user_dir+driver_path;
			}
			else
			{
				throw new RuntimeException("Configuration.properties not found at "+prop_obj);
			}
			
		}
		
		//In property file get the wait time
		public long getImplicitlyWait()
		{
			String get_implicit_wait=prop_obj.getProperty("implicitlyWait");
			
			if(get_implicit_wait!=null)
			{
				
				try
				{
					return Long.parseLong(get_implicit_wait);
				}
				catch(NumberFormatException e) 
				{
					throw new RuntimeException("Not able to parse value : " + get_implicit_wait + " in to Long");
				}
				
			}
			return 30;
		}
		
		//In property file get the URL
		public String getApplicationURL()
		{
			String url=prop_obj.getProperty("url");
			if(url!=null)
			{
				return url;
			}
			else
			{
				throw new RuntimeException("App URL is not specified in the configuration.properties for the key:"+url);
			}
		}
	
		//In property file get the browser
		public DriverType  getBrowser()
		{
			String browser_name=prop_obj.getProperty("browser");
			if(browser_name!=null || browser_name.equalsIgnoreCase("chrome"))
			{
				return DriverType.CHROME;
			}
			else if(browser_name.equalsIgnoreCase("firefox"))
			{
				return DriverType.FIREFOX;
			}
			else if(browser_name.equalsIgnoreCase("iexplorer"))
			{
				return DriverType.INTERNETEXPLORER;
			}
			else
			{
				throw new RuntimeException("Browser Name Key value in Configuration.properties is not matched : "+ browser_name);
			}
		}
			
			//In Property File get the product_name
			public String get_Product_Name()
			{
				String pname=prop_obj.getProperty("product_name");
				if(pname!=null)
				{
					return pname;
				}
				else
				{
					throw new RuntimeException("Product is NOT found in configuration.properties:"+pname);
				}
			}
			
		
	

}
