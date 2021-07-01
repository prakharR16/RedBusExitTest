package com.redbus.tests;

import java.util.ArrayList;
import java.util.HashMap;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.redbus.pages.CancelTicketPage;
import com.redbus.pages.HomePage;
import com.redbus.utils.CommomUtils;

public class CancelTicketTest extends Base {
	private String sheetName = "RedBusTest";

	@Test(groups = { "valid" }, priority = 1)
	public void validCancelTicket() throws InterruptedException{
		extentTest = extent.startTest(prop.getProperty("Cancel_Ticket_one"));
		String testcase = "When_User_Clicks_Cancel_Ticket";
		HomePage h = new HomePage(driver);
		
		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();
		CommomUtils.toCheckExecutionRequired(executionRequired);

		h.clickManageBookingsBtn();
		h.clickManageBookingCancelBtn();
	
		
		String expected = driver.getTitle();
		Assert.assertEquals(expected, prop.getProperty("Cancel_Ticket_Assert"));
		log.info("When_User_Clicks_About_Us Test Case passed");
		Thread.sleep(5000);
		
	}
	
	@Test(groups = { "Invalid" }, priority = 2)
	public void InvalidCancelTicket() throws InterruptedException{
		extentTest = extent.startTest(prop.getProperty("Cancel_Ticket_two"));
		String testcase = "When_User_Clicks_Cancel_Ticket_And_Data";
		HomePage h = new HomePage(driver);
		CancelTicketPage c = new CancelTicketPage(driver);
		
		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();
		CommomUtils.toCheckExecutionRequired(executionRequired);

		h.clickManageBookingsBtn();
		h.clickManageBookingCancelBtn();
		
		c.enter_Email();
		c.clickSubmit();
	
		
		String expected = c.getErrorMessage();
	
		Assert.assertEquals(expected, prop.getProperty("Cancel_Ticket_two_Assert"));
		log.info("When_User_Clicks_Cancel_Ticket_And_Data Test Case failed");
		Thread.sleep(5000);
		
	}


}
