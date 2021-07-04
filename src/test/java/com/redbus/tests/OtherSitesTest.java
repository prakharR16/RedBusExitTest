package com.redbus.tests;

import java.util.ArrayList;
import java.util.HashMap;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.redbus.pages.HomePage;
import com.redbus.utils.CommomUtils;

public class OtherSitesTest extends Base {

	private String sheetName="RedBusTest";


	@Test(groups = { "valid" }, priority = 1)
	public void validGotoGoibibo() throws InterruptedException{
		extentTest = extent.startTest(prop.getProperty("Other_one"));
		String testcase = "When_User_Clicks_Goibibo_btn";
		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName , testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();
		CommomUtils.toCheckExecutionRequired(executionRequired);
		
		HomePage h = new HomePage(driver);
		
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,4000)");
		Thread.sleep(2000);	

		h.clickGoibibo();
		ArrayList<String> handle = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(handle.get(1));
		
		Assert.assertEquals(driver.getTitle(), prop.getProperty("Other_one_Assert"));
		Thread.sleep(3000);
		
		log.info("When_User_Clicks_Goibibo_btn test Case passed");
		Thread.sleep(2000);
		
	}
	
	
	@Test(groups = { "valid" }, priority = 1)
	public void validGotoMakeMyTrip() throws InterruptedException{
		extentTest = extent.startTest(prop.getProperty("Other_two"));
		String testcase = "When_User_Clicks_MakeMyTrip_btn";
		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName , testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();
		CommomUtils.toCheckExecutionRequired(executionRequired);

		HomePage h = new HomePage(driver);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,4000)");
		Thread.sleep(2000);	

		h.clickMakeMyTrip();
		ArrayList<String> handle = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(handle.get(1));
		Assert.assertEquals(driver.getTitle(), prop.getProperty("Other_two_Assert"));

		Thread.sleep(2000);
		
		log.info("When_User_Clicks_MakeMyTrip_btn test Case passed");
		Thread.sleep(2000);
	}


}
