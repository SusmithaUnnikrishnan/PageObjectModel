package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import PageClasses.DatePickersPage;

public class DatePickersTest extends BaseClass{
	
	DatePickersPage datepickerspage;
	
	@Test
	public void verify_datePickers() 
	{
		DatePickersPage datepickerspage=new DatePickersPage(driver);
		
	}
	
	@Test
	public void Verify_dateSelection()
	{
		DatePickersPage datepickerspage=new DatePickersPage(driver);
		datepickerspage.clickOnDatePickers();
		datepickerspage.clickOnSearchField();
		//datepickerspage.chooseDate();
		datepickerspage.chooseDateUsingSendkeys();
	}

}
