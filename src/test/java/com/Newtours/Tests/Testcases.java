package com.Newtours.Tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Newtours.BrowserFactory.LaunchBrowser;
import com.Newtours.Pages.FlightPage;
import com.Newtours.Pages.LoginPage;
import com.Newtours.Pages.RegisterPage;
import com.newtours.ReadProperties.Readproperty;

public class Testcases {

	
	WebDriver driver;
	Readproperty read=PageFactory.initElements(driver, Readproperty.class);
	
	
	
	
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		driver=LaunchBrowser.launchBrowser();
		
	    }
	
	    @Test(priority=1,description="Testcase 1")
	    public void registerUserdetails() throws Exception {
	    	
		 RegisterPage rpage= PageFactory.initElements(driver, RegisterPage.class);
	     rpage.registerData();
	     
	      }
		
	    @Test(priority=2,description="Testcase 2")	//Testcase 2
	     public void login() throws IOException, InterruptedException {
	    	
		LoginPage lpage=PageFactory.initElements(driver, LoginPage.class);
		lpage.performLogin(Readproperty.getTestdata("validusername"), Readproperty.getTestdata("validpassword"));
		
	     }	
		
		
		@Test(priority=3,description="Testcase 3")
		public void bookFlightdetails() throws Exception {
			
  		FlightPage fpage=PageFactory.initElements(driver, FlightPage.class);
  		fpage.enterFlightDetails();
  		
		}
  	
		@Test(priority=4,description="Testcase 4")
		public void invalidLogin() throws IOException, InterruptedException {
			
		LoginPage lpage=PageFactory.initElements(driver, LoginPage.class);	
  		lpage.performLogin(Readproperty.getTestdata("validusername"), Readproperty.getTestdata("Invalidpassword"));
  		
		}
		
		
	}
	
	
