package com.weatherbase.tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.weatherbase.pages.HomePage;
import com.weatherbase.utilities.TestBase;

public class HomePageTesting extends TestBase {

	@Test(priority = 0, groups = "smoke")
	public void selectingDailyAvearges() {
		HomePage homePage = new HomePage(driver);
		assertTrue(homePage.isAt());
		assertTrue(homePage.setUnits.isDisplayed());// ASK for DIMON
		homePage.unitedStatesLink.click();
		homePage.DClink.click();
		homePage.washingtonLink.click();
		homePage.dailyAveragesLink.click();
		System.out.println("After clicking to Daily averages current title is: " + driver.getTitle());
		assertTrue(" Washington, District of Columbia - March 15th - Daily Weather Averages (Weatherbase)"
				.contains(driver.getTitle()));
		homePage.march1.click();
		assertTrue(homePage.tableDailyWeather.getText().contains("Temperature"));

	}

	@Test(priority = 1)
	public void afterSelectingDailyAverage() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		assertTrue(homePage.setUnits.isDisplayed());
		homePage.unitedStatesLink.click();
		homePage.DClink.click();
		homePage.washingtonLink.click();
		homePage.dailyAveragesLink.click();
		Thread.sleep(3000);
		homePage.march1.click();
		System.out.println(homePage.temperature.getText() + "\n" + homePage.dewpoint.getText());
		homePage.containsFahrengeit();
		homePage.celciusNearTAble.click();
		System.out.println(homePage.temperature.getText() + "\n" + homePage.dewpoint.getText());
		homePage.containsCelcius();
	}

	@Test(priority = 2)
	public void calculatingValuesAfterSelecting() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		assertTrue(homePage.setUnits.isDisplayed());
		homePage.unitedStatesLink.click();
		homePage.DClink.click();
		homePage.washingtonLink.click();
		homePage.dailyAveragesLink.click();
		Thread.sleep(3000);
		homePage.march1.click();
		System.out.println(homePage.temperature.getText() + "\n" + homePage.dewpoint.getText());
		homePage.containsFahrengeit();
		homePage.celciusNearTAble.click();
		System.out.println(homePage.temperature.getText() + "\n" + homePage.dewpoint.getText());
		homePage.containsCelcius();

		homePage.extractNumberFromString(homePage.temperature.getText());
		homePage.extractNumberFromString(homePage.dewpoint.getText());

		homePage.convertFahToCel();

	}

	// test case 4
	@Test(priority = 3)
	public void verifytitlematch() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		driver.getTitle();
		assertTrue(homePage.isAt());
		System.out.println("the title is displayed" + driver.getTitle());
		Thread.sleep(3000);

		assertTrue(homePage.isAt());
		assertTrue(homePage.Africa.isDisplayed());
		System.out.println();

		assertTrue(homePage.isAt());
		assertTrue(homePage.Asia.isDisplayed());
		System.out.println();

		assertTrue(homePage.isAt());
		assertTrue(homePage.Australia.isDisplayed());
		System.out.println();

		assertTrue(homePage.isAt());
		assertTrue(homePage.Caribbean.isDisplayed());
		System.out.println();

		assertTrue(homePage.isAt());
		assertTrue(homePage.CentralAmerica.isDisplayed());
		System.out.println();

		assertTrue(homePage.isAt());
		assertTrue(homePage.SouthAmerica.isDisplayed());
		System.out.println();

		assertTrue(homePage.isAt());
		assertTrue(homePage.ShowAll.isDisplayed());
		System.out.println();

		// north america

		assertTrue(homePage.NorthAmerica.isDisplayed());
		homePage.NorthAmerica.click();
		assertTrue(("http://www.weatherbase.com/weather/country.php3?r=NOR&regionname=North-America")
				.contains(driver.getCurrentUrl()));
		Thread.sleep(3000);
		// usa
		assertTrue(homePage.Usa.isDisplayed());
		homePage.Usa.click();
		assertTrue(("United States of America Travel Weather Averages (Weatherbase").contains(driver.getTitle()));
		assertTrue(homePage.Columbia.isDisplayed());
		homePage.Columbia.click();
		assertTrue(("District of Columbia, United States of America  Travel Weather Averages (Weatherbase)")
				.contains(driver.getTitle()));
		assertTrue(homePage.Washington2.isDisplayed());
		homePage.Washington2.click();
		
		assertTrue(("Washington, District of Columbia Travel Weather Averages (Weatherbase)").contains(driver.getTitle()));
		assertTrue(homePage.CurrentConditions.isDisplayed());
		assertTrue(homePage.Temperature.isDisplayed());
		assertTrue(homePage.Wind.isDisplayed());
		assertTrue(homePage.Sunset.isDisplayed());
		assertTrue(homePage.Humidity.isDisplayed());
		assertTrue(homePage.cloud.isDisplayed());
		assertTrue(homePage.Visibility.isDisplayed());
		assertTrue(homePage.Dew.isDisplayed());
		assertTrue(homePage.Preassure.isDisplayed());
		assertTrue(homePage.LocalTime.isDisplayed());
		
	}
}