package com.redbus.tests;

import java.util.ArrayList;
import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.redbus.pages.HomePage;
import com.redbus.utils.CommomUtils;

public class ContactUsTest extends Base{
	
	private String sheetName = "RedBusTest";

	@Test(groups = { "valid" }, priority = 1)
	public void validContactUs() throws InterruptedException{
		extentTest = extent.startTest(prop.getProperty("contact_test_one"));
		String testcase = "When_User_Clicks_Contact_Us";
		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName , testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();
		CommomUtils.toCheckExecutionRequired(executionRequired);

		HomePage h = new HomePage(driver);

		h.clickContactUs();
		ArrayList<String> handle = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(handle.get(1));
		Assert.assertEquals(driver.getTitle(), "Customer Support, 24X7 Customer Service -redBus.in");
		
		log.info("When_User_Clicks_Contact_Us Test Case passed");
		Thread.sleep(2000);
	}
	

}
