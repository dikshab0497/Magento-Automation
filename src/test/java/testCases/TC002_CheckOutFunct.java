package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.ProductPage;
import testBase.BaseClass;

public class TC002_CheckOutFunct extends BaseClass {

	@Test(groups={"Regression","Master"})
	public void verifyAccountResgistration() {
		
		try {
		
		logger.info("****** Starting TC002_CheckOut Product Started ******");
		HomePage hp = new HomePage(driver);
		
		hp.clickProduct();
		
		ProductPage pp = new ProductPage(driver);
		
		pp.clickSize();
		pp.clickColor();
		pp.clickAddToCart();
		
//		pp.clickShowCart();
		pp.clickProceedToCheckout();
		
		}catch(Exception e) {
		
		Assert.fail();
	}	
	}
}
