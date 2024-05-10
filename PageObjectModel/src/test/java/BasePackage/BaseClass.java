package BasePackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	
	@BeforeMethod
	public void BrowserLaunch()
	{
		WebDriverManager.chromedriver().setup();//equivalent to system.setproperty
		driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

}
