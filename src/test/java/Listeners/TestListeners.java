package Listeners;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.xml.LaunchSuite;

import com.Helpermethods.Webdriver;
import com.Newtours.BrowserFactory.LaunchBrowser;

public class TestListeners implements ITestListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestFailure(ITestResult result) {

		
		 try {
		 
		  System.out.println("Method name: "+result.getName());
		TakeScreenshot.takeScreenshot(result.getName());
		} catch (IOException e) {
		 e.printStackTrace();
		}	 

	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		System.out.println("The name of the testcase failed is :" + context.getName());

	}

	public void onFinish(ITestContext context) {
		System.out.println("The name of the testcase failed is :" + context.getName());

	}

}
