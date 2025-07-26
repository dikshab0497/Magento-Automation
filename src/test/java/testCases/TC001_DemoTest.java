package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import testBase.BaseClass;

public class TC001_DemoTest extends BaseClass {
//	@Test(groups={"Regression","Master"})
	public void verifyAccountResgistration() {
		
		try {
		
		logger.info("****** Starting TC001_AccountRegistrationTest ******");
		HomePage hp = new HomePage(driver);
		
		hp.clickSignIn();
		
		}catch(Exception e) {
		
		Assert.fail();
	}	
	}

}
