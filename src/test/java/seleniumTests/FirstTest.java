package seleniumTests;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.LoginPageObjects;
import configFileReader.PeropertyFileReader;
import cucumber.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import manager.FileManager;
import manager.PageObjectManager;
import manager.WebDriverManagers;
public class FirstTest {

//public WebDriver driver;
//public  LoginPageObjects lmp;
//public PageObjectManager pjm;
//public WebDriverManagers wdmanager;

TestContext testContext;
LoginPageObjects loginPage;

public FirstTest(TestContext context) {
	testContext = context;
	loginPage = testContext.getPageObjectManager().getHomePage();
}

	
	@Given("User launches Saucedemo webpage")
	public void user_launches_saucedemo_webpage()  {
		System.out.println("I am on sauce demo page already");
	}

	
	
	@Given("user eneters {string} and {string}")
	public void user_eneters_and(String username, String password) {
//		pjm = new PageObjectManager(driver);
//		lmp=pjm.getHomePage();
		loginPage.getusernameTextbox(username);
		loginPage.getpasswordTextbox(password);
		loginPage.getLoginBtnClick();
	}

	@Then("User should be able to login")
	public void user_should_be_able_to_login() throws Throwable {
		System.out.println("After method will close brwoser");
//		Assert.assertTrue(false);
	}

}
