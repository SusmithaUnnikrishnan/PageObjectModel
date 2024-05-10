package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputformPage {
	WebDriver driver;
	By inputForm=By.xpath("(//a[@class='nav-link'])[2]");
	By showMessage=By.xpath("//button[@id='button-one']");
	By singleInputField=By.xpath("//div[contains(text(),'Single Input Field')]");
	
	
	public InputformPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickOnInputForm()
	{
		WebElement element=driver.findElement(inputForm);
		element.click();
	}
	
	public String getShowMessageButtonLabel()
	{
		WebElement showMessageButton=driver.findElement(showMessage);
		String str=showMessageButton.getText();
		return str;
				
	}
	
	
	public boolean isSingleInputFieldDisplayed()
	{
		WebElement singleInputField1=driver.findElement(singleInputField);
		return singleInputField1.isDisplayed();
	}
	
	
}
