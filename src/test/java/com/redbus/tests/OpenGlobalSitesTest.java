package com.redbus.tests;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.redbus.pages.HomePage;
import com.redbus.utils.CommomUtils;

public class OpenGlobalSitesTest extends Base {

	//three country sites
	private String sheetName = "SearchBusTest";

	@Test(groups = { "valid" }, priority = 1)
	public void validGlobalPage1() throws InterruptedException{
		extentTest = extent.startTest("Change travel date");
		String testcase = "When_User_Clicks_Cancel_Ticket";
		HomePage h = new HomePage(driver);
		
		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();
		CommomUtils.toCheckExecutionRequired(executionRequired);

		h.clickGlobalSingaporeBtn();
	
		
		String expected = driver.getTitle();
//		Assert.assertEquals(expected, prop.getProperty("About_us_Assert"));
		log.info("When_User_Clicks_About_Us Test Case passed");
		Thread.sleep(5000);
		
	}
	@Test(groups = { "valid" }, priority = 2)
	public void validGlobalPage2() throws InterruptedException{
		extentTest = extent.startTest("Change travel date");
		String testcase = "When_User_Clicks_Cancel_Ticket";
		HomePage h = new HomePage(driver);
		
		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();
		CommomUtils.toCheckExecutionRequired(executionRequired);

		h.clickGlobalMalaysiaBtn();
	
		
		String expected = driver.getTitle();
//		Assert.assertEquals(expected, prop.getProperty("About_us_Assert"));
		log.info("When_User_Clicks_About_Us Test Case passed");
		Thread.sleep(2000);
		
	}
	@Test(groups = { "valid" }, priority = 3)
	public void validGlobalPage3() throws InterruptedException{
		extentTest = extent.startTest("Change travel date");
		String testcase = "When_User_Clicks_Cancel_Ticket";
		HomePage h = new HomePage(driver);
		
		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();
		CommomUtils.toCheckExecutionRequired(executionRequired);

		h.clickGlobalIndonesiaBtn();
	
		
		String expected = driver.getTitle();
//		Assert.assertEquals(expected, prop.getProperty("About_us_Assert"));
		log.info("When_User_Clicks_About_Us Test Case passed");
		Thread.sleep(5000);
		
	}
	@Test(groups = { "valid" }, priority = 3)
	public void validGlobalPage4() throws InterruptedException{
		extentTest = extent.startTest("Change travel date");
		String testcase = "When_User_Clicks_Cancel_Ticket";
		HomePage h = new HomePage(driver);
		
		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();
		CommomUtils.toCheckExecutionRequired(executionRequired);

		h.clickGlobalPeruBtn();
	
		
		String expected = driver.getTitle();
//		Assert.assertEquals(expected, prop.getProperty("About_us_Assert"));
		log.info("When_User_Clicks_Peru_Site Test Case passed");
		Thread.sleep(2000);
		
	}
	@Test(groups = { "valid" }, priority = 4)
	public void validGlobalPage5() throws InterruptedException{
		extentTest = extent.startTest("Change travel date");
		String testcase = "When_User_Clicks_Cancel_Ticket";
		HomePage h = new HomePage(driver);
		
		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();
		CommomUtils.toCheckExecutionRequired(executionRequired);

		h.clickGlobalColombiaBtn();
	
		
		String expected = driver.getTitle();
//		Assert.assertEquals(expected, prop.getProperty("About_us_Assert"));
		log.info("When_User_Clicks_Colombia Test Case passed");
		Thread.sleep(2000);
		
	}


	
}
