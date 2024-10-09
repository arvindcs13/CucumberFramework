package cucumber;

import manager.PageObjectManager;
import manager.WebDriverManagers;

public class TestContext {

	private WebDriverManagers webDriverManager;
	private PageObjectManager pageObjectManager;
	
	public TestContext() throws Throwable{
		webDriverManager = new WebDriverManagers();
		pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
	}
	
	public WebDriverManagers getWebDriverManager() {
		return webDriverManager;
	}
	
	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}
	
	
}
