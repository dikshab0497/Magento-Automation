package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//div[@class='panel header']//a[contains(text(),'Sign In')]")
	WebElement lnkSignIn;

	@FindBy(xpath="//input[@id='email']")
	WebElement txtEmail;

	@FindBy(xpath="//fieldset[@class='fieldset login']//input[@id='pass']")
	WebElement txtPassword;

	@FindBy(xpath="//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]")
	WebElement btnSignIn;


	public void clickSignIn() {
		lnkSignIn.click();
	}
	
	public void enterEmail() {
		txtEmail.sendKeys("dik45@gmail.com");
	}
	
	public void enterPassword() {
		txtPassword.sendKeys("Diksha@123");
	}
	
	public void submitSignIn() {
		btnSignIn.click();
	}
	
}
