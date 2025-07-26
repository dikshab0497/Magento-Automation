package pageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentPage extends BasePage {
	
	public PaymentPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//button[@class='action primary checkout']")
	WebElement btnPlaceOrder;
	
	public void clickPlaceOrder() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // Optional: Wait for loader if it appears
	        wait.until(ExpectedConditions.or(
	            ExpectedConditions.invisibilityOfElementLocated(By.xpath("//img[@alt='Loading...']")),
	            ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='action primary checkout']"))
	        ));

	        // Wait for the button to be visible and enabled
	        wait.until(ExpectedConditions.elementToBeClickable(btnPlaceOrder));

	        // Extra check: is button displayed and enabled?
	        if (btnPlaceOrder.isDisplayed() && btnPlaceOrder.isEnabled()) {
	            btnPlaceOrder.click();
	            System.out.println("✅ Place Order button clicked.");
	        } else {
	            System.out.println("⚠️ Place Order button not ready for click.");
	        }

	    } catch (Exception e) {
	        System.out.println("❌ Exception in clickPlaceOrder: " + e.getMessage());
	        throw e;
	    }
	}
	
	
}
