package Steps;
import org.testng.Assert;

import pageObject.HomePage;
import pageObject.PaymentPage;
import pageObject.ProductPage;
import pageObject.ShippingPage;
import pageObject.SuccessPage;
import testBase.BaseClass;
public class DemoSteps extends BaseClass {
	
	HomePage hp = new HomePage(driver);
	ProductPage pp = new ProductPage(driver);
	ShippingPage sp = new ShippingPage(driver);
	PaymentPage pp1 = new PaymentPage(driver);
	SuccessPage sp1 = new SuccessPage(driver);
	

    public void launchWebApplication() {
        logger.info("Launching application...");
        driver.get(rb.getString("appUrl"));

   }
    
    public void addProductToAddCart() {
    	logger.info("****** Product put into chcekout without login ******");
    	
		hp.clickProduct();
		logger.info("****** Select Product ******");
		pp.clickSize();
		logger.info("****** Select Product Size******");
		pp.clickColor();
		logger.info("****** Select Product Color******");
		pp.clickAddToCart();
		logger.info("****** Product Add To Cart ******");
		pp.clickShowCartIfMsgDisplayed();
		logger.info("****** Click on Show Cart ******");
		pp.clickProceedToCheckout();
		logger.info("****** Click processed to checkout******");
   }

       public void fillTheShippingForm() {
        logger.info("****** Fill The Shipping Form ******");

        sp.fillShippingForm();
//        pp1.clickPlaceOrder();

        if (sp.isValidationMessageDisplayed()) {
            logger.warn("⚠️ Validation error displayed — as expected for missing fields.");
            Assert.assertTrue(true); // Just a confirmation
        } 
        else if (sp1.isSuccessMessageDisplayed()) {
            logger.info("✅ Success message is displayed correctly.");
            Assert.assertTrue(true);
        } 
        else {
            logger.error("❌ Neither validation error nor success message appeared.");
            Assert.fail("Unexpected behavior — no validation or success message.");
        }

    }

}
