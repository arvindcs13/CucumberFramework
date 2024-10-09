package manager;

import org.openqa.selenium.WebDriver;

import PageObjects.LoginPageObjects;

public class PageObjectManager {

	private WebDriver driver;
	private LoginPageObjects LoginPageObjects;
	
	public PageObjectManager(WebDriver driver) {
	            this.driver=driver;
	}

	public LoginPageObjects getHomePage(){

		return (LoginPageObjects == null) ? LoginPageObjects = new LoginPageObjects(driver) : LoginPageObjects;

	}
	
}
