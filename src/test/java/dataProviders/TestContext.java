package dataProviders;

import pagemanager.PageObjectManager;

public class TestContext
{
	private WebDriverManager webDriverManager;
	private PageObjectManager pageObjectManager;
	 public ScenarioContext scenarioContext;
	
	 //constructor
	public TestContext()
	{
		webDriverManager = new WebDriverManager();
		pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
		scenarioContext = new ScenarioContext();
	} 	
	
	public WebDriverManager getWebDriverManager()
	{
		return webDriverManager;
	}
	
	public PageObjectManager getPageObjectManager() 
	{
		return pageObjectManager;
	}
	
	public ScenarioContext getScenarioContext() 
	{
		 return scenarioContext;
	}

}
