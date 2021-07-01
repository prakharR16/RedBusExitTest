package com.redbus.tests;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.redbus.pages.HomePage;

public class OtherSitesTest extends Base {

	@Test(groups = { "valid" }, priority = 1)
	public void validGotoGoibibo() throws InterruptedException{
		extentTest = extent.startTest(prop.getProperty("Other_one"));
		HomePage h = new HomePage(driver);

		h.clickGoibibo();
		ArrayList<String> handle = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(handle.get(1));
		
		Assert.assertEquals(driver.getTitle(), prop.getProperty("Other_one_Assert"));
		Thread.sleep(6000);
		
	}
	
	
	@Test(groups = { "valid" }, priority = 1)
	public void validGotoMakeMyTrip() throws InterruptedException{
		extentTest = extent.startTest(prop.getProperty("Other_two"));
		HomePage h = new HomePage(driver);

		h.clickMakeMyTrip();
		ArrayList<String> handle = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(handle.get(1));
		Assert.assertEquals(driver.getTitle(), prop.getProperty("Other_two_Assert"));

		Thread.sleep(6000);
		
	}


}
