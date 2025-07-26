package pageObject;

import java.time.Duration;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage extends BasePage {
	
	public ProductPage(WebDriver driver) {
		super(driver);
	}

	//div[contains(normalize-space(text()), 'Welcome')]

	@FindBy(xpath="//div[@id='option-label-size-143-item-168']")
	WebElement optSize;
	
	
	@FindBy(xpath="//div[@id='option-label-color-93-item-57']")
	WebElement optColor;
	
	@FindBy(xpath="//button[@title='Add to Cart']")
	WebElement btnAddToCart;
	
	@FindBy(xpath="//a[@class='action showcart']")
	WebElement btnShowCart;
	
	@FindBy(xpath="//button[@id='top-cart-btn-checkout']")
	WebElement btnProccedToCheckOut;
	
	@FindBy(xpath = "//div[contains(., 'You added Radiant Tee to your') and contains(., 'shopping cart')]")
	WebElement shoppingCartMsg;

	public void clickSize() {
		optSize.click();
	}
	
	public void clickColor() {
		optColor.click();
	}
	
	public void clickAddToCart() {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	     wait.until(ExpectedConditions.visibilityOf(btnAddToCart));
	     System.out.println("Show Cart is now visible.");
		btnAddToCart.click();
	}
	
	public boolean isShoppingCartMsgDisplayed() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    try {
	        wait.until(ExpectedConditions.visibilityOf(shoppingCartMsg));
	        System.out.println("Shopping cart message is displayed.");
	        return true;
	    } catch (TimeoutException e) {
	        System.out.println("Shopping cart message was not displayed in time.");
	        return false;
	    }
	}

	public void clickShowCartIfMsgDisplayed() {
	    if (isShoppingCartMsgDisplayed()) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.elementToBeClickable(btnShowCart));
	        System.out.println("Show Cart is now visible and clickable.");
	        btnShowCart.click();
	    } else {
	        System.out.println("Show Cart button not clicked because message was not displayed.");
	    }
	}

	
	public void clickProceedToCheckout() {
		btnProccedToCheckOut.click();
	}

}
