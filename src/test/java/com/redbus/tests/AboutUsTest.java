package com.redbus.tests;

import java.util.ArrayList;
import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.redbus.pages.HomePage;
import com.redbus.utils.CommomUtils;

public class AboutUsTest extends Base{
	private String sheetName = "RedBusTest";

	@Test(groups = { "valid" }, priority = 1)
	public void validAboutUs() throws InterruptedException{
		extentTest = extent.startTest(prop.getProperty("About_us_one"));
		String testcase = "When_User_Clicks_About_Us";
		HomePage h = new HomePage(driver);
		
		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();
		CommomUtils.toCheckExecutionRequired(executionRequired);

		h.clickAboutUs();
		ArrayList<String> handle = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(handle.get(1));
		Thread.sleep(2000);
		
		String expected = driver.getTitle();
		Assert.assertEquals(expected, prop.getProperty("About_us_Assert"));
		log.info("When_User_Clicks_About_Us Test Case passed");
		Thread.sleep(5000);
		
	}

}
