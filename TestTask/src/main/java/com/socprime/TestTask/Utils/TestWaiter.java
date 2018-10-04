package com.socprime.TestTask.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestWaiter {

	private WebDriverWait waiter = null;
	
	public TestWaiter(WebDriver driver, long millis) {
		if (waiter == null)
			waiter = new WebDriverWait(driver, millis);
	}
	
	public void waitForElement(WebElement element) {
		waiter.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void waitForUrlToBe(String urlToBe) {
		waiter.until(ExpectedConditions.urlToBe(urlToBe));
	}
	
	public void visibilityOfElementLocated(By locator) {
		waiter.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
}
