package com.weatherbase.tests;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

import com.weatherbase.pages.HomePage;
import com.weatherbase.pages.UnitedStatesPage;
import com.weatherbase.utilities.TestBase;

public class UnitedStatesPageTests extends TestBase {
	@Test
	public void verifyDCAndUSA() {
		HomePage homepage = new HomePage();
		assertTrue(homepage.setUnits.isDisplayed());
		homepage.unitedStatesLink.click();
		
		UnitedStatesPage uspage = new UnitedStatesPage();
		
		
	}
}
