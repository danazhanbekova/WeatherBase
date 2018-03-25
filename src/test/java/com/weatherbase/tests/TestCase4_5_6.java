package com.weatherbase.tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.weatherbase.pages.HomePage;
import com.weatherbase.utilities.TestBase;

public class TestCase4_5_6 extends TestBase {

	// test case 4
	@Test(priority = 3)
	public void verifytitlematch() throws InterruptedException {
		HomePage homePage = new HomePage();
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
		Thread.sleep(5000);

		assertTrue(
				("Washington, District of Columbia Travel Weather Averages (Weatherbase)").contains(driver.getTitle()));
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
		Thread.sleep(5000);
	}
	// case 5

	@Test(priority = 3)
	public void itsInFarenheit() throws InterruptedException {
		HomePage homePage = new HomePage();
		assertTrue(homePage.isAt());
		assertTrue(homePage.Browser.isDisplayed());
		homePage.Browser.click();
		assertTrue(homePage.Af.isDisplayed());
		assertTrue(homePage.As.isDisplayed());
		assertTrue(homePage.Au.isDisplayed());
		assertTrue(homePage.Car.isDisplayed());
		assertTrue(homePage.CA.isDisplayed());
		assertTrue(homePage.Eu.isDisplayed());
		assertTrue(homePage.ME.isDisplayed());
		assertTrue(homePage.NA.isDisplayed());
		assertTrue(homePage.Sa.isDisplayed());
		assertTrue(homePage.Showa.isDisplayed());
		Thread.sleep(3000);

	}

	// case6
	@Test(priority = 3)
	public void featuresIsDisplayed() throws InterruptedException {
		HomePage homePage = new HomePage();
		assertTrue(homePage.isAt());
		assertTrue(homePage.Features.isDisplayed());
		homePage.Features.click();
		assertTrue(homePage.CompareCities.isDisplayed());
		assertTrue(homePage.VacationF.isDisplayed());
		assertTrue(homePage.WeatherR.isDisplayed());
		assertTrue(homePage.WeatherGlo.isDisplayed());
		assertTrue(homePage.ClimateCal.isDisplayed());
		homePage.ClimateCal.click();
		assertTrue(("Weatherbase Weather Reference and Calculators").contains(driver.getTitle()));
		assertTrue(("http://www.weatherbase.com/reference.php3").contains(driver.getCurrentUrl()));
		assertTrue(homePage.convertT.isDisplayed());
		assertTrue(homePage.computeWind.isDisplayed());
		assertTrue(homePage.CompH.isDisplayed());
		assertTrue(homePage.convertWind.isDisplayed());
		assertTrue(homePage.reHumidity.isDisplayed());
		assertTrue(homePage.ConPressure.isDisplayed());
		assertTrue(homePage.Precip.isDisplayed());

		
	}
}
