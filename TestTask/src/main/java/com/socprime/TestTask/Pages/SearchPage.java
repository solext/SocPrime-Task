package com.socprime.TestTask.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SearchPage extends AbstractPage {

	public SearchPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//*[@id='right']")
	private WebElement searchResult;
	
	@FindBy(xpath = "//*[@class=' jq_tooltip  district_link visited_link ']")
	private List<WebElement> locationFieldList;
	
	public List<WebElement> getLocationFieldList () {
		return locationFieldList;
	}
	
	public void searchResultClick () {
		searchResult.click();
	}
	
	public WebElement getSearchResult () {
		return searchResult;
	}
}
