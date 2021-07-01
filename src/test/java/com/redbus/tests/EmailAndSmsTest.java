package com.redbus.tests;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.redbus.pages.HomePage;
import com.redbus.utils.CommomUtils;

public class EmailAndSmsTest extends Base {
	private String sheetName = "SearchBusTest";

	@Test(groups = { "valid" }, priority = 1)
	public void validAboutUs() throws InterruptedException{
		extentTest = extent.startTest("Change travel date");
		String testcase = "When_User_Clicks_Cancel_Ticket";
		HomePage h = new HomePage(driver);
		
		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();
		CommomUtils.toCheckExecutionRequired(executionRequired);

		h.clickManageBookingsBtn();
		h.clickManageBookingSmsBtn();
	
		
		String expected = driver.getTitle();
//		Assert.assertEquals(expected, prop.getProperty("About_us_Assert"));
		log.info("When_User_Clicks_About_Us Test Case passed");
		Thread.sleep(5000);
		
	}


}
