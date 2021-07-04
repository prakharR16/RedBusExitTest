package com.redbus.tests;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.redbus.pages.BookingPage;
import com.redbus.utils.CommomUtils;

public class ModifySearch extends Base {

	private String sheetName = "ModifyBusTest";

	@Test
	public void careers() throws Throwable {
		extentTest = extent.startTest(prop.getProperty("modify_one"));

		String testcase = "When_user_clicks_Modify_bus";

		BookingPage bp = new BookingPage(driver);

		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();
		CommomUtils.toCheckExecutionRequired(executionRequired);
		String src = data.get("From");
		String dest = data.get("To");
		
		

		bp.selectsrc(src);
		bp.selectdest(dest);
		bp.dateSelectButton();
		bp.clicksearch();
		bp.modifylocation(dest, src);
		bp.modifySearch();

		String expected = driver.getTitle();
		log.info("When_user_clicks_Modify_bus Test Case Passed");
		Assert.assertEquals(expected, "");
		Thread.sleep(5000);
	}

}
