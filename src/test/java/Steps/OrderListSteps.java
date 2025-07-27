package Steps;

import pageObject.AccountPage;
import testBase.BaseClass;

public class OrderListSteps extends BaseClass {
	
	AccountPage ap = new AccountPage(driver);
	
	public void selectMyOrder() {
		ap.selectMyOrder();
	}
	
	
	

}
