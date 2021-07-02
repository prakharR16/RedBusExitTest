package com.redbus.tests;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.redbus.pages.HomePage;
import com.redbus.utils.CommomUtils;

public class SignInTest extends Base{
	private String sheetName = "RedBusTest";

	@Test(groups = { "valid" }, priority = 1)
	public void validSignIn() throws InterruptedException{		
		
		extentTest = extent.startTest(prop.getProperty("signin_one"));
		String testcase = "When_User_Clicks_SignIn";
		HomePage h = new HomePage(driver);
		
		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName , testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();
		CommomUtils.toCheckExecutionRequired(executionRequired);
		
		h.clickSigninlogo();
		Thread.sleep(2000);

		String expected = driver.getTitle();
		Assert.assertEquals(expected, prop.getProperty("signin_Assert"));
		log.info("When_User_Clicks_SignIn Test Case passed");
		Thread.sleep(5000);		
		
	}
}
