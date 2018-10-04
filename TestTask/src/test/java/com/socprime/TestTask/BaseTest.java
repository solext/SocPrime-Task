package com.socprime.TestTask;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.socprime.TestTask.Utils.TestWaiter;

public class BaseTest {

	protected WebDriver driver;
	protected static TestWaiter waiter;
	
	
	@BeforeClass
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		
		driver = new ChromeDriver();
		waiter = new TestWaiter(driver, 25);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void shutDown () {
		driver.quit();
	}
}
