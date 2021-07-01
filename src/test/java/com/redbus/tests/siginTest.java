package com.redbus.tests;

import org.testng.annotations.Test;

import com.redbus.pages.HomePage;

public class siginTest extends Base{

	@Test(groups = { "valid" }, priority = 1)
	public void validSignIn() throws InterruptedException{
		extentTest = extent.startTest(prop.getProperty("cart_test_one"));
		HomePage h = new HomePage(driver);

		h.clickSigninlogo();
		
		Thread.sleep(2000);
		
	}
}
