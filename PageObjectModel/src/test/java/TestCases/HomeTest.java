package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import PageClasses.HomePage;


public class HomeTest extends BaseClass {
	HomePage homepage;//Using aggregation, a object for HomePage class is created.
	

@Test
public void VerifyLogo()
{
	HomePage homepage=new HomePage(driver);
	homepage.PrintTitle();//aggregation
	System.out.println("To verify logo");
	System.out.println(driver.getTitle());
	boolean a=homepage.isLogoDisplayed();
	Assert.assertTrue(a);
	
}
	

}
