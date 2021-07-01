package com.redbus.tests;

import java.util.ArrayList;
import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.redbus.pages.HomePage;
import com.redbus.utils.CommomUtils;

public class AgentRegistrationTest extends Base {


	//click on login
	private String sheetName = "RedBusTest";

	@Test(groups = { "valid" }, priority = 1)
	public void validAgentReg() throws InterruptedException{
		extentTest = extent.startTest(prop.getProperty("Agent_Reg_one"));
		String testcase = "When_User_Clicks_Agent_Reg";
		HomePage h = new HomePage(driver);
		
		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();
		CommomUtils.toCheckExecutionRequired(executionRequired);

		h.clickAgentReg();
		ArrayList<String> handle = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(handle.get(1));
		Thread.sleep(2000);
		
		String expected = driver.getTitle();
		Assert.assertEquals(expected, prop.getProperty("Agent_Reg_Assert"));
		log.info("When_User_Clicks_Agent_Reg Test Case passed");
		Thread.sleep(5000);
		
	}

}
