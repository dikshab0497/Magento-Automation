package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath="//a[normalize-space()='Sign In']")
	WebElement lnkSignIn;
	
	@FindBy(xpath="//ol[contains(@class, 'product-items')]/li[1]")
	WebElement productLnk;
	
	
	public void clickSignIn() {
		lnkSignIn.click();
	}
	
	
	public void clickProduct() {
		productLnk.click();
	}
	

}
