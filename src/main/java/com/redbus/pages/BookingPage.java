package com.redbus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BookingPage {

	WebDriver driver;
	public BookingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(how = How.ID, using = "redBus")
	public static WebElement home_page_bus_ticket_btn;
	
	public static void clickNavBus_Ticket() {
		home_page_bus_ticket_btn.click();
	}
	
	

}

//custom-checkbox classname sleeper bus type
// //div[contains(text(),'View Seats')]  (view seat) xpath
// //div[contains(text(),'Modify')]  modify button xpath

//src,dest,date,search from home_Page
// btn  button ms-btn