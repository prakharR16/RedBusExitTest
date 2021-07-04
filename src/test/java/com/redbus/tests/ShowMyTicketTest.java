package com.redbus.tests;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.redbus.pages.HomePage;
import com.redbus.utils.CommomUtils;

public class ShowMyTicketTest extends Base{

	private String sheetName = "RedBusTest";

	@Test(groups = { "valid" }, priority = 1)
	public void validShowTicket() throws InterruptedException{
		extentTest = extent.startTest(prop.getProperty("show_ticket_one"));
		String testcase = "When_User_Clicks_Show_Ticket";
		HomePage h = new HomePage(driver);
		
		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();
		CommomUtils.toCheckExecutionRequired(executionRequired);

		h.clickManageBookingsBtn();
		h.clickManageBookingSowTicketBtn();
	
		
		String expected = driver.getTitle();
		Assert.assertEquals(expected, "");
		log.info("When_User_Clicks_Show_Ticket Test Case passed");
		Thread.sleep(2000);
		
	}

}
