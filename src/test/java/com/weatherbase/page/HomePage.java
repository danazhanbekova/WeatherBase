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

	public void listOfTables() {
		List<WebElement> tables = driver.findElements(By.xpath("//div[@id='left1']//table//thead//td[1]")); // div[@id='left1']//table//thead//tr
		for (WebElement list : tables) {
			System.out.println(list.getText());
		}

	}
}
