package com.Newtours.BrowserFactory;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.Helpermethods.Webdriver;
import com.newtours.ReadProperties.Readproperty;

public class LaunchBrowser extends Webdriver {
	
	
	
	private static String browser=Readproperty.getTestdata("Browser");
	private static String Url=Readproperty.getTestdata("Appurl");
	
	/*public static  WebDriver getDriver() {
		
		System.out.println("browser is: "+ browser);
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+File.separator+"\\ChromeDriver\\chromedriver.exe");
		    driver=new ChromeDriver();
		    }
		return driver;
	}*/
	public static WebDriver  launchBrowser()	{
		System.out.println("browser is: "+ browser);
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+File.separator+"\\ChromeDriver\\chromedriver.exe");
		    driver=new ChromeDriver();
		    }
		
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
		}
	
	
	
	
	}
	
	
	
	


