package com.redbus.tests;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.redbus.pages.HomePage;

public class OffersPageTest extends Base {

	@Test(groups = { "valid" }, priority = 1)
	public void validOffersPage() throws InterruptedException{
		
		extentTest = extent.startTest(prop.getProperty("cart_test_one"));
		HomePage h = new HomePage(driver);


		h.clickOffers();
		ArrayList<String> handle = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(handle.get(1));
		
		Thread.sleep(6000);
		Assert.assertEquals(driver.getTitle(), "Offers: Bus Offers, Hotel Discounts & Coupon Codes - redBus");
		
		
	}
}
