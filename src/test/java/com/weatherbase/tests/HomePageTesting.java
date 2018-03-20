package com.weatherbase.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.weatherbase.pages.HomePage;
import com.weatherbase.utilities.TestBase;

public class HomePageTesting extends TestBase {

	@Test(priority = 0)
	public void TC001() {
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
	public void TC002() throws InterruptedException {
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
	public void TC003() throws InterruptedException {
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

	@Test(priority = 3)
	public void TC007() {
		HomePage homepage = new HomePage();
		System.out.println(driver.getTitle());
		assertTrue(homepage.isAt());
		homepage.northAmerica.click();
		assertEquals("North America Travel Weather Averages (Weatherbase)", driver.getTitle());
		assertEquals("http://www.weatherbase.com/weather/country.php3?r=NOR&regionname=North-America",
				driver.getCurrentUrl());
		homepage.unitedStatesOfAmerica.click();
		assertEquals("United States of America Travel Weather Averages (Weatherbase)", driver.getTitle());
		homepage.dcLink.click();
		assertEquals("District of Columbia, United States of America Travel Weather Averages (Weatherbase)",
				driver.getTitle());
		assertEquals(homepage.averageTemperature.getText(), "Average Temperature (F)");
		assertEquals(homepage.averageHighTemperature.getText(), "Average High Temperature (F)");
		assertEquals(homepage.averageLowTemperature.getText(), "Average Low Temperature (F)");
		homepage.C.click();
		assertEquals(homepage.averageTemperature.getText(), "Average Temperature (C)");
		assertEquals(homepage.averageHighTemperature.getText(), "Average High Temperature (C)");
		assertEquals(homepage.averageLowTemperature.getText(), "Average Low Temperature (C)");

	}
	@Test(priority = 4)
	public void TC008() {
		HomePage homepage = new HomePage();
		System.out.println(driver.getTitle());
		assertTrue(homepage.F.isDisplayed());
		homepage.northAmerica.click();
		assertEquals("North America Travel Weather Averages (Weatherbase)", driver.getTitle());
		assertEquals("http://www.weatherbase.com/weather/country.php3?r=NOR&regionname=North-America",
				driver.getCurrentUrl());
		homepage.unitedStatesOfAmerica.click();
		assertEquals("United States of America Travel Weather Averages (Weatherbase)", driver.getTitle());
		homepage.dcLink.click();
		assertEquals("District of Columbia, United States of America Travel Weather Averages (Weatherbase)",
				driver.getTitle());
		assertEquals(homepage.averageTemperature.getText(), "Average Temperature (F)");
		assertEquals(homepage.averageHighTemperature.getText(), "Average High Temperature (F)");
		assertEquals(homepage.averageLowTemperature.getText(), "Average Low Temperature (F)");
		homepage.washingtonLink.click();
		assertEquals("Washington, District of Columbia Travel Weather Averages (Weatherbase)", driver.getTitle());
		assertEquals(homepage.AverageTemperatureF.getText(), "F");
		assertEquals(homepage.AverageHighTemperatureF.getText(), "F");
		assertEquals(homepage.AverageLowTemperatureF.getText(), "F");
		homepage.C.click();
		assertEquals(homepage.AverageTemperatureF.getText(), "C");
		assertEquals(homepage.AverageHighTemperatureF.getText(), "C");
		assertEquals(homepage.AverageLowTemperatureF.getText(), "C");

}

	@Test(priority = 5)
	public void TC009() {
		HomePage homepage = new HomePage();
		System.out.println(driver.getTitle());
		homepage.F.isDisplayed();
		homepage.northAmerica.click();
		assertEquals("North America Travel Weather Averages (Weatherbase)", driver.getTitle());
		assertEquals("http://www.weatherbase.com/weather/country.php3?r=NOR&regionname=North-America",
				driver.getCurrentUrl());
		homepage.unitedStatesOfAmerica.click();
		assertEquals("United States of America Travel Weather Averages (Weatherbase)", driver.getTitle());
		homepage.dcLink.click();
		assertEquals("District of Columbia, United States of America Travel Weather Averages (Weatherbase)",
				driver.getTitle());
		homepage.washingtonLink.click();
		assertEquals("Washington, District of Columbia Travel Weather Averages (Weatherbase)", driver.getTitle());
		assertEquals(homepage.annual.getText(), "F 58.2 36 39 46.8 56.8 66 75.2 79.8 78.1 71 59.5 49.6 39.7");

	}

}