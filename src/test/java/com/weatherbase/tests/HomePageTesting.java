package com.weatherbase.tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.weatherbase.pages.HomePage;
import com.weatherbase.utilities.TestBase;

public class HomePageTesting extends TestBase {

	@Test(priority = 0, groups = "smoke")
	public void selectingDailyAvearges() {
		HomePage homePage = new HomePage();
		assertTrue(homePage.isAt());
		assertTrue(homePage.setUnits.isDisplayed());// ASK for DIMON
		homePage.unitedStatesLink.click();
		homePage.dcLink.click();
		homePage.washingtonLink.click();
		homePage.dailyAveragesLink.click();
		System.out.println("After clicking to Daily averages current title is: " + driver.getTitle());
		assertTrue(driver.getTitle().contains("Washington, District of Columbia - March"));
		homePage.march1.click();
		assertTrue(homePage.tableDailyWeather.getText().contains("Temperature"));

	}

	@Test(priority = 1)
	public void afterSelectingDailyAverage() throws InterruptedException {
		HomePage homePage = new HomePage();
		assertTrue(homePage.setUnits.isDisplayed());
		homePage.unitedStatesLink.click();
		homePage.dcLink.click();
		homePage.washingtonLink.click();
		homePage.dailyAveragesLink.click();
		Thread.sleep(3000);
		homePage.march1.click();
		System.out.println(homePage.temperature.getText() + "\n" + homePage.dewpoint.getText());
		homePage.containsFahrengeit();
		homePage.celciusNearTable.click();
		System.out.println(homePage.temperature.getText() + "\n" + homePage.dewpoint.getText());
		homePage.containsCelcius();
	}

	@Test(priority = 2)
	public void calculatingValuesAfterSelecting() throws InterruptedException {
		HomePage homePage = new HomePage();
		assertTrue(homePage.setUnits.isDisplayed());
		homePage.unitedStatesLink.click();
		homePage.dcLink.click();
		homePage.washingtonLink.click();
		homePage.dailyAveragesLink.click();
		Thread.sleep(3000);
		homePage.march1.click();
		System.out.println(homePage.temperature.getText() + "\n" + homePage.dewpoint.getText());
		homePage.containsFahrengeit();
		homePage.celciusNearTable.click();
		System.out.println(homePage.temperature.getText() + "\n" + homePage.dewpoint.getText());
		homePage.containsCelcius();

		homePage.extractNumberFromString(homePage.temperature.getText());
		homePage.extractNumberFromString(homePage.dewpoint.getText());

		homePage.convertFahToCel();

	}

}