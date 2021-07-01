package com.redbus.tests;

import java.util.ArrayList;

import org.testng.annotations.Test;

import com.redbus.pages.HelpPage;
import com.redbus.pages.HomePage;

public class HelpSectionTest extends Base {

	//click and cross
	@Test(groups = { "valid" }, priority = 1)
	public void validHelpSection() throws InterruptedException{
		
		extentTest = extent.startTest(prop.getProperty("cart_test_one"));
		HomePage h = new HomePage(driver);
		HelpPage he = new HelpPage(driver);


		h.clickHelpBtn();
		ArrayList<String> handle = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(handle.get(1));
		
		he.clickCross();
		Thread.sleep(7000);
		
	}

}
