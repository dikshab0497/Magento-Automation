package pageObject;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HistoryPage extends BasePage {

	public HistoryPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//tbody/tr[1]/td[6]/a[1]/span[1]")
	WebElement lnkViewOrder;
	
	
	public void clickViewOrder() {
		lnkViewOrder.click();
	}
	
	


	

}
