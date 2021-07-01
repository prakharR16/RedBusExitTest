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
	@Test(enabled=false)
	public void whenUserEntersValidFromAndValidToAndValidDate() throws Throwable {
		extentTest = extent.startTest("Valid ModifySearchBusLocation functionality scenario test");

		String testcase = "whenUserEntersValidFromAndValidToAndValidDate";

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
		log.info("whenUserEntersValidFromAndValidToAndValidDate functionality Test Case Passed");
		Assert.assertEquals(expected, driver.getTitle());
		Thread.sleep(5000);
	}

	//V I V
	@Test(enabled=false)
	public void whenUserEntersValidFromAndInValidToAndValidDate() throws Throwable {
		extentTest = extent.startTest("Valid ModifySearchBusLocation functionality scenario test");

		String testcase = "whenUserEntersValidFromAndInValidToAndValidDate";

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
		log.info("whenUserEntersValidFromAndInValidToAndValidDate functionality Test Case Passed");
		Assert.assertEquals(expected, driver.getTitle());
		Thread.sleep(5000);
	}

	//V V I
	@Test
	public void whenUserEntersValidFromAndValidToAndInValidDate() throws Throwable {
		extentTest = extent.startTest("Valid ModifySearchBusLocation functionality scenario test");

		String testcase = "whenUserEntersValidFromAndValidToAndInValidDate";

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
		log.info("whenUserEntersValidFromAndValidToAndInValidDate functionality Test Case Passed");
		Assert.assertEquals(expected, driver.getTitle());
		Thread.sleep(5000);
	}

}
