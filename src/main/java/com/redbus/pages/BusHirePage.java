package com.redbus.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.redbus.pages.utils.DateAndTime;

public class BusHirePage {

	WebDriver driver;

	public BusHirePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	//---------------------OutStation--------------------//
	
	@FindBy(how = How.XPATH, using = "//body/div[@id='reactContentMount']/div[1]/div[5]/div[2]/object[1]")
	private WebElement frameWindow;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Outstation')]")
	private WebElement outStationMenu;

	public void clickOnOutstationMenu() {
		driver.switchTo().frame(frameWindow);
		outStationMenu.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@FindBy(how = How.XPATH, using = "//*[@id='to_datepicker']/div/div/input")
	public WebElement timedateto;

	@FindBy(how = How.XPATH, using = "//*[@id='from_datepicker']/div/div/input")
	public WebElement timedatefrom;

	public void ForOutstation(String fromDateAndTimeVal, String tillDateAndTimeVal) throws InterruptedException {

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", timedatefrom);

		// selecting date and time
		Thread.sleep(500);
		try {
			DateAndTime.selectDateAndTimeAtBusHirePage(driver, fromDateAndTimeVal);
		} catch (Exception e) {

			e.printStackTrace();
		}
		timedateto.click();
		// selecting date and time
		try {
			DateAndTime.selectDateAndTimeAtBusHirePage(driver, tillDateAndTimeVal);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@FindBy(how = How.XPATH, using = "//input[@id='locationTextFieldLocal']")
	public WebElement hire_pickup;

	public void enterPickup(String s) {
		hire_pickup.sendKeys(s);
		driver.findElement(By.xpath("//span[contains(text(),'Delhi railway station, Mori Gate, Delhi, India')]"))
				.click();
	}

	@FindBy(how = How.XPATH, using = "//input[@id='local_dest_name']")
	public WebElement hire_destination;

	public void enterdestination(String s) {
		hire_destination.sendKeys(s);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='numberOfPax']")
	public WebElement hire_nop;

	public void enternop(String s) {
		hire_nop.sendKeys(s);
	}

	@FindBy(how = How.XPATH, using = "//button[@id='proceedButtonOutstation']")
	public WebElement hire_proceed;

	public void clickProceed() {
		hire_proceed.click();
	}

	// --------------------local--------------------//

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Anywhere within your city')]")
	private WebElement localMenu;

	public void clickOnLocalMenu() {
		driver.switchTo().frame(frameWindow);
		localMenu.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@FindBy(how = How.XPATH, using = "//button[@id='proceedButtonLocal']")
	public WebElement hire_local_proceed;

	public void clickLocalProceed() {
		hire_local_proceed.click();
	}

	@FindBy(how = How.XPATH, using = "//input[@class=\"MuiInputBase-input MuiInput-input\"]")
	public WebElement todate;

	public void ForLocal() throws InterruptedException {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", todate);

		Thread.sleep(500);

		// selecting date and time
		try {
			DateAndTime.selectDateAndTimeAtBusHirePage(driver, "23-07-2021-10:30 PM");
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
