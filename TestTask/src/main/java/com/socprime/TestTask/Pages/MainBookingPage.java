package com.socprime.TestTask.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.socprime.TestTask.Pages.Constants.Constants;


public class MainBookingPage extends AbstractPage {

	public MainBookingPage(WebDriver driver) {
		super(driver);
		this.pageUrl = Constants.URL;
	}
		
	@FindBy(xpath = "//*[@id='logo_no_globe_new_logo']")
	private WebElement logo;
	
	@FindBy(xpath = "//input[@id='ss']")
	private WebElement locationField;
	
	@FindBy(xpath = "descendant::*[@class='c2-month-header-monthname'][1]")
	private WebElement octoberMonth;
	
	@FindBy (xpath = "//*[@class='c2-day c2-day-s-weekend']")
	private List<WebElement> dateNumber;
	
	@FindBy (xpath = "descendant::*[@class='sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb '][1]")
	private WebElement calendar;
	
	@FindBy(xpath = "//*[@id='b2indexPage']/div[3]/div/div/div[3]/div/div/div[3]/div[1]/div")
	private WebElement leftMonth;
	
	@FindBy(xpath = "//*[@class='bui-calendar__dates']/tbody//td")
	private List<WebElement> leftColumnsDate;
	
	@FindBy(xpath = "//*[@class=' xpi__searchbox  ']//*[@class='bui-calendar__main']")
	private WebElement calendarField;
	
	@FindBy(xpath="(//*[@class='sign_in_wrapper'])[2]")
	private WebElement loginButton;
	
	@FindBy(xpath = "//*[@class='sb-searchbox__button  ']")
	private WebElement checkButton;
	

	
	public WebElement getCalendarField () {
		return calendarField;
	}
	
	public void loginButtonClick () {
		loginButton.click();
	}
	
	public void checkButtonClick () {
		checkButton.click();
	}
	
	
	public List<WebElement> getLeftDateColumns() {
		return leftColumnsDate;
	}
	
	public String getLeftMonthText () {
		return leftMonth.getText();
	}
	
	public WebElement getLeftMonth () {
		return leftMonth;
	}
	
	public void leftMonthClick () {
		leftMonth.click();;
	}
	
	public void calendarClick(){
		calendar.click();
	}
	
	public List<WebElement> getDateNumber() {
		return dateNumber;
	}
	
	public String getOctoberMonth () {
		return octoberMonth.getText();
	}
		
	public void enterLocation (String location) {
		locationField.sendKeys(location);
	}
	
	public WebElement getLogo () {
		return logo;
	}
	public void navigateToMainPage() {
		driver.get(this.pageUrl);
	}
	
	

}
