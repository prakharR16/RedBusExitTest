package com.redbus.tests;

import java.util.ArrayList;
import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.redbus.pages.BusOperatorRegPage;
import com.redbus.pages.HomePage;
import com.redbus.utils.CommomUtils;

public class BusOperatorRegTest extends Base {

	private String sheetName = "BusOpTest";

	@Test(groups = { "valid" }, priority = 1)
	public void validOperatorReg() throws InterruptedException{
		extentTest = extent.startTest(prop.getProperty("Operator_Reg_one"));
		String testcase = "When_User_Clicks_Operator_Reg";
		HomePage h = new HomePage(driver);
		BusOperatorRegPage bo = new BusOperatorRegPage(driver);
		
		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();
		CommomUtils.toCheckExecutionRequired(executionRequired);

		h.clickBusOpReg();
		ArrayList<String> handle = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(handle.get(1));
		Thread.sleep(2000);
		
		String mobile_num = data.get("Mobile No");
		bo.enterOperatorMobile(mobile_num);
		bo.clickCapcta();
		String expected = driver.getTitle();
		Assert.assertEquals(expected, prop.getProperty("Operator_Reg_Assert"));
		log.info("When_User_Clicks_Operator_Reg Test Case passed");
		Thread.sleep(5000);
		
	}

}
