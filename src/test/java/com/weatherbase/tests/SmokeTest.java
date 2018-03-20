package com.weatherbase.tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.weatherbase.pages.HomePage;
import com.weatherbase.utilities.BrowserUtils;
import com.weatherbase.utilities.TestBase;

public class SmokeTest extends TestBase {
	@Test(groups = "smoke")
	public void TC001() {
		HomePage homePage = new HomePage();
		assertTrue(homePage.isAt());
		assertTrue(homePage.setUnits.isDisplayed());// ASK for DIMON
		BrowserUtils.highLighterBackgroundAndArea(homePage.unitedStatesLink);
		homePage.unitedStatesLink.click();
		BrowserUtils.highLighterBackgroundAndArea(homePage.dcLink);
		homePage.dcLink.click();
		BrowserUtils.highLighterBackgroundAndArea(homePage.washingtonLink);
		homePage.washingtonLink.click();
		BrowserUtils.highLighterBackgroundAndArea(homePage.dailyAveragesLink);
		homePage.dailyAveragesLink.click();
		System.out.println("After clicking to Daily averages current title is: " + driver.getTitle());
		assertTrue(driver.getTitle().contains("Washington, District of Columbia - March"));
		BrowserUtils.highLighterBackgroundAndArea(homePage.march1);
		homePage.march1.click();
		assertTrue(homePage.tableDailyWeather.getText().contains("Temperature"));

	}
}