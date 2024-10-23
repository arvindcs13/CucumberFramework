package runners;
import org.junit.runner.RunWith;
import java.io.*;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature", 
glue = { "seleniumTests","AppHooks" },

plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "rerun:target/failed.txt"},

monochrome=true
)

public class CucumberRunner {
	
}
