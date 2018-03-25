package com.weatherbase.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.weatherbase.pages.HomePage;
import com.weatherbase.utilities.TestBase;

public class TestCase10_11_12 extends TestBase {

	@Test(priority = 0)
	public void test1() {
		HomePage homePage = new HomePage();
		Assert.assertEquals("Travel Weather Averages (Weatherbase)", driver.getTitle());
		assertTrue(homePage.F.isDisplayed());
		homePage.northAmerica.click();
		assertEquals("North America Travel Weather Averages (Weatherbase)", driver.getTitle());
		assertEquals("http://www.weatherbase.com/weather/country.php3?r=NOR&regionname=North-America",
				driver.getCurrentUrl());
		homePage.unitedStatesOfAmerica.click();
		assertEquals("United States of America Travel Weather Averages (Weatherbase)", driver.getTitle());
		homePage.dcLink.click();
		assertEquals("District of Columbia, United States of America Travel Weather Averages (Weatherbase)",
				driver.getTitle());
		homePage.washingtonLink.click();
		assertEquals("Washington, District of Columbia Travel Weather Averages (Weatherbase)", driver.getTitle());
		homePage.C.click();
		System.out.println(homePage.cNearTable.getText());
		assertEquals(homePage.cNearTable.getText(), "C", "It doesn't matchs");
		System.out.println(homePage.extractNumberFromString(homePage.allNumerics.getText()));
		assertTrue(homePage.allNumerics.isDisplayed());
	}

	@Test(priority = 1)
	public void test2() {
		HomePage homePage = new HomePage();
		Assert.assertEquals("Travel Weather Averages (Weatherbase)", driver.getTitle());
		assertTrue(homePage.F.isDisplayed());
		homePage.northAmerica.click();
		assertEquals("North America Travel Weather Averages (Weatherbase)", driver.getTitle());
		assertEquals("http://www.weatherbase.com/weather/country.php3?r=NOR&regionname=North-America",
				driver.getCurrentUrl());
		homePage.unitedStatesOfAmerica.click();
		assertEquals("United States of America Travel Weather Averages (Weatherbase)", driver.getTitle());
		homePage.dcLink.click();
		assertEquals("District of Columbia, United States of America Travel Weather Averages (Weatherbase)",
				driver.getTitle());
		homePage.washingtonLink.click();
		assertEquals("Washington, District of Columbia Travel Weather Averages (Weatherbase)", driver.getTitle());

		homePage.extractNumberFromString(homePage.allNumerics.getText());
		homePage.C.click();
		assertEquals(homePage.cNearTable.getText(), "C", "It doesn't matchs");
		homePage.extractNumberFromString(homePage.allNumerics.getText());
		homePage.convertFahToCel(homePage.allNumerics);

	}

	@Test
	public void test3() {
		HomePage homePage = new HomePage();
		Assert.assertEquals("Travel Weather Averages (Weatherbase)", driver.getTitle());
		assertTrue(homePage.F.isDisplayed());
		homePage.northAmerica.click();
		assertEquals("North America Travel Weather Averages (Weatherbase)", driver.getTitle());
		assertEquals("http://www.weatherbase.com/weather/country.php3?r=NOR&regionname=North-America",
				driver.getCurrentUrl());
		homePage.unitedStatesOfAmerica.click();
		assertEquals("United States of America Travel Weather Averages (Weatherbase)", driver.getTitle());
		homePage.dcLink.click();
		assertEquals("District of Columbia, United States of America Travel Weather Averages (Weatherbase)",
				driver.getTitle());
		homePage.washingtonLink.click();
		assertEquals("Washington, District of Columbia Travel Weather Averages (Weatherbase)", driver.getTitle());
		assertEquals("  ANNUAL    JAN    FEB    MAR    APR    MAY    JUN    JUL    AUG    SEP    OCT    NOV    DEC ",
				homePage.annual1.getText());
		assertEquals("  ANNUAL    JAN    FEB    MAR    APR    MAY    JUN    JUL    AUG    SEP    OCT    NOV    DEC ",
				homePage.annual2.getText());
		assertEquals("  ANNUAL    JAN    FEB    MAR    APR    MAY    JUN    JUL    AUG    SEP    OCT    NOV    DEC ",
				homePage.annual3.getText());
		assertEquals("  ANNUAL    JAN    FEB    MAR    APR    MAY    JUN    JUL    AUG    SEP    OCT    NOV    DEC ",
				homePage.annual4.getText());
	}
}
