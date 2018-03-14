package com.weatherbase.page;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.weatherbase.utilities.Driver;

public class HomePage {
	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean isAt() {
		return driver.getTitle().equals("Travel Weather Averages (Weatherbase)");
	}

	@FindBy(xpath = "//table//tbody//tr//img[@src='/gr/f-head-blue.png']")
	public WebElement setUnits;

	@FindBy(linkText = "United States")
	public WebElement unitedStatesLink;

	@FindBy(linkText = "District of Columbia")
	public WebElement DClink;

	@FindBy(linkText = "Washington")
	public WebElement washingtonLink;

	@FindBy(linkText = "Daily Averages")
	public WebElement dailyAveragesLink;

	@FindBy(xpath = "//div//table//td[.='1']")
	public WebElement march1;

	@FindBy(xpath = "//div[@id='left1']//table//thead//td[1]")
	public WebElement tableDailyWeather;

	@FindBy(xpath = "(//div[@id='left1']//table//thead//tr[@class='bb'])[1]")
	public WebElement temperature;// *[@id=\"left1\"]/table/thead/tr[2]/td[2]/b

	@FindBy(xpath = "(//div[@id='left1']//table//thead//tr[@class='bb'])[2]")
	public WebElement dewpoint;

	public void containsFahrengeit() {
		assertTrue(temperature.getText().contains("°F"));
		assertTrue(dewpoint.getText().contains("°F"));
	}

	public void containsCelcius() {
		assertTrue(temperature.getText().contains("°C"));
		assertTrue(dewpoint.getText().contains("°C"));
	}

	@FindBy(xpath = "(//div//table//tr//div//font//a[@class='grayglow'])[2]")
	public WebElement celciusNearTAble;

}
