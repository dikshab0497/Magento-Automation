package pageObject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShippingPage extends BasePage {

	public ShippingPage(WebDriver driver) {
		super(driver);
	}
	
//	@FindBy(xpath="//input[@name='username']")
	@FindBy(xpath="//fieldset[@id='customer-email-fieldset']//input[@name='username']")
	WebElement emailId;
	
	@FindBy(xpath="//input[@name='firstname']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@name='lastname']")
	WebElement lastName;
	
	@FindBy(xpath="//input[@name='street[0]']")
	WebElement addr;
	
	@FindBy(xpath="//input[@name='city']")
	WebElement city;
	
	@FindBy(xpath="//select[@name='region_id']")
	WebElement proviance;
	
	@FindBy(xpath="//input[@name='postcode']")
	WebElement postcode;
	
	@FindBy(xpath="//select[@name='country_id']")
	WebElement country;
	
	@FindBy(xpath="//input[@name='telephone']")
	WebElement telephone;
	
	@FindBy(xpath="//button[@class='button action continue primary']")
	WebElement btnSubmit;
	
	//span[text()='Please enter a valid email address.']

	@FindBy(xpath="//span[text()='This is a required field.']")
	WebElement valMsg;
	
	public void fillShippingForm() {
//	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//	    
//	    // Wait directly for email input field (more reliable than waiting for <form>)
//	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
//
//	    System.out.println("Shipping form is visible");
//
//	    emailId.sendKeys("dik@gmail.com");
		List<WebElement> inputs = driver.findElements(By.xpath("//input[@name='username']"));
		System.out.println("Username field found: " + inputs.size());
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement usernameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(
		By.xpath("//fieldset[@id='customer-email-fieldset']//input[@name='username']")));

		emailId.sendKeys("dik@gmail.com");



//	    // Uncomment the rest as needed once above works
	    firstName.sendKeys("");
	    lastName.sendKeys("Ban");
	    addr.sendKeys("abc street");
	    city.sendKeys("Mumbai");

	    Select selectProvince = new Select(proviance);
	    selectProvince.selectByVisibleText("Alaska");

	    postcode.sendKeys("12345-6789;12345");

	    Select selectCountry = new Select(country);
	    selectCountry.selectByVisibleText("Albania");

	    telephone.sendKeys("9167609584");
	    
//	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(btnSubmit));
	    btnSubmit.click();

	}
	
	
	public boolean isValidationMessageDisplayed() {
	    return valMsg.isDisplayed() &&
	    		valMsg.getText().trim().equals("This is a required field.");
	}

}
