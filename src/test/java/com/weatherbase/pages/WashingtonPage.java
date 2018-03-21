package com.weatherbase.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.weatherbase.utilities.Driver;

public class WashingtonPage {
	private WebDriver driver;
	public WashingtonPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Washington")
	public WebElement washingtonLink;
	@FindBy(xpath="(//tbody/tr)[15]")
	public List<WebElement> tableRowAverageTemps;
	@FindBy(xpath="(//img[@title='Chart This'])[1]")
	public WebElement averageTempChartThis;
	@FindBy(linkText = "Washington")
	public WebElement chartToolTip;
	
}
