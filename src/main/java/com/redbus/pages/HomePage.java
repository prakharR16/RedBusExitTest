package com.redbus.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	//Default constructor
	public HomePage() {
		
	}
	//constructor for driver
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	//Home-Page Navigation-Bar Left
	@FindBy(how = How.ID, using = "redBus")
	public static WebElement home_page_bus_ticket_btn;
	
	public static void clickNavBus_Ticket() {
		home_page_bus_ticket_btn.click();
	}
	
	@FindBy(how = How.ID, using = "cars")
	public static WebElement home_page_rPool_btn;
	
	public static void clickNavrPool() {
		home_page_rPool_btn.click();
	}
	
	@FindBy(how = How.ID, using = "redBus Bus Hire")
	public static WebElement home_page_bus_hire_btn;
	
	public static void clickNav_bus_hire() {
		home_page_bus_hire_btn.click();
	}

//	// hover over women tab
//	public void hoverWomenTab() {
//		Actions ac = new Actions(driver);
//		ac.moveToElement(womenTab).perform();
//
//	}
	
	//Home-Page Search Bar

	@FindBy(how = How.XPATH, using = "//input[@id='txtSource']")
	public  WebElement home_page_enter_from;
	
	@FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[5]")
	public  WebElement home_page_enter_from_list;
		
	public  void enter_home_search_from(String s) {
		home_page_enter_from.sendKeys(s);
		home_page_enter_from.sendKeys(Keys.DOWN);
		home_page_enter_from_list.click();

	}
	
	@FindBy(how = How.XPATH, using = "//input[@id='txtDestination']")
	public  WebElement home_page_enter_to;
	
	@FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[3]/div[2]/ul[1]/li[3]")
	public  WebElement home_page_enter_to_list;
		
	public  void enter_home_search_to(String s) {
		home_page_enter_to.sendKeys(s);
		home_page_enter_to.sendKeys(Keys.DOWN);
		home_page_enter_to_list.click();

	}
	public  void enter_home_search_in_to(String s) {
		home_page_enter_to.sendKeys(s);
		home_page_enter_to_list.click();

	}
	
	@FindBy(how = How.XPATH, using = "//input[@id='txtOnwardCalendar']")
	public  WebElement home_page_enter_date;

	public  void enter_home_search_date(String s) {
		home_page_enter_date.sendKeys(s);		
	}
	
	@FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[3]/button[1]")
	public  WebElement home_page_search_buses_btn;
	
	public  void clickSearchBuses() {
		home_page_search_buses_btn.click();
	}

	
	//Home-Page Footer

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'About Us')]")
	public  WebElement home_page_about_us_btn;
	
	public  void clickAboutUs() {
		home_page_about_us_btn.sendKeys(Keys.ENTER);
	}
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Contact Us')]")
	public  WebElement home_page_contact_us_btn;
	
	public  void clickContactUs() {
		home_page_contact_us_btn.sendKeys(Keys.ENTER);
	}
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Careers')]")
	public  WebElement home_page_career_btn;
	
	public  void clickCareerBtn() {
		home_page_career_btn.sendKeys(Keys.ENTER);
	}
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Mobile Version')]")
	public  WebElement home_page_mobile_version_btn;
	
	public  void clickMobileVersion() {
		home_page_mobile_version_btn.sendKeys(Keys.ENTER);
	}
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Offers')]")
	public  WebElement home_page_offers_btn;
	
	public  void clickOffers() {
		home_page_offers_btn.sendKeys(Keys.ENTER);
	}
	
	//------------------------------Partners--------------------------------------//
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Goibibo')]")
	public  WebElement home_page_goibibo_btn;
	
	public  void clickGoibibo() {
		home_page_goibibo_btn.sendKeys(Keys.ENTER);
	}
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Makemytrip')]")
	public  WebElement home_page_makemytrip_btn;
	
	public  void clickMakeMyTrip() {
		home_page_makemytrip_btn.sendKeys(Keys.ENTER);;
	}
		
	//--------------------------------Info----------------------------------//
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Bus Operator Registration')]")
	public  WebElement home_page_busop_reg_btn;
	
	public  void clickBusOpReg() {
		home_page_busop_reg_btn.sendKeys(Keys.ENTER);
	}
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Agent Registration')]")
	public  WebElement home_page_agent_reg_btn;
	
	public  void clickAgentReg() {
		home_page_agent_reg_btn.sendKeys(Keys.ENTER);
	}
	
	//-------------Global Sites------------//
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Singapore')]")
	public  WebElement home_page_global_singapore_btn;
	
	public  void clickGlobalSingaporeBtn() {
		home_page_global_singapore_btn.sendKeys(Keys.ENTER);
	}
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Malaysia')]")
	public  WebElement home_page_global_malaysia_btn;
	
	public  void clickGlobalMalaysiaBtn() {
		home_page_global_malaysia_btn.sendKeys(Keys.ENTER);
	}
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Indonesia')]")
	public  WebElement home_page_global_Indonesia_btn;
	
	public  void clickGlobalIndonesiaBtn() {
		home_page_global_Indonesia_btn.sendKeys(Keys.ENTER);
	}
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Peru')]")
	public  WebElement home_page_global_Peru_btn;
	
	public  void clickGlobalPeruBtn() {
		home_page_global_Peru_btn.sendKeys(Keys.ENTER);
	}
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Colombia')]")
	public  WebElement home_page_global_Colombia_btn;
	
	public  void clickGlobalColombiaBtn() {
		home_page_global_Colombia_btn.sendKeys(Keys.ENTER);
	}
	
	
	
	
	//Home-Page Navigation Bar Right
	@FindBy(how = How.XPATH, using = "//i[@id='i-icon-profile']")
	public  WebElement home_signin_btn;
	
	public  void clickSigninlogo() {
		home_signin_btn.click();
	}
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Help')]")
	public  WebElement home_help_btn;
	
	public  void clickHelpBtn() {
		home_help_btn.click();
	}
	
	//Home-Page Navigation Bar Right - Manage
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Manage Booking')]")
	public  WebElement home_manage_bookings_btn;
	
	public  void clickManageBookingsBtn() {
		home_manage_bookings_btn.click();
	}
	
	// Manage - Cancel
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Cancel')]")
	public  WebElement home_manage_booking_cancel_btn;
	
	public  void clickManageBookingCancelBtn() {
		home_manage_booking_cancel_btn.click();
	}
	// Manage - Change date
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Change Travel Date')]")
	public  WebElement home_manage_booking_change_date_btn;
	
	public  void clickManageBookingChangeTravelDateBtn() {
		home_manage_booking_change_date_btn.click();
	}
	//Manage - Show ticket 
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Show My Ticket')]")
	public  WebElement home_manage_booking_show_ticket_btn;
	
	public  void clickManageBookingSowTicketBtn() {
		home_manage_booking_show_ticket_btn.click();
	}
	
	// Manage - Change SMS-Email
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Email/SMS')]")
	public  WebElement home_manage_booking_sms_btn;
	
	public  void clickManageBookingSmsBtn() {
		home_manage_booking_sms_btn.click();
	}
	
}

