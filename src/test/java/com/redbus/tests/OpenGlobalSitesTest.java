package com.redbus.tests;

import java.util.ArrayList;
import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.redbus.pages.HomePage;
import com.redbus.utils.CommomUtils;

public class OpenGlobalSitesTest extends Base {

	private String sheetName = "RedBusTest";

	@Test(groups = { "valid" }, priority = 1)
	public void validGlobalPage1() throws InterruptedException{
		extentTest = extent.startTest(prop.getProperty("global_one"));
		String testcase = "When_User_Clicks_Global_Site";
		HomePage h = new HomePage(driver);
		
		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();
		CommomUtils.toCheckExecutionRequired(executionRequired);

		h.clickGlobalSingaporeBtn();
		
		ArrayList<String> handle = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(handle.get(1));
		Thread.sleep(2000);	
		
		String expected = driver.getTitle();
		Assert.assertEquals(expected, prop.getProperty("global_one_Assert"));
		log.info("When_User_Clicks_Global_Site_1 Test Case passed");
		Thread.sleep(5000);
		
	}
	
	
	@Test(groups = { "valid" }, priority = 2)
	public void validGlobalPage2() throws InterruptedException{
		extentTest = extent.startTest(prop.getProperty("global_two"));

		String testcase = "When_User_Clicks_Global_Site";
		HomePage h = new HomePage(driver);
		
		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();
		CommomUtils.toCheckExecutionRequired(executionRequired);

		h.clickGlobalMalaysiaBtn();
		
		ArrayList<String> handle = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(handle.get(1));
		Thread.sleep(2000);
	
		
		String expected = driver.getTitle();
		Assert.assertEquals(expected, prop.getProperty("global_two_Assert"));
		log.info("When_User_Clicks_Global_Site_2 Test Case passed");
		Thread.sleep(2000);
		
	}
	
	
	@Test(groups = { "valid" }, priority = 3)
	public void validGlobalPage3() throws InterruptedException{
		extentTest = extent.startTest(prop.getProperty("global_three"));
		String testcase = "When_User_Clicks_Global_Site";
		HomePage h = new HomePage(driver);
		
		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();
		CommomUtils.toCheckExecutionRequired(executionRequired);

		h.clickGlobalIndonesiaBtn();
		
		ArrayList<String> handle = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(handle.get(1));
		Thread.sleep(2000);
	
		
		String expected = driver.getTitle();
		Assert.assertEquals(expected, prop.getProperty("global_three_Assert"));
		log.info("When_User_Clicks_Global_Site_3 Test Case passed");
		Thread.sleep(5000);
		
	}
	
	
	@Test(groups = { "valid" }, priority = 4)
	public void validGlobalPage4() throws InterruptedException{
		extentTest = extent.startTest(prop.getProperty("global_four"));
		String testcase = "When_User_Clicks_Global_Site";
		HomePage h = new HomePage(driver);
		
		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();
		CommomUtils.toCheckExecutionRequired(executionRequired);

		h.clickGlobalPeruBtn();
	
		ArrayList<String> handle = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(handle.get(1));
		Thread.sleep(2000);
		
		String expected = driver.getTitle();
		Assert.assertEquals(expected, prop.getProperty("global_four_Assert"));
		log.info("When_User_Clicks_Global_Site_4 Test Case passed");
		Thread.sleep(2000);
		
	}
	
	
	@Test(groups = { "valid" }, priority = 5)
	public void validGlobalPage5() throws InterruptedException{
		extentTest = extent.startTest(prop.getProperty("global_five"));
		String testcase = "When_User_Clicks_Global_Site";
		HomePage h = new HomePage(driver);
		
		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();
		CommomUtils.toCheckExecutionRequired(executionRequired);

		h.clickGlobalColombiaBtn();
		
		ArrayList<String> handle = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(handle.get(1));
		Thread.sleep(2000);
	
		
		String expected = driver.getTitle();
		Assert.assertEquals(expected, prop.getProperty("global_five_Assert"));
		log.info("When_User_Clicks_Global_Site_5 Test Case passed");
		Thread.sleep(2000);
		
	}


	
}
