package com.redbus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BusOperatorRegPage {

	WebDriver driver;
	public BusOperatorRegPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
	public static WebElement mobileNumInput;
	
	public void enterOperatorMobile(String s) {
		mobileNumInput.sendKeys(s);
	}
	
	@FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]")
	public static WebElement cc_box;
	
	public void clickCapcta() {
		cc_box.click();
	}
		
	@FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/form[1]/button[1]")
	public static WebElement otp_btn;
	
	public static void clickGenerateOTP() {
		otp_btn.click();
	}
}
