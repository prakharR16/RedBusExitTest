package com.redbus.tests;

import java.util.ArrayList;
import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.redbus.pages.HomePage;
import com.redbus.utils.CommomUtils;

public class OffersPageTest extends Base {

	private String sheetName="RedBusTest";

	@Test(groups = { "valid" }, priority = 1)
	public void validOffersPage() throws InterruptedException{
		
		extentTest = extent.startTest(prop.getProperty("offer_test_one"));
		String testcase = "When_User_Clicks_Offer_btn";
		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName , testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();
		CommomUtils.toCheckExecutionRequired(executionRequired);

		HomePage h = new HomePage(driver);


		h.clickOffers();
		ArrayList<String> handle = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(handle.get(1));
					
		
		Assert.assertEquals(driver.getTitle(), prop.getProperty("offer_test_Assert"));

		log.info("When_User_Clicks_Offer_btn Case passed");
		Thread.sleep(2000);

		
	}
}
