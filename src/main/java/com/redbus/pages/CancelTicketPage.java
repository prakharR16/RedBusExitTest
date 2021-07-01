package com.redbus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CancelTicketPage {

	WebDriver driver;
	
	//constructor for driver
	public CancelTicketPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	//CancelTicketPage
	@FindBy(how = How.NAME, using = "email")
	public static WebElement enter_email;
	
	public static void enter_Email() {
		enter_email.sendKeys("abc@gmail.com");
	}
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Select Passengers')]")
	public static WebElement cancel_page_submit_btn;
	
	public static void clickSubmit() {
		cancel_page_submit_btn.click();
	}
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Please enter ticket number (TIN from your ticket)')]")
	public static WebElement error_message;
	
	public static String getErrorMessage() {
		return error_message.getText();
	}
	
}
