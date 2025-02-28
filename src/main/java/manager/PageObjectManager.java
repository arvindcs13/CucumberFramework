package manager;

import org.openqa.selenium.WebDriver;

import PageObjects.HomaPageObjects;
import PageObjects.LoginPageObjects;

public class PageObjectManager {

	private WebDriver driver;
	private LoginPageObjects LoginPageObjects;
	private HomaPageObjects homePageObjects;
	
	public PageObjectManager(WebDriver driver) {
	            this.driver=driver;
	}

	public LoginPageObjects getloginPageObjs(){


		if (LoginPageObjects == null) {
		    LoginPageObjects = new LoginPageObjects(driver);
		}
		return LoginPageObjects;

	}
	
	
	public HomaPageObjects gethomePageObjects(){


		if (homePageObjects == null) {
			homePageObjects = new HomaPageObjects(driver);
		}
		return homePageObjects;

	}
	
}
