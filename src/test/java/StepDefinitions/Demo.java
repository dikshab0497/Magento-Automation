package StepDefinitions;

import com.aventstack.extentreports.Status;

import Steps.DemoSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testBase.BaseClass;
import utilities.ExtentReportManager;

public class Demo extends BaseClass {

	DemoSteps dS = new DemoSteps();
	
    @Given("user launches the application")
    public void user_launches_the_application() {    	
    	dS.launchWebApplication();
    	ExtentReportManager.test.log(Status.INFO, "user launches the application");
    }
    
    @When("user Checkout product without login")
    public void user_Checkout_product_without_login() {    	
    	dS.addProductToAddCart();
    }
    
    @Then("user Fill the Shippping Form")
    public void user_Fill_the_Shippping_Form() {    	
    	dS.fillTheShippingForm();
    }
    
}
