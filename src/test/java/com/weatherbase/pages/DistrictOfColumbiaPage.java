package com.weatherbase.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.weatherbase.utilities.Driver;

public class DistrictOfColumbiaPage {
	private WebDriver driver;
	public DistrictOfColumbiaPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(linkText = "Washington")
	public WebElement washingtonLink;
}
