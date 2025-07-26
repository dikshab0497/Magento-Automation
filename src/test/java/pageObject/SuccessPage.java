package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccessPage extends BasePage {
	
	public SuccessPage(WebDriver driver) {
		super(driver);
	} 

	@FindBy(xpath="//h1[normalize-space()='Thank you for your purchase!']")
	WebElement msgSuccess;
	
	public boolean isSuccessMessageDisplayed() {
	    return msgSuccess.isDisplayed() &&
	           msgSuccess.getText().trim().equals("Thank you for your purchase!");
	}


}
