package com.socprime.TestTask.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class PopupPage extends AbstractPage {
	
	public PopupPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="(//*[@name='username'])[1]")
	private WebElement emailField;
	
	@FindBy(xpath="(//*[@name='password'])[1]")
	private WebElement passwordField;
	
	@FindBy(xpath="(//*[@class='bootstrapped-input btn btn-primary  '])[1]")
	private WebElement submitButton;
	
	@FindBy(xpath="//*[@class='alert alert-error alert-displayed']")
	private WebElement notValidAuthField;
	
	public WebElement getNotValidAuthField() {
		return notValidAuthField;
	}
	
	public String notValidAuthFieldText(){
		return notValidAuthField.getText();
	}
	
	public void submitButtonClick(){
		submitButton.click();
	}
	
	public WebElement getEmailField(){
		return emailField;
	}
	
	public void enterEmail (String email) {
		emailField.sendKeys(email);
	}
	
	public void enterPassword (String password) {
		passwordField.sendKeys(password);
	}
}
