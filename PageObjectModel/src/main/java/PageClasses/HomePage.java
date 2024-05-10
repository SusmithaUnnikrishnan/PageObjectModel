package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;
	By logo=By.xpath("//a[@href='index.php']//img");
	
	public HomePage(WebDriver driver)//here constructor is used to pass driver since we cant extend classes in test and main folders.
	{
		this.driver=driver;
	}
	
	public boolean isLogoDisplayed()
	{
		WebElement element=driver.findElement(logo);
		return element.isDisplayed();
	}
	

	public void PrintTitle()
	{
		driver.getTitle();
	}

	}


