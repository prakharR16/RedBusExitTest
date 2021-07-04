package com.redbus.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.redbus.pages.utils.Calender;

public class BookingPage {

	WebDriver driver;
	public BookingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")
	public WebElement selectdate;

	@FindBy(how = How.ID, using = "src")
	public WebElement src;

	@FindBy(how = How.ID, using = "dest")
	public WebElement dest;

	@FindBy(how = How.XPATH, using = "//button[@id='search_btn']")
	public WebElement searchbus;

	@FindBy(how = How.XPATH, using = "//div[@class='onward-modify-btn g-button clearfix fl']")
	public WebElement modifysearch;

	@FindBy(how = How.XPATH, using = "//button[@class=' button ms-btn']")
	public WebElement modifysearchbtn;

	public void selectsrc(String s) {
		src.clear();
		src.sendKeys(s);
	}

	public void selectdest(String s)   {
		dest.clear();
		dest.sendKeys(s);
	}

	public void dateSelectButton() throws Throwable   {

		Calender.selectDate(selectdate, "2021", "July", "8", driver);
	
	}

	public void clicksearch()   {
		searchbus.click();
	}

	public void modifylocation(String sourcellocation, String destloaction)  {
		modifysearch.click();
		src.clear();
		src.sendKeys(sourcellocation);
		src.sendKeys(Keys.ENTER);
		dest.clear();
		dest.sendKeys(destloaction);
		dest.sendKeys(Keys.ENTER);
		
	}

	public void modifySearch() {
		modifysearchbtn.click();
	}
}
