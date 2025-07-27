package Steps;

import pageObject.LoginPage;
import testBase.BaseClass;

public class LoginSteps extends BaseClass {
	
	LoginPage lp = new LoginPage(driver);
	
	
	public void clickSignInUrl() {
		lp.clickSignIn();
	}
	
	public void enetrSignInDetails() {
		
		logger.info("****** Enter Sign In Deatils ******");
		
		lp.enterEmail();
		logger.info("****** Enter Email ******");
		lp.enterPassword();
		logger.info("****** Enter Password ******");
		lp.submitSignIn();
		logger.info("****** Submitted Sign In Button ******");
		
	}
	
	

}
