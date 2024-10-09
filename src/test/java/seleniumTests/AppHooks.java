package seleniumTests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class AppHooks {

	TestContext testContext;
	WebDriver driver;

	public AppHooks(TestContext context) {
		testContext = context;
	}

	@Before
	public void launch_Browser() throws Throwable {
	testContext.getWebDriverManager().getDriver();
	 
	 
	}

	@After(order=0)
	public void TearDown() {
		testContext.getWebDriverManager().closeDriver();
	}
	
	@AfterStep
	public void actionPostEachStep(Scenario scenario) throws Throwable {
		if(scenario.isFailed()) {
			String failedscenarioName= scenario.getName().replaceAll(" ", "-");
			byte[] screenshot= ((TakesScreenshot)testContext.getWebDriverManager().getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png",failedscenarioName );
		}
		
		
		
	}
	

}
