package com.redbus.utils;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentsReporting {

	// for extent reporting
	public static ExtentReports extent;
	public static ExtentTest extentTest;

	// start report instance
	@BeforeSuite
	public void setExtent() {
		extent = new ExtentReports("C:\\Users\\prakharrastogi01\\eclipse-workspace\\practice\\SeleniumAssignmentFinal\\Reports\\ExtentReports.html");

	}

	// close report instance
	@AfterSuite
	public void endReport() {
		extent.flush();
		extent.close();
	}

	@AfterMethod
	public static void closeBrowser() {
		extent.endTest(extentTest);
	}

}
