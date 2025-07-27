package StepDefinitions;


import org.testng.Assert;

import com.aventstack.extentreports.Status;

import Steps.OrderListSteps;
import io.cucumber.java.en.Given;
import pageObject.AccountPage;
import pageObject.HistoryPage;
import pageObject.HomePage;
import testBase.BaseClass;
import utilities.ExtentReportManager;

public class OrderListStepDefinition extends BaseClass  {
	
	OrderListSteps os = new OrderListSteps();
	AccountPage ap = new AccountPage(driver);
	HistoryPage hp = new HistoryPage(driver);
	HomePage hp1 = new HomePage(driver);
	
	@Given("User chcek privious order")
    public void User_chcek_privious_order() {   
		hp1.clickProfileUrl();
		hp1.clickProfileMyAccount();
		os.selectMyOrder();
		hp.clickViewOrder();
		
    	ExtentReportManager.test.log(Status.INFO, "user chcek past orders");
    }
	
	
	
	
	

}
