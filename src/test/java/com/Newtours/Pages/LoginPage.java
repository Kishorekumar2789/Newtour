package com.Newtours.Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.ITestResult;



public class LoginPage {

	WebDriver driver;
	
	
	
	public  LoginPage(WebDriver Ldriver) {
		this.driver=Ldriver;
	}
	
	@FindBy(how=How.NAME,using = "userName")
	WebElement Username;
	
	@FindBy(how=How.NAME,using = "password")
	WebElement Password;
	
	@FindBy(how=How.NAME,using = "login")
	WebElement Login;
	
	
	public void performLogin(String Uname, String Pass) throws IOException, InterruptedException {
		
		try {
			
		//String beforeloginurl=driver.getCurrentUrl();
		
		Username.sendKeys(Uname);
		Password.sendKeys(Pass);
		Login.click();
		
		String Afterlogin=driver.getCurrentUrl();
		
		Assert.assertEquals(Afterlogin, "http://newtours.demoaut.com/mercuryreservation.php");
		
			/*
			 * if(!Login.isDisplayed()) System.out.println("Pass");
			 */
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
		
		
	}
	
}
