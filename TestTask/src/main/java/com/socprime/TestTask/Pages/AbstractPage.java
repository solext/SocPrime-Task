package com.socprime.TestTask.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractPage {
	
	protected WebDriver driver;
	
	protected WebDriverWait wait;
	
	protected String pageUrl;
	
	public AbstractPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
