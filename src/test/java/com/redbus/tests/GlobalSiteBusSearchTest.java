package com.redbus.tests;

import java.util.ArrayList;
import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.redbus.pages.HomePage;
import com.redbus.utils.CommomUtils;

public class GlobalSiteBusSearchTest extends Base {

	private String sheetName="";
 
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

}
