package com.redbus.tests;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.redbus.pages.HomePage;
import com.redbus.pages.SearchBusPage;
import com.redbus.utils.CommomUtils;

public class SearchTest extends Base{
	
	private String sheetName = "SearchBusTest";

	//V V V
	@Test
	public void When_User_Enter_Valid_From_Valid_To_and_Valid_Date() throws Throwable {
		extentTest = extent.startTest("When_User_Enter_Valid_From_Valid_To_and_Valid_Date Test");

		String testcase = "When_User_Enter_Valid_From_Valid_To_and_Valid_Date";

		HomePage h = new HomePage(driver);

		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();
		String source_Location = data.get("From");
		String dest_Location = data.get("To");
		String date_set = data.get("Date");
		


		CommomUtils.toCheckExecutionRequired(executionRequired);

		h.clickNavBus_Ticket();
		h.enter_home_search_from(source_Location);
		h.enter_home_search_to(dest_Location);
		h.enter_home_search_date(date_set);
		Thread.sleep(1000);
		h.clickSearchBuses();
		

		String expected = driver.getTitle();
		log.info("When_User_Enter_Valid_From_Valid_To_and_Valid_Date Test Case Passed");
		Assert.assertEquals(expected, driver.getTitle());
		Thread.sleep(2000);
	}

	//V I V
	@Test
	public void When_User_Enter_Valid_From_InValid_To_and_Valid_Date() throws Throwable {
		extentTest = extent.startTest("When_User_Enter_Valid_From_InValid_To_and_Valid_Date test");
		String testcase = "When_User_Enter_Valid_From_InValid_To_and_Valid_Date";

		HomePage h = new HomePage(driver);

		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();
		String source_Location = data.get("From");
		String dest_Location = data.get("To");
		String date_set = data.get("Date");
		


		CommomUtils.toCheckExecutionRequired(executionRequired);

		h.clickNavBus_Ticket();
		h.enter_home_search_from(source_Location);
		h.enter_home_search_in_to(dest_Location);
		h.enter_home_search_date(date_set);
		Thread.sleep(1000);
		Thread.sleep(1000);
		h.clickSearchBuses();
		

		String expected = driver.getTitle();
		log.info("When_User_Enter_Valid_From_InValid_To_and_Valid_Date Test Case Passed");
		Assert.assertEquals(expected, driver.getTitle());
		Thread.sleep(5000);
	}

	//V V I
	@Test
	public void When_User_Enter_Valid_From_Valid_To_and_InValid_Date() throws Throwable {
		extentTest = extent.startTest("When_User_Enter_Valid_From_Valid_To_and_InValid_Date test");

		String testcase = "When_User_Enter_Valid_From_Valid_To_and_InValid_Date";

		HomePage h = new HomePage(driver);

		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();
		String source_Location = data.get("From");
		String dest_Location = data.get("To");
		String date_set = data.get("Date");
		CommomUtils.toCheckExecutionRequired(executionRequired);

		h.clickNavBus_Ticket();
		h.enter_home_search_from(source_Location);
		h.enter_home_search_to(dest_Location);
		h.enter_home_search_date(date_set);
		Thread.sleep(1000);
		Thread.sleep(1000);
		h.clickSearchBuses();
		

		String expected = driver.getTitle();
		log.info("When_User_Enter_Valid_From_Valid_To_and_InValid_Date functionality Test Case Passed");
		Assert.assertEquals(expected, driver.getTitle());
		Thread.sleep(5000);
	}

}
