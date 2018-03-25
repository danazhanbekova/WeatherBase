package com.weatherbase.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.weatherbase.pages.HomePage;
import com.weatherbase.utilities.TestBase;

public class TestCase10_11_12 extends TestBase{

	
	@Test
	public void test1() {
		HomePage homePage = new HomePage();
		Assert.assertEquals("Travel Weather Averages (Weatherbase)", driver.getTitle());
		assertTrue(homePage.F.isDisplayed());
		homePage.northAmerica.click();
		assertEquals("North America Travel Weather Averages (Weatherbase)", driver.getTitle());
		assertEquals("http://www.weatherbase.com/weather/country.php3?r=NOR&regionname=North-America", driver.getCurrentUrl());
		homePage.unitedStatesOfAmerica.click();
		assertEquals("United States of America Travel Weather Averages (Weatherbase)", driver.getTitle());
		homePage.dcLink.click();
		assertEquals("District of Columbia, United States of America Travel Weather Averages (Weatherbase)", driver.getTitle());
		homePage.washingtonLink.click();
		assertEquals("Washington, District of Columbia Travel Weather Averages (Weatherbase)",driver.getTitle());
//		homePage.C.click();
//		//assertEquals(homePage.C1.getText(),"")
//		assertEquals(homePage.averageTemperature.getText(), "Average Temperature (C)");
//		assertEquals(homePage.averageHighTemperature.getText(), "Average High Temperature (C)");
//		assertEquals(homePage.averageLowTemperature.getText(), "Average Low Temperature (C)");
		
	}
		
		@Test
		public void test2() {
			HomePage homePage = new HomePage();
			Assert.assertEquals("Travel Weather Averages (Weatherbase)", driver.getTitle());
			assertTrue(homePage.F.isDisplayed());
			homePage.northAmerica.click();
			assertEquals("North America Travel Weather Averages (Weatherbase)", driver.getTitle());
			assertEquals("http://www.weatherbase.com/weather/country.php3?r=NOR&regionname=North-America", driver.getCurrentUrl());
			homePage.unitedStatesOfAmerica.click();
			assertEquals("United States of America Travel Weather Averages (Weatherbase)", driver.getTitle());
			homePage.dcLink.click();
			assertEquals("District of Columbia, United States of America Travel Weather Averages (Weatherbase)", driver.getTitle());
			homePage.washingtonLink.click();
			assertEquals("Washington, District of Columbia Travel Weather Averages (Weatherbase)",driver.getTitle());	
		}
		
		@Test
		public void test3() {
			HomePage homePage = new HomePage();
			Assert.assertEquals("Travel Weather Averages (Weatherbase)", driver.getTitle());
			assertTrue(homePage.F.isDisplayed());
			homePage.northAmerica.click();
			assertEquals("North America Travel Weather Averages (Weatherbase)", driver.getTitle());
			assertEquals("http://www.weatherbase.com/weather/country.php3?r=NOR&regionname=North-America", driver.getCurrentUrl());
			homePage.unitedStatesOfAmerica.click();
			assertEquals("United States of America Travel Weather Averages (Weatherbase)", driver.getTitle());
			homePage.dcLink.click();
			assertEquals("District of Columbia, United States of America Travel Weather Averages (Weatherbase)", driver.getTitle());
			homePage.washingtonLink.click();
			assertEquals("Washington, District of Columbia Travel Weather Averages (Weatherbase)",driver.getTitle());
		}
		
		
	}


