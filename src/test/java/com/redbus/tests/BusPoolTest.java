package com.redbus.tests;

import java.util.ArrayList;
import java.util.HashMap;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.redbus.pages.HomePage;
import com.redbus.pages.rpoolPage;
import com.redbus.utils.CommomUtils;

public class BusPoolTest extends Base {

	private String sheetName = "RedBusTest";

	@Test(groups = { "valid" }, priority = 1)
	public void validBusPool() throws InterruptedException{
		
		extentTest = extent.startTest(prop.getProperty("Bus_Pool_one"));
		String testcase = "When_User_Clicks_Bus_Pool";
		HomePage h = new HomePage(driver);

		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();
		CommomUtils.toCheckExecutionRequired(executionRequired);
		
		h.clickNavrPool();
			
		//Slowly scroll down 
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)");
		Thread.sleep(1000);	
		((JavascriptExecutor) driver).executeScript("window.scrollBy(1000,2000)");
		Thread.sleep(1000);	
		((JavascriptExecutor) driver).executeScript("window.scrollBy(2000,3000)");
		Thread.sleep(1000);	
		
		String expected = driver.getTitle();
		Assert.assertEquals(expected, prop.getProperty("Bus_Pool_Assert"));
		log.info("When_User_Clicks_Bus_Pool Test Case passed");
		Thread.sleep(2000);		
		}
	
	@Test(groups = { "valid" }, priority = 1)
	public void validBusPoolApp() throws InterruptedException{
		
		extentTest = extent.startTest(prop.getProperty("Bus_Pool_two"));
		String testcase = "When_User_Clicks_Bus_Pool_Android";
		HomePage h = new HomePage(driver);
		rpoolPage rp = new rpoolPage(driver);

		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();
		CommomUtils.toCheckExecutionRequired(executionRequired);
		
		h.clickNavrPool();
			
		rp.clickPool_google();
	
		ArrayList<String> handle = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(handle.get(1));
		
		String expected = driver.getTitle();
		Assert.assertEquals(expected, prop.getProperty("Bus_Pool_two_Assert"));
		log.info("When_User_Clicks_Bus_Pool_Android Test Case passed");
		Thread.sleep(2000);		
		}

	
}
