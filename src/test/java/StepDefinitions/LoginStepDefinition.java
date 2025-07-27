package StepDefinitions;

import Steps.LoginSteps;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	
	LoginSteps ls = new LoginSteps();
	
	@When("User login into application")
    public void User_login_into_application() {  
		ls.clickSignInUrl();
		ls.enetrSignInDetails();
    }

}
