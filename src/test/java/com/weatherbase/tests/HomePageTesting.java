package com.weatherbase.tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.weatherbase.page.HomePage;
import com.weatherbase.utilities.TestBase;

public class HomePageTesting extends TestBase {

	@Test
	public void test() {
		HomePage homePage = new HomePage(driver);
		System.out.println(driver.getTitle());
		assertTrue(homePage.isAt());
		System.out.println(homePage.setUnits.getText());
		assertTrue(homePage.setUnits.isEnabled());
		homePage.unitedStatesLink.click();
		homePage.DClink.click();
		homePage.washingtonLink.click();
		homePage.dailyAveragesLink.click();
		System.out.println(driver.getTitle());
		assertTrue(driver.getTitle()
				.contains("Washington, District of Columbia - March 14th - Daily Weather Averages (Weatherbase)"));
		homePage.march1.click();
		homePage.listOfTables();
	}

}
