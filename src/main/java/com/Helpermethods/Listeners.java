package com.Helpermethods;

import org.testng.ITestContext;		
import org.testng.ITestListener;		
import org.testng.ITestResult;	

public class Listeners implements ITestListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		
		System.out.println("The name of the testcase failed is :"+result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		System.out.println("The name of the testcase failed is :"+context.getName());
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("The name of the testcase failed is :"+context.getName());
		
	}

	

	

	
	
	
	
	
	
}
