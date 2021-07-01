package com.redbus.tests;

import java.util.ArrayList;
import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.redbus.pages.HelpPage;
import com.redbus.pages.HomePage;
import com.redbus.utils.CommomUtils;

public class HelpSectionTest extends Base {

	private String sheetName = "RedBusTest";

	//click and cross
	@Test(groups = { "valid" }, priority = 1)
	public void validHelpSection() throws InterruptedException{
		
		extentTest = extent.startTest(prop.getProperty("help_test_one"));
		String testcase = "When_User_Clicks_Help";
		HomePage h = new HomePage(driver);

		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName , testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();
		CommomUtils.toCheckExecutionRequired(executionRequired);

		h.clickHelpBtn();
		ArrayList<String> handle = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(handle.get(1));
		
		HelpPage.clickCross();
		Thread.sleep(2000);
		
		String expected = driver.getTitle();
		Assert.assertEquals(expected, prop.getProperty("help_test_Assert"));
		log.info("When_User_Clicks_Help Test Case passed");
		Thread.sleep(2000);

	}

}
