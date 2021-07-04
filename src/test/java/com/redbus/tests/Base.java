package com.redbus.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.redbus.utils.ExcelDataReaderFile;
import com.redbus.utils.TakeScreenshot;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Base {

	static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest extentTest;
	public static ExcelDataReaderFile reader = null;

	// initialize logger
	public static Logger log = Logger.getLogger(Base.class);
	static File file = new File(".\\Resources\\config.properties");
	static FileInputStream fis = null;

	public static String LOG_FILE = ".\\Resources\\log4j.properties";
	static FileInputStream logfile = null;

	static Properties prop = new Properties();

	static {
		try {
			fis = new FileInputStream(file);
			logfile = new FileInputStream(LOG_FILE);
			PropertyConfigurator.configure(logfile);
		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			prop.load(fis);
			prop.load(logfile);
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			reader = new ExcelDataReaderFile(".\\Resources\\testDataExcel.xlsx");
		}

		catch (Exception e) {
			log.error(e.getMessage());
		}

	}

	@BeforeSuite(groups = { "valid", "invalid" })
	public void setExtent() {
//		extent = new ExtentReports("C:\\Users\\prakharrastogi01\\eclipse-workspace\\practice\\SeleniumAssignmentFinal\\Reports\\ExtentReports.html");
		extent = new ExtentReports(prop.getProperty("extent_report_path"));
	}

	@AfterSuite(groups = { "valid", "invalid" })
	public void endReport() {
		extent.flush();
		extent.close();
	}

	@AfterMethod(groups = { "valid", "invalid" })
	public void attachScreenShot(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			String screenshotPath = TakeScreenshot.takeScreenShot(driver, result.getName());
			extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(screenshotPath));
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			extentTest.log(LogStatus.PASS, "Valid scenario Test-Case passed successfully");
		}
		extent.endTest(extentTest);
	}

	@BeforeMethod(groups = { "valid", "invalid" })
	public static void intializeWebdriver() throws Exception {
		String browser = prop.getProperty("browser_name");
		String headless = prop.getProperty("headless_mode");

		// Check if parameter passed is firefox
		if (browser.equalsIgnoreCase("firefox")) {
			if (headless.equalsIgnoreCase("yes")) {
				System.setProperty(prop.getProperty("f_driver"), prop.getProperty("firefox_driver"));
				FirefoxBinary firefoxBinary = new FirefoxBinary();
				firefoxBinary.addCommandLineOptions("-headless");
				FirefoxOptions options = new FirefoxOptions();
				options.setBinary(firefoxBinary);
				// creating a firefox driver with headless
				driver = new FirefoxDriver(options);
			} else if (headless.equalsIgnoreCase("no")) {

				// creating a firefox driver without headless
				System.setProperty(prop.getProperty("f_driver"), prop.getProperty("firefox_driver"));
				driver = new FirefoxDriver();

			}
		}

		// Check if parameter is 'chrome'
		else if (browser.equalsIgnoreCase("chrome")) {
			if (headless.equalsIgnoreCase("yes")) {
				System.setProperty(prop.getProperty("c_driver"), prop.getProperty("chrome_driver"));
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-notifications");
				options.addArguments(
						"user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/68.0.3440.84 Safari/537.36");
				options.addArguments("headless");
				// create chrome instance with headless
				driver = new ChromeDriver(options);
			} else if (headless.equalsIgnoreCase("no")) {
				// creating a chrome driver without headless
				System.setProperty(prop.getProperty("c_driver"), prop.getProperty("chrome_driver"));
				driver = new ChromeDriver();
			}
		}
		// Check if parameter is 'Edge'
		else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty(prop.getProperty("e_driver"), prop.getProperty("edge_driver"));
			// create Edge instance
			driver = new EdgeDriver();
		} else {
			// If no browser passed throw exception
			throw new Exception("PLEASE CHECK THE BROWSER NAME !");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@BeforeMethod(groups = { "valid", "invalid" })
	public static void openBrowser() {
		driver.get(prop.getProperty("url"));
		log.debug("opening webiste");
	}

	@AfterMethod(groups = { "valid", "invalid" })
	public static void closeBrowser() {
		// extent.endTest(extentTest);
		driver.close();
		driver.quit();
	}

}
