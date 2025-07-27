package pageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath="//a[normalize-space()='Sign In']")
	WebElement lnkSignIn;
	
	@FindBy(xpath="//ol[contains(@class, 'product-items')]/li[1]")
	WebElement productLnk;
	
//	@FindBy(xpath="//span[@class='customer-name active']//button[@type='button']")
//	WebElement profileUrl;
//	
	
	
	@FindBy(xpath="//div[@aria-hidden='false']//a[normalize-space()='My Account']")
	WebElement profileMyAccount;
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	
	public void clickSignIn() {
		lnkSignIn.click();
	}
	
	
	public void clickProduct() {
		productLnk.click();
	}
	
//	public void clickProfileUrl() {
//		
//		wait.until(ExpectedConditions.visibilityOf(profileUrl)); 
//		profileUrl.click();
//	}
	public void clickProfileUrl() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement profileButton = wait.until(ExpectedConditions
		    .visibilityOfElementLocated(By.xpath("//span[contains(@class, 'customer-name')]//button")));

		wait.until(ExpectedConditions.elementToBeClickable(profileButton)).click();

	}


	public void clickProfileMyAccount() {
		profileMyAccount.click();
	}
	
	

}
