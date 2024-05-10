package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import PageClasses.TablePage;

public class TableTest extends BaseClass {

	TablePage tablepage;
	
	@Test
	public void verify_TableHeader()
	{
		tablepage=new TablePage(driver);
		tablepage.clickOnTableLink();
		String expectedHeaderText="Table with Pagination Example";
		String actualHeaderText=tablepage.getTableHeaderText();
		Assert.assertEquals(actualHeaderText, expectedHeaderText);
	}
	
	@Test
	public void verify_classAttributeOfHeader()
	{
		tablepage=new TablePage(driver);
		tablepage.clickOnTableLink();
		
		String expectedAttributeValue="card-header";
		String actualAttributeValue=tablepage.getClassAttribute();
		Assert.assertEquals(actualAttributeValue, expectedAttributeValue);
	}
	
	@Test
	public void verify_hrefAttributeOfTableSortAndSearch()
	{
		tablepage=new TablePage(driver);
		tablepage.clickOnTableLink();
		
		String expectedAttributeValue="https://selenium.qabible.in/table-sort-search.php";
		String actualAttributeValue=tablepage.getHrefAttribute();
		Assert.assertEquals(actualAttributeValue, expectedAttributeValue);
	}
	
	@Test
	public void printNames()
	{
		tablepage=new TablePage(driver);
		tablepage.clickOnTableLink();
		tablepage.printAllNames();
	}
	
	@Test
	public void verify_officeName()
	{
		tablepage=new TablePage(driver);
		tablepage.clickOnTableLink();
		
		String expectedOfficeName="Edinburgh";
		String actualOfficeName=tablepage.getOfficeOfPerson("Cedric Kelly");
		System.out.println(actualOfficeName);
		Assert.assertEquals(actualOfficeName, expectedOfficeName);
		
		
	}
	
}
