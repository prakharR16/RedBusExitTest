package com.redbus.tests;

import java.util.ArrayList;
import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.redbus.pages.BusHirePage;
import com.redbus.pages.HomePage;
import com.redbus.utils.CommomUtils;

public class BusHireTest extends Base {

	private String sheetName = "RedBusTest";
	private String sheetName1 = "BusHireTest";

	
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
		Thread.sleep(2000);

		
	}
	
	@Test(groups = { "valid" }, priority = 1)
	public void validBusHireForm1() throws InterruptedException{
		extentTest = extent.startTest(prop.getProperty("Bus_Hire_two"));
		String testcase = "When_User_Clicks_Bus_Hire_And_Data_Outstation";
		HomePage h = new HomePage(driver);
		BusHirePage bh = new BusHirePage(driver);
		
		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName1, testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();
		CommomUtils.toCheckExecutionRequired(executionRequired);
		
		String pickup_Location = data.get("From");
		String destination_Location = data.get("To");
		String nop = data.get("Nop");
		String pick = data.get("pick");
		String dest = data.get("dest");

		h.clickNav_bus_hire();
		
		bh.clickOnOutstationMenu();
		bh.enterPickup(pickup_Location);
		bh.enterdestination(destination_Location);
		bh.enternop(nop);
		bh.ForOutstation(pick, dest);
		bh.clickProceed();
		
		Thread.sleep(2000);
		
		String expected = driver.getTitle();
		Assert.assertEquals(expected, prop.getProperty("Bus_Hire_two_Assert"));
		log.info("When_User_Clicks_Bus_Hire Test Case passed");
		Thread.sleep(2000);

		
	}
	
	@Test(groups = { "valid" }, priority = 1)
	public void validBusHireForm2() throws InterruptedException{
		extentTest = extent.startTest(prop.getProperty("Bus_Hire_three"));
		String testcase = "When_User_Clicks_Bus_Hire_And_Data_Local";
		HomePage h = new HomePage(driver);
		BusHirePage bh = new BusHirePage(driver);
		
		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName1, testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();
		CommomUtils.toCheckExecutionRequired(executionRequired);
		
		String pickup_Location = data.get("From");
		String nop = data.get("Nop");

		h.clickNav_bus_hire();
		
		bh.clickOnLocalMenu();
		bh.enterPickup(pickup_Location);
		bh.enternop(nop);
		bh.ForLocal();
		bh.clickLocalProceed();
		
		Thread.sleep(2000);

		String expected = driver.getTitle();
		Assert.assertEquals(expected, prop.getProperty("Bus_Hire_two_Assert"));
		log.info("When_User_Clicks_Bus_Hire Test Case passed");
		Thread.sleep(2000);

		
	}



}
