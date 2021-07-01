package com.redbus.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenshot {

	// for taking screenshots
	public static String takeScreenShot(WebDriver driver, String testcaseName) {

		// works only with absolute address
		String screenshotFileName = "C:\\Users\\prakharrastogi01\\eclipse-workspace\\practice\\SeleniumAssignmentFinal\\Reports\\"
				+ testcaseName + "TestFailed.jpg";
		// relative address
		// String screenshotFileName = ".\\Reports\\" + testcaseName + "TestFailed.jpg";

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(scrFile, new File(screenshotFileName));
		} catch (IOException e) {
			e.printStackTrace();
		}

		return screenshotFileName;
	}

}
