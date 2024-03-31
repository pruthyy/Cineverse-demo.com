package com.Listner;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Utility.ExtentReporter;

public class Listner implements ITestListener{
	
	ExtentReports extentReport;
	ExtentTest extentTest;
	
	@Override
	public void onStart(ITestContext context) {
		extentReport = ExtentReporter.generateExtentReport();		
	}

	@Override
	public void onTestStart(ITestResult result) {
		String testName= result.getName();
		extentTest = extentReport.createTest(testName);
		extentTest.log(Status.INFO, testName+"Started Executing");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String testName= result.getName();
		extentTest.log(Status.PASS, testName+"Got Successfully Executed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String testName= result.getName();
			extentTest.log(Status.INFO,result.getThrowable());
			extentTest.log(Status.FAIL, testName+"Got Failled");
			System.out.println(testName+"Got Failled");	
		
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		String testName= result.getName();	
		extentTest.log(Status.INFO,result.getThrowable());
		extentTest.log(Status.SKIP, testName+"Got Skipped");	}

	@Override
	public void onFinish(ITestContext context) {
		extentReport.flush();
		
	}
	
	
}

