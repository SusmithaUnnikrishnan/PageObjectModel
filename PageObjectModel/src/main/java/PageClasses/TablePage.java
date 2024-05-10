package PageClasses;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityPackage.UtilityClass;

public class TablePage {
	WebDriver driver;
	UtilityClass utilityclass=new UtilityClass();
	
	@FindBy(xpath = "(//a[contains(text(),'Table')])[1]")//concatanation isnot possible
	WebElement tablelink;
	
	@FindBy(xpath = "//div[contains(text(),'Table with Pagination Example')]")
	WebElement tableHeader;
	
	@FindBy(xpath="//a[contains(text(),'Table Sort And Search')]")
	WebElement tableSortAndSearch;
	
	@FindBy(xpath="//tbody//tr//td[1]")
	List<WebElement> listnameelement;
	
	public TablePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);//this is used to pass current class object 
		//pagefactory is used to initialise webelement
	}
	
	public void clickOnTableLink()
	{
		tablelink.click();
	}
	
	public String getTableHeaderText()
	{

		String str=tableHeader.getText();
		return str;
	}
	
	public String getClassAttribute()
	{
		return utilityclass.get_Attribute(tableHeader, "class");
	}
	
	public String getHrefAttribute()
	{
		return utilityclass.get_Attribute(tableSortAndSearch, "href");
	}
	
	public void printAllNames()
	{
		List<String> namesData = new ArrayList<String>();
		namesData=utilityclass.get_TextOfElements(listnameelement);
		System.out.println(namesData);
	}
	
	public String getOfficeOfPerson(String name)
	{
		int index=0;
		
		List<String> namesData = new ArrayList<String>();
		namesData=utilityclass.get_TextOfElements(listnameelement);
		
		for(index=0;index<listnameelement.size();index++)
		{
			if(listnameelement.get(index).equals(name))
			{
				index++;
				break;
			}		
		}
		WebElement officeElement=driver.findElement(By.xpath("//table//tr["+index+"]//td[3]"));
		return officeElement.getText();
	}

}
