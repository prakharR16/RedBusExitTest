package com.redbus.tests;

import java.util.ArrayList;
import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.redbus.pages.HomePage;
import com.redbus.utils.CommomUtils;

public class BusHireTest extends Base {

	private String sheetName = "RedBusTest";

	@Test(groups = { "valid" }, priority = 1)
	public void validBusHireBtn() throws InterruptedException{
		extentTest = extent.startTest(prop.getProperty("Bus_Hire_one"));
		String testcase = "When_User_Clicks_Bus_Hire";
		HomePage h = new HomePage(driver);
		
		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();
		CommomUtils.toCheckExecutionRequired(executionRequired);

		h.clickNav_bus_hire();
		Thread.sleep(2000);
		
		
		String expected = driver.getTitle();
		Assert.assertEquals(expected, prop.getProperty("Bus_Hire_Assert"));
		log.info("When_User_Clicks_Bus_Hire Test Case passed");
		Thread.sleep(5000);

		
	}
	
	@Test(groups = { "valid" }, priority = 1)
	public void validBusHireForm() throws InterruptedException{
		extentTest = extent.startTest(prop.getProperty("Bus_Hire_two"));
		String testcase = "When_User_Clicks_Bus_Hire_And_Data";
		HomePage h = new HomePage(driver);
		
		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();
		CommomUtils.toCheckExecutionRequired(executionRequired);

		h.clickNav_bus_hire();
		Thread.sleep(2000);
		//add more steps
		
		String expected = driver.getTitle();
		Assert.assertEquals(expected, prop.getProperty("Bus_Hire_two_Assert"));
		log.info("When_User_Clicks_Bus_Hire Test Case passed");
		Thread.sleep(5000);

		
	}


}
