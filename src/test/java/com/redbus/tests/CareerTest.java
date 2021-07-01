package com.redbus.tests;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.redbus.pages.HomePage;

public class CareerTest extends Base{
	
	@Test(groups = { "valid" }, priority = 1)
	public void validCareerPageTest() throws InterruptedException{
		extentTest = extent.startTest(prop.getProperty("cart_test_one"));
		HomePage h = new HomePage(driver);

		h.clickCareerBtn();
		ArrayList<String> handle = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(handle.get(1));
		Assert.assertEquals(driver.getTitle(), "");

		Thread.sleep(2000);
		
	}

}
