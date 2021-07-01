package com.redbus.utils;

import org.testng.SkipException;

import com.redbus.tests.Base;

public class CommomUtils extends Base {

	public static void toCheckExecutionRequired(String executionRequired) {
		// if execution required field is "no" test will be skipped
		if (executionRequired.equals("no")) {
			throw new SkipException("Skipping this exception");
		} // if execution required field is empty test will be skipped
		if (executionRequired.equals("")) {
			throw new SkipException("Skipping this exception");
		}
	}
}
