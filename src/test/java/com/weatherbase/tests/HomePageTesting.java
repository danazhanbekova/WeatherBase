package com.weatherbase.tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.weatherbase.pages.HomePage;
import com.weatherbase.utilities.TestBase;

public class HomePageTesting extends TestBase {

	@Test(priority = 0, groups = "smoke")
	public void selectingDailyAvearges() {
		HomePage homePage = new HomePage(driver);
		System.out.println(driver.getTitle());
		assertTrue(homePage.isAt());
		assertTrue(homePage.setUnits.isDisplayed());// ASK for DIMON
		homePage.unitedStatesLink.click();
		homePage.DClink.click();
		homePage.washingtonLink.click();
		homePage.dailyAveragesLink.click();
		System.out.println("Current title is: " + driver.getTitle());
		assertTrue(driver.getTitle()
				.contains("Washington, District of Columbia - March 14th - Daily Weather Averages (Weatherbase)"));
		homePage.march1.click();
		assertTrue(homePage.tableDailyWeather.getText().contains("Temperature"));

	}

	@Test(priority = 1)
	public void afterSelectingDailyAverage() {
		HomePage homePage = new HomePage(driver);
		assertTrue(homePage.setUnits.isDisplayed());
		homePage.unitedStatesLink.click();
		homePage.DClink.click();
		homePage.washingtonLink.click();
		homePage.dailyAveragesLink.click();
		System.out.println(homePage.temperature.getText() + "\n" + homePage.dewpoint.getText());
		homePage.containsFahrengeit();
		homePage.celciusNearTAble.click();
		System.out.println(homePage.temperature.getText() + "\n" + homePage.dewpoint.getText());
		homePage.containsCelcius();
	}

	@Test
	public void calculatingValuesAfterSelecting() {
		HomePage homePage=new HomePage(driver);
		assertTrue(homePage.setUnits.isDisplayed());
		homePage.unitedStatesLink.click();
		homePage.DClink.click();
		homePage.washingtonLink.click();
		homePage.dailyAveragesLink.click();
		


	}

}
