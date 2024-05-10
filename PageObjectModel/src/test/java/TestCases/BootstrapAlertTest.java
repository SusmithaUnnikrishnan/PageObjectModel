package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import PageClasses.BootstrapAlertPage;
import PageClasses.InputformPage;

public class BootstrapAlertTest extends BaseClass {
	
	BootstrapAlertPage bootstrapalertpage;

	@Test
	public void verify_BootstrapAlertHeader()
	{
		bootstrapalertpage=new BootstrapAlertPage(driver);
		bootstrapalertpage.ClickOnBootstrapAlert();
		boolean a=bootstrapalertpage.isBootstrapAlertHeaderDisplayed();
		Assert.assertTrue(a);
	}
}
