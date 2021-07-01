package com.redbus.pages;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HelpPage {
	WebDriver driver;
	
	public HelpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	

	@FindBy(how = How.XPATH, using = "//body/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")
	public static WebElement help_page_cross_btn;
	
	public static void clickCross() {
		help_page_cross_btn.click();
	}

}


