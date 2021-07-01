package com.redbus.tests;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.redbus.pages.HomePage;

public class ContactUsTest extends Base{
	
	@Test(groups = { "valid" }, priority = 1)
	public void validContactUs() throws InterruptedException{
		extentTest = extent.startTest(prop.getProperty("cart_test_one"));
		HomePage h = new HomePage(driver);

		h.clickContactUs();
		ArrayList<String> handle = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(handle.get(1));
		Assert.assertEquals(driver.getTitle(), "Customer Support, 24X7 Customer Service -redBus.in");

		Thread.sleep(2000);
		
	}
	

}
