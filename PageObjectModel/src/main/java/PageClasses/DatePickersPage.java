package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityPackage.UtilityClass;

public class DatePickersPage {

	WebDriver driver;
	UtilityClass utilityclass = new UtilityClass();

	@FindBy(xpath = "//a[contains(text(),'Date Pickers')]")
	WebElement datePickers;

	@FindBy(xpath = "//input[@id='single-input-field']\r\n")
	WebElement searchField;

	@FindBy(xpath = "(//th[@class='datepicker-switch'])[1]")
	WebElement middleelemenet;

	@FindBy(xpath = "//thead//tr[2]//th[1]")
	WebElement previousButton;

	@FindBy(xpath = "//thead//tr[2]//th[3]")
	WebElement nextButton;

	public DatePickersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnDatePickers() {
		datePickers.click();
	}

	public void clickOnSearchField() {
		searchField.click();
	}

	public void chooseDate() {
		String date = "20-05-2024";
		String split[] = date.split("-");
		String year = split[2];
		String day = split[0];
		String monthIndex = split[1];
		int monthNumber = Integer.parseInt(monthIndex);
		int yearNumber = Integer.parseInt(year);
		String month = "";
		switch (monthNumber) {
		case 01:
			month = "January";
			break;
		case 2:
			month = "February";
			break;
		case 3:
			month = "March";
			break;
		case 4:
			month = "April";
			break;
		case 5:
			month = "May";
			break;
		case 6:
			month = "June";
			break;
		case 7:
			month = "July";
			break;
		case 8:
			month = "August";
			break;
		case 9:
			month = "September";
			break;
		case 10:
			month = "October";
			break;
		case 11:
			month = "November";
			break;
		case 12:
			month = "December";
		}

		String month_year = month + " " + year;

		while (true) {
			//String currentmonth_year = middleelemenet.getText();
			String currentmonth_year=driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[1]")).getText();
			System.out.println(currentmonth_year);
			if (month_year.equals(currentmonth_year)) {
				break;
			} else if (yearNumber == 2024 && monthNumber > 5) {
				nextButton.click();
			} else if (yearNumber == 2024 && monthNumber < 5) {
				previousButton.click();
			} else if (yearNumber < 2024) {
				previousButton.click();
			} else if (yearNumber > 2024) {
				nextButton.click();
			}

			WebElement calenderdayelement = driver
					.findElement(By.xpath("//tbody//td[text()='" + day + "' and @class='day']"));
			calenderdayelement.click();

		}
		

	}
	
	public void chooseDateUsingSendkeys() {
		searchField.sendKeys("05/02/2024");
	}

}
