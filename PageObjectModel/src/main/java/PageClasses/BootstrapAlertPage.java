package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BootstrapAlertPage {
	WebDriver driver;
	By alertsAndModels=By.xpath("(//a[@class='nav-link'])[6]");
	By bootstrapAlertHeader=By.xpath("//div[contains(text(),'Bootstrap Alert')]");
	
	public BootstrapAlertPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void ClickOnBootstrapAlert()
	{
		WebElement alertsAndModels1=driver.findElement(alertsAndModels);
		alertsAndModels1.click();
	}
	
	public boolean isBootstrapAlertHeaderDisplayed()
	{
		WebElement bootstrapAlertHeader1=driver.findElement(bootstrapAlertHeader);
		return bootstrapAlertHeader1.isDisplayed();
	}


}
