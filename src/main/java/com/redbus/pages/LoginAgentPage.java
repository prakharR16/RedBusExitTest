package com.redbus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginAgentPage {

	WebDriver driver;

	public LoginAgentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]")
	public WebElement login_btn;

	public void clickLogin() {
		login_btn.click();
	}

	@FindBy(how = How.XPATH, using = "//input[@id='emailbox']")
	public WebElement enter_email;

	public void enter_Email(String s) {
		enter_email.sendKeys(s);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	public WebElement enter_pass;

	public void enter_Password(String s) {
		enter_pass.sendKeys(s);
	}

	@FindBy(how = How.XPATH, using = "//button[@id='signin_button']")
	public WebElement signin_btn;

	public void clickSignin() {
		signin_btn.click();
	}

}
