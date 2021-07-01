package com.redbus.tests;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.redbus.pages.HomePage;

public class MobileVersionTest extends Base {
	
	@Test(groups = { "valid" }, priority = 1)
	public void validMobileVersionTest() throws InterruptedException{
		extentTest = extent.startTest(prop.getProperty("Mobile_Version_one"));
		HomePage h = new HomePage(driver);

		h.clickMobileVersion();
		
		ArrayList<String> handle = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(handle.get(1));
		Thread.sleep(2000);
		
		Assert.assertEquals(driver.getTitle(), prop.getProperty("Mobile_Version_Assert"));

		Thread.sleep(2000);
		
	}

}
