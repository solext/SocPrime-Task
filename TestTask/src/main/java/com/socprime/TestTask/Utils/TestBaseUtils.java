package com.socprime.TestTask.Utils;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.socprime.TestTask.Pages.Constants.Constants;

public class TestBaseUtils {

	
	public static void choiseDateInCalendar (List<WebElement> list, String day) {
		for (WebElement element : list) {
			if (element.getText().equals(day)) {
				element.click();
				break;
			}
		}
	}
	
	
	public static boolean compareLocationSearch (String name, List<WebElement> search) {
		boolean result = false;
		for (WebElement element : search) {
			String value = element.getText();
			if (value.contains(name)) {
				result = true;
			}
			else {
				result = false;
				System.out.println("Этот результат не принадлежит этому поиску");
				break;
			}
		}
		return result;
	}
	
	
}
