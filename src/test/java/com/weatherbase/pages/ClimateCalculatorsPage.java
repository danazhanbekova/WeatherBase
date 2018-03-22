package com.weatherbase.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.weatherbase.utilities.Driver;

public class ClimateCalculatorsPage {
	private WebDriver driver;
	public ClimateCalculatorsPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//div[@id='subsubheaderfont'])[1]")
	public WebElement convertTemperature;
	@FindBy(xpath = "(//div[@id='subsubheaderfont'])[2]")
	public WebElement convertWindChill;
	@FindBy(xpath = "(//div[@id='subsubheaderfont'])[3]")
	public WebElement convertHeadIndex;
	@FindBy(xpath = "(//div[@id='subsubheaderfont'])[4]")
	public WebElement convertWindSpeed;
	@FindBy(xpath = "(//div[@id='subsubheaderfont'])[5]")
	public WebElement convertRelativeHumidity;
	@FindBy(xpath = "(//div[@id='subsubheaderfont'])[6]")
	public WebElement convertPressure;
	@FindBy(xpath = "(//div[@id='subsubheaderfont'])[7]")
	public WebElement convertPrecipitation;
	
	@FindBy(xpath="//input[@name='millibars']")
	public WebElement millibarsField;
	@FindBy(xpath="//input[@name='inches']")
	public WebElement inchesField;
	@FindBy(xpath="//input[@name='millimeters']")
	public WebElement millimeters;
	
	@FindBy(xpath="(//input[@src='/gr/compute-button.png'])[3]")
	public WebElement computeButtonPressure;
	@FindBy(xpath="//input[@src='/gr/reset-button-hover.png']")
	public WebElement resetButton;
	
	@FindBy(xpath="(//input[@value='Fahrenheit'])[1]")
	public WebElement radioButtonFahrenheit;
	@FindBy(xpath="(//input[@value='mph'])[1]")
	public WebElement radioButtonmph;
}
