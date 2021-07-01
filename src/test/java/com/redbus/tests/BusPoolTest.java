package com.redbus.tests;

import java.util.HashMap;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.redbus.pages.HomePage;
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
		Thread.sleep(2000);
			
		//Slowly scroll down 
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);	
		((JavascriptExecutor) driver).executeScript("window.scrollBy(1000,2000)");
		Thread.sleep(2000);	
		((JavascriptExecutor) driver).executeScript("window.scrollBy(2000,3000)");
		Thread.sleep(2000);	
		
		String expected = driver.getTitle();
		Assert.assertEquals(expected, prop.getProperty("Bus_Pool_Assert"));
		log.info("When_User_Clicks_Bus_Pool Test Case passed");
		Thread.sleep(2000);		
		}

	
}
