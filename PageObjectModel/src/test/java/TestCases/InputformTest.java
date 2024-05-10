package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import PageClasses.HomePage;
import PageClasses.InputformPage;

public class InputformTest extends BaseClass{
	
	InputformPage inputformpage;

	@Test
	public void verify_ShowMessageButtonText()
	{
	 inputformpage=new InputformPage(driver);
	 inputformpage.clickOnInputForm();
	 String expectedText="Show Message";
	 String actualText=inputformpage.getShowMessageButtonLabel();
	 Assert.assertEquals(actualText, expectedText);
	}
	
	
	@Test
	public void verify_SingleInputFieldHeader()
	{
		 inputformpage=new InputformPage(driver);
		 inputformpage.clickOnInputForm();
		 inputformpage.isSingleInputFieldDisplayed();
		 boolean a=inputformpage.isSingleInputFieldDisplayed();
		 System.out.println(a);
		 Assert.assertTrue(a);
	}
	
}

