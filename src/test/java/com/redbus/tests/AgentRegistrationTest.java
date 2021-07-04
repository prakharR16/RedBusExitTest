package com.redbus.tests;

import java.util.ArrayList;
import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.redbus.pages.HomePage;
import com.redbus.pages.LoginAgentPage;
import com.redbus.utils.CommomUtils;

public class AgentRegistrationTest extends Base {

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
		Thread.sleep(2000);
		
	}
	
	@Test(groups = { "Invalid" }, priority = 1)
	public void InvalidAgentReg() throws InterruptedException{
		extentTest = extent.startTest(prop.getProperty("Agent_Reg_two"));
		String testcase = "When_User_Clicks_Agent_Reg_And_Data";
		HomePage h = new HomePage(driver);
		LoginAgentPage lp = new LoginAgentPage(driver);
		
		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();
		CommomUtils.toCheckExecutionRequired(executionRequired);

		h.clickAgentReg();
		ArrayList<String> handle = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(handle.get(1));
		Thread.sleep(2000);
		
		lp.clickLogin();
		lp.enter_Email(prop.getProperty("Agent_Reg_Email"));
		lp.enter_Password(prop.getProperty("Agent_Reg_Password"));
		lp.clickSignin();
		
		
		String expected = driver.getTitle();
		Assert.assertEquals(expected, prop.getProperty("Agent_Reg_Assert"));
		log.info("When_User_Clicks_Agent_Reg_And_Data Test Case passed");
		Thread.sleep(2000);
		
	}

}
