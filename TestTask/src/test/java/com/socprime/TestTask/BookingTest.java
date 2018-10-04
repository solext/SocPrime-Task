package com.socprime.TestTask;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.*;

import com.socprime.TestTask.Pages.MainBookingPage;
import com.socprime.TestTask.Pages.PopupPage;
import com.socprime.TestTask.Pages.SearchPage;
import com.socprime.TestTask.Pages.Constants.Constants;
import com.socprime.TestTask.Utils.TestBaseUtils;

public class BookingTest extends BaseTest {

	MainBookingPage mainPage;
	SearchPage searchPage;
	PopupPage popupPage;
	
	@Test
	public void searchHotelsInNewYork () {
		
		mainPage = new MainBookingPage(driver);
		searchPage= new SearchPage(driver);
				
		mainPage.navigateToMainPage();
		waiter.waitForElement(mainPage.getLogo());
		mainPage.enterLocation("New York");
		mainPage.calendarClick();
				
        waiter.waitForElement(mainPage.getLeftMonth());
        mainPage.leftMonthClick();
                
    	
        if(mainPage.getLeftMonthText().equals(Constants.OCTOBER)) {
        	TestBaseUtils.choiseDateInCalendar(mainPage.getLeftDateColumns(), Constants.FOURTEENID);
		}
				
		if(mainPage.getLeftMonthText().equals(Constants.OCTOBER)) {
        	TestBaseUtils.choiseDateInCalendar(mainPage.getLeftDateColumns(), Constants.TWENTYID);
		}
		mainPage.checkButtonClick();
		waiter.waitForElement(searchPage.getSearchResult());
		assertTrue(TestBaseUtils.compareLocationSearch(Constants.NEWYORK, searchPage.getLocationFieldList()));;
			
	}
	
	@Test
	public void notValidAuth () {
		
		mainPage = new MainBookingPage(driver);
		popupPage = new PopupPage(driver);
		
		mainPage.navigateToMainPage();
		waiter.waitForElement(mainPage.getLogo());
		mainPage.loginButtonClick();
		waiter.waitForElement(popupPage.getEmailField());
		
		popupPage.enterEmail(Constants.EMAIL);
		popupPage.enterPassword(Constants.PASSWORD);
		
		popupPage.submitButtonClick();
		
		waiter.waitForElement(popupPage.getNotValidAuthField());
		assertTrue(Constants.INVALIDAUTHTEXT.contains(popupPage.notValidAuthFieldText()));
		
	}
}
