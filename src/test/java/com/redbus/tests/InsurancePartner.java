package com.redbus.tests;

import java.util.ArrayList;
import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.redbus.pages.HomePage;
import com.redbus.utils.CommomUtils;

public class InsurancePartner extends Base{

	private String sheetName = "RedBusTest";

	@Test(groups = { "valid" }, priority = 1)
	public void validInsurancePartnerTest() throws InterruptedException{
		extentTest = extent.startTest(prop.getProperty("Insurance_one"));
		String testcase = "When_User_Clicks_Insurance_Partner";
		HomePage h = new HomePage(driver);
		
		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();
		CommomUtils.toCheckExecutionRequired(executionRequired);

		h.clickInsurance();
		
		
		ArrayList<String> handle = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(handle.get(1));
		Thread.sleep(2000);
		
		String expected = driver.getTitle();
		Assert.assertEquals(expected, prop.getProperty("Insurance_Assert"));
		log.info("When_User_Clicks_Insurance_Partner Test Case passed");
		Thread.sleep(2000);
		
	}

}
