package com.qa.tests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListner implements ITestListener {

	public static void main(String[] args) {

	}

	public void onTestStart(ITestResult result) {

		System.out.println("Test started " + " " + result.getName());

	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test case is failed " + " " + result.getName());

	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		System.out.println("Test case is completed " + " " + context.getName());

	}

}
