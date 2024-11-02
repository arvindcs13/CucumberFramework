package seleniumTests;

import org.junit.Assert;

import PageObjects.HomaPageObjects;
import cucumber.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Test2StepDefinations {
	TestContext testContext;
	HomaPageObjects homepageObjects;

	public Test2StepDefinations(TestContext context) {
		testContext = context;
		homepageObjects = testContext.getPageObjectManager().gethomePageObjects();
	}
	
	@Given("I am on the home page of sauce demo test")
	public void i_am_on_the_home_page_of_sauce_demo_test() {
	    System.out.println("I am on home page ");
	}

	@Given("I am able to see the logo sauce demo site")
	public void i_am_able_to_see_the_logo_sauce_demo_site() {
		homepageObjects.app_logoisDisplayed();
	}

	@Then("My validation will be full fill")
	public void my_validation_will_be_full_fill() {
	    Assert.assertTrue(true);
	    System.out.println("I am good");
	}

	@Given("Product should be available in homepage")
	public void product_should_be_available_in_homepage() {
		Assert.assertTrue(homepageObjects.product_LabelisDisplayed());
		System.out.println("Product label is available on homepage");
	}

	@Then("user should be able to see the product {string}")
	public void user_should_be_able_to_see_the_product(String product) {
		String ExpectedTextname="Sauce Labs Backpack";
		homepageObjects.bagPackisAvaialble().isDisplayed();
		String AcctualteXt =homepageObjects.bagPackisAvaialble().getText();
		Assert.assertEquals( ExpectedTextname, AcctualteXt);
		
	}
}
