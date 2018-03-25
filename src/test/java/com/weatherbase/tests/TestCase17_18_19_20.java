package com.weatherbase.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.weatherbase.pages.ClimateCalculatorsPage;
import com.weatherbase.pages.HomePage;
import com.weatherbase.utilities.TestBase;

public class TestCase17_18_19_20 extends TestBase {
	@Test
	public void verifyConvertPressureCalculator() {
		HomePage homepage = new HomePage();
		assertEquals(driver.getTitle(), "Travel Weather Averages (Weatherbase)");
		homepage.featuresJames.click();
		assertTrue(homepage.headerCompareCities.isDisplayed());
		assertTrue(homepage.headerVacationFinder.isDisplayed());
		assertTrue(homepage.headerWeatherReference.isDisplayed());
		assertTrue(homepage.headerWeatherGlossary.isDisplayed());
		assertTrue(homepage.headerClimateCalculators.isDisplayed());
		assertTrue(homepage.headerWeatherImpactAssessments.isDisplayed());

		homepage.headerClimateCalculators.click();
		assertEquals(driver.getTitle(), "Weatherbase Weather Reference and Calculators");
		assertEquals(driver.getCurrentUrl(), "http://www.weatherbase.com/reference.php3");

		WebDriverWait wait = new WebDriverWait(driver, 5);

		ClimateCalculatorsPage cpage = new ClimateCalculatorsPage();
		wait.until(ExpectedConditions.visibilityOf(cpage.convertTemperature));
		assertTrue(cpage.convertTemperature.isDisplayed());
		assertTrue(cpage.convertWindChill.isDisplayed());
		assertTrue(cpage.convertHeadIndex.isDisplayed());
		assertTrue(cpage.convertWindSpeed.isDisplayed());
		assertTrue(cpage.convertRelativeHumidity.isDisplayed());
		assertTrue(cpage.convertPressure.isDisplayed());
		assertTrue(cpage.convertPrecipitation.isDisplayed());

		cpage.millibarsField.clear();
		cpage.millibarsField.sendKeys("800");
		cpage.computeButtonPressure.click();

		assertEquals(cpage.inchesField.getText(), "23.62");
		assertEquals(cpage.millimeters.getText(), "600.4");
		cpage.resetButton.click();

		assertEquals(cpage.inchesField, "");
		assertEquals(cpage.millimeters, "");
		assertEquals(cpage.millibarsField, "");
	}

	@Test
	public void verifyComputeWindChillCalculator() {
		HomePage homepage = new HomePage();
		assertEquals(driver.getTitle(), "Travel Weather Averages (Weatherbase)");
		homepage.featuresJames.click();
		assertTrue(homepage.headerCompareCities.isDisplayed());
		assertTrue(homepage.headerVacationFinder.isDisplayed());
		assertTrue(homepage.headerWeatherReference.isDisplayed());
		assertTrue(homepage.headerWeatherGlossary.isDisplayed());
		assertTrue(homepage.headerClimateCalculators.isDisplayed());
		assertTrue(homepage.headerWeatherImpactAssessments.isDisplayed());

		homepage.headerClimateCalculators.click();
		assertEquals(driver.getTitle(), "Weatherbase Weather Reference and Calculators");
		assertEquals(driver.getCurrentUrl(), "http://www.weatherbase.com/reference.php3");

		WebDriverWait wait = new WebDriverWait(driver, 5);

		ClimateCalculatorsPage cpage = new ClimateCalculatorsPage();
		wait.until(ExpectedConditions.visibilityOf(cpage.convertTemperature));
		assertTrue(cpage.convertTemperature.isDisplayed());
		assertTrue(cpage.convertWindChill.isDisplayed());
		assertTrue(cpage.convertHeadIndex.isDisplayed());
		assertTrue(cpage.convertWindSpeed.isDisplayed());
		assertTrue(cpage.convertRelativeHumidity.isDisplayed());
		assertTrue(cpage.convertPressure.isDisplayed());
		assertTrue(cpage.convertPrecipitation.isDisplayed());

		cpage.radioButtonFahrenheit.click();
		assertTrue(cpage.radioButtonFahrenheit.isSelected());
		cpage.radioButtonmph.click();
		assertTrue(cpage.radioButtonmph.isSelected());

		cpage.tempWindChillField.sendKeys("45");
		cpage.windSpeedField.sendKeys("15");
		cpage.computeButtonWindChill.click();

		assertEquals(cpage.windSpeedField.getText(), "38");

	}

	@Test
	public void verifyConvertTemperatureCalculator() {
		HomePage homepage = new HomePage();
		assertEquals(driver.getTitle(), "Travel Weather Averages (Weatherbase)");
		homepage.featuresJames.click();
		assertTrue(homepage.headerCompareCities.isDisplayed());
		assertTrue(homepage.headerVacationFinder.isDisplayed());
		assertTrue(homepage.headerWeatherReference.isDisplayed());
		assertTrue(homepage.headerWeatherGlossary.isDisplayed());
		assertTrue(homepage.headerClimateCalculators.isDisplayed());
		assertTrue(homepage.headerWeatherImpactAssessments.isDisplayed());

		homepage.headerClimateCalculators.click();
		assertEquals(driver.getTitle(), "Weatherbase Weather Reference and Calculators");
		assertEquals(driver.getCurrentUrl(), "http://www.weatherbase.com/reference.php3");

		WebDriverWait wait = new WebDriverWait(driver, 5);

		ClimateCalculatorsPage cpage = new ClimateCalculatorsPage();
		wait.until(ExpectedConditions.visibilityOf(cpage.convertTemperature));
		assertTrue(cpage.convertTemperature.isDisplayed());
		assertTrue(cpage.convertWindChill.isDisplayed());
		assertTrue(cpage.convertHeadIndex.isDisplayed());
		assertTrue(cpage.convertWindSpeed.isDisplayed());
		assertTrue(cpage.convertRelativeHumidity.isDisplayed());
		assertTrue(cpage.convertPressure.isDisplayed());
		assertTrue(cpage.convertPrecipitation.isDisplayed());
		cpage.convertTempField.sendKeys("jhdgf");
		cpage.computeButtonConvertPressure.click();

		assertEquals(cpage.convertTempField.getText(), "");

	}

	@Test
	public void verifyComputeRelativeHumidy() {
		HomePage homepage = new HomePage();
		assertEquals(driver.getTitle(), "Travel Weather Averages (Weatherbase)");
		homepage.featuresJames.click();
		assertTrue(homepage.headerCompareCities.isDisplayed());
		assertTrue(homepage.headerVacationFinder.isDisplayed());
		assertTrue(homepage.headerWeatherReference.isDisplayed());
		assertTrue(homepage.headerWeatherGlossary.isDisplayed());
		assertTrue(homepage.headerClimateCalculators.isDisplayed());
		assertTrue(homepage.headerWeatherImpactAssessments.isDisplayed());

		homepage.headerClimateCalculators.click();
		assertEquals(driver.getTitle(), "Weatherbase Weather Reference and Calculators");
		assertEquals(driver.getCurrentUrl(), "http://www.weatherbase.com/reference.php3");

		WebDriverWait wait = new WebDriverWait(driver, 5);

		ClimateCalculatorsPage cpage = new ClimateCalculatorsPage();
		wait.until(ExpectedConditions.visibilityOf(cpage.convertTemperature));
		assertTrue(cpage.convertTemperature.isDisplayed());
		assertTrue(cpage.convertWindChill.isDisplayed());
		assertTrue(cpage.convertHeadIndex.isDisplayed());
		assertTrue(cpage.convertWindSpeed.isDisplayed());
		assertTrue(cpage.convertRelativeHumidity.isDisplayed());
		assertTrue(cpage.convertPressure.isDisplayed());
		assertTrue(cpage.convertPrecipitation.isDisplayed());

		cpage.radioButtonConvertTemp.click();
		assertTrue(cpage.radioButtonConvertTemp.isSelected());

		cpage.tempField.sendKeys("75");
		cpage.dewPointField.sendKeys("30");
		cpage.computeButtonRelativeHumidity.click();
		assertEquals(cpage.relativeHumidyField.getText(), "19");

	}

}
