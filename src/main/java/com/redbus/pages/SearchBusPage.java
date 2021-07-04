package com.redbus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchBusPage {
	WebDriver driver;

	public SearchBusPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(how = How.ID, using = "src")
	public WebElement source;

	@FindBy(how = How.ID, using = "dest")
	public WebElement destination;
	
	@FindBy(how = How.ID, using = "onward_cal")
	public WebElement ClickDate;

	@FindBy(how = How.XPATH, using = "//button[@id='search_btn']")
	public WebElement search;

	public void UserSource(String Source) {
		source.click();
		source.sendKeys(Source);
	}

	public void UserDestination(String Destination) {
		destination.click();
		destination.sendKeys(Destination);
	}

	public void SearchButton() {
		search.click();
	}

	public void clickDate(String Date) {
		ClickDate.sendKeys(Date);

	}

}