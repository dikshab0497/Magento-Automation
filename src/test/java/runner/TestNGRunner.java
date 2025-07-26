package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "src/test/resources/features",
	    glue = "StepDefinitions",
	    plugin = {
	        "pretty",
	        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
	        "json:target/cucumber.json"
	    },
	    tags = "@Smoke",
	    monochrome = true
	)

public class TestNGRunner extends AbstractTestNGCucumberTests {
}
