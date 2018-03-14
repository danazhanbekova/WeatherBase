package com.weatherbase.tests;

import org.testng.annotations.Test;

import com.weatherbase.utilities.Driver;
import com.weatherbase.utilities.TestBase;

public class TestUsingMaven extends TestBase {

	@Test
	public void test() {
		driver = Driver.getDriver("browser");
		driver.get("https://www.google.com/");
	}

	// public static void main(String[] args) {
	//
	// // write a code that takes a string and capitalizes all the words in that
	// string
	// // Only first letters
	// String str = "write a code that takes a string and";
	// str = WordUtils.capitalize(str);
	// System.out.println(str);
	//
	// str = WordUtils.initials(str);
	// System.out.println(str);
	//
	// }

}
