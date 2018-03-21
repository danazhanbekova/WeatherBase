package com.weatherbase.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.weatherbase.utilities.Driver;

public class UnitedStatesPage {
	private WebDriver driver;

	public UnitedStatesPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}

	public boolean isAt() {
		System.out.println("Current title is: " + driver.getTitle());
		return driver.getTitle().equals("Travel Weather Averages (Weatherbase)");
	}
	@FindBy(xpath = "//gwd-taparea[@id='close-button']")
	public WebElement popUpCloseButton;
	@FindBy(xpath = "//gwd-taparea[@id='gwd-taparea_cta']")
	public WebElement popUpBanner;
	@FindBy(linkText = "District of Columbia")
	public WebElement dcLink;
	
	
	
	////////////////////////////////////
	//CHART POP UP
	
	
	
	//END CHART POP UP
	///////////////////////////////////////////////////////
}
