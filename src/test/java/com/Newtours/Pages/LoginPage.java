package com.Newtours.Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.ITestResult;

import com.Helpermethods.TakeScreenshot;

public class LoginPage {

	WebDriver driver;
	
	TakeScreenshot screenshot= new TakeScreenshot();
	
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
		
		
		Username.sendKeys(Uname);
		Password.sendKeys(Pass);
		Login.click();
		
		
		
		
	}
	
}
