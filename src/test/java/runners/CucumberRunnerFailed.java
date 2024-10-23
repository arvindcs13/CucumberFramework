package runners;
import org.junit.runner.RunWith;
import java.io.*;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "@target/failed.txt", 
glue = { "seleniumTests","AppHooks" },

plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", },

monochrome=true
)

public class CucumberRunnerFailed {
	
}
