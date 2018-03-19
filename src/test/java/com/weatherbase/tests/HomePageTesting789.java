package com.weatherbase.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.weatherbase.pages.HomePage;
import com.weatherbase.utilities.TestBase;

public class HomePageTesting789 extends TestBase{

	@Test (priority = 0)
	public void test1(){
		HomePage homepage = new HomePage(driver);
		System.out.println(driver.getTitle());
		assertTrue(homepage.isAt());
		homepage.northAmerica.click();
		assertEquals("North America Travel Weather Averages (Weatherbase)", driver.getTitle());
		assertEquals("http://www.weatherbase.com/weather/country.php3?r=NOR&regionname=North-America", driver.getCurrentUrl());
		homepage.unitedStatesOfAmerica.click();
		assertEquals("United States of America Travel Weather Averages (Weatherbase)", driver.getTitle());
		homepage.DClink.click();
		assertEquals("District of Columbia, United States of America Travel Weather Averages (Weatherbase)", driver.getTitle());
		assertEquals(homepage.averageTemperature.getText(), "Average Temperature (F)");
		assertEquals(homepage.averageHighTemperature.getText(), "Average High Temperature (F)");
		assertEquals(homepage.averageLowTemperature.getText(), "Average Low Temperature (F)");
		homepage.C.click();
		assertEquals(homepage.averageTemperature.getText(), "Average Temperature (C)");
		assertEquals(homepage.averageHighTemperature.getText(), "Average High Temperature (C)");
		assertEquals(homepage.averageLowTemperature.getText(), "Average Low Temperature (C)");
		
	}
	
	@Test (priority = 1)
	public void test2(){
		HomePage homepage = new HomePage(driver);
		System.out.println(driver.getTitle());
		assertTrue(homepage.F.isDisplayed());
		homepage.northAmerica.click();
		assertEquals("North America Travel Weather Averages (Weatherbase)", driver.getTitle());
		assertEquals("http://www.weatherbase.com/weather/country.php3?r=NOR&regionname=North-America", driver.getCurrentUrl());
		homepage.unitedStatesOfAmerica.click();
		assertEquals("United States of America Travel Weather Averages (Weatherbase)", driver.getTitle());
		homepage.DClink.click();
		assertEquals("District of Columbia, United States of America Travel Weather Averages (Weatherbase)", driver.getTitle());
		assertEquals(homepage.averageTemperature.getText(), "Average Temperature (F)");
		assertEquals(homepage.averageHighTemperature.getText(), "Average High Temperature (F)");
		assertEquals(homepage.averageLowTemperature.getText(), "Average Low Temperature (F)");
		homepage.washingtonLink.click();
		assertEquals("Washington, District of Columbia Travel Weather Averages (Weatherbase)",driver.getTitle());
		assertEquals(homepage.AverageTemperatureF.getText(), "F");
		assertEquals(homepage.AverageHighTemperatureF.getText(), "F");
		assertEquals(homepage.AverageLowTemperatureF.getText(), "F");
		homepage.C.click();
		assertEquals(homepage.AverageTemperatureF.getText(), "C");
		assertEquals(homepage.AverageHighTemperatureF.getText(), "C");
		assertEquals(homepage.AverageLowTemperatureF.getText(), "C");
		
	}
	
	@Test (priority = 2 )
	public void test3(){
		HomePage homepage = new HomePage(driver);
		System.out.println(driver.getTitle());
		homepage.F.isDisplayed();
		homepage.northAmerica.click();
		assertEquals("North America Travel Weather Averages (Weatherbase)", driver.getTitle());
		assertEquals("http://www.weatherbase.com/weather/country.php3?r=NOR&regionname=North-America", driver.getCurrentUrl());
		homepage.unitedStatesOfAmerica.click();
		assertEquals("United States of America Travel Weather Averages (Weatherbase)", driver.getTitle());
		homepage.DClink.click();
		assertEquals("District of Columbia, United States of America Travel Weather Averages (Weatherbase)", driver.getTitle());
		homepage.washingtonLink.click(); 
		assertEquals("Washington, District of Columbia Travel Weather Averages (Weatherbase)",driver.getTitle());
		assertEquals( homepage.annual.getText(), "F 58.2 36 39 46.8 56.8 66 75.2 79.8 78.1 71 59.5 49.6 39.7");
		
	}
	
	
}
