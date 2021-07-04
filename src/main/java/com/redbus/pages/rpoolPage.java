package com.redbus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class rpoolPage {

	WebDriver driver;
	public rpoolPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(how = How.CLASS_NAME, using = "banner-download-button")
	public static WebElement pool_page_google;
	
	public void clickPool_google() {
		pool_page_google.click();
	}
	@FindBy(how = How.ID, using = "//body/div[@id='reactContentMount']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/a[1]/img[1]")
	public static WebElement pool_page_apple;
	
	public static void clickPool_apple() {
		pool_page_apple.click();
	}
}
