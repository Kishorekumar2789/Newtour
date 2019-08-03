package com.Newtours.Pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.Helpermethods.Locators;
import com.newtours.ReadProperties.Readproperty;

public class RegisterPage {
	
	WebDriver driver;
	
	public  RegisterPage(WebDriver ldriver) {
		this.driver=ldriver;
		
	}
	
	
	
	
	  @FindBy(how=How.LINK_TEXT, using = "REGISTER")
	  WebElement Register;
	 
	
	@FindBy(how=How.NAME, using = "firstName")
	 WebElement FirstName;
	
	@FindBy(how=How.NAME, using = "lastName")
	WebElement LastName;
	
	@FindBy(how=How.NAME, using = "phone")
	WebElement Phone;
	
	@FindBy(how=How.NAME, using = "userName")
	WebElement UserName;
	
	@FindBy(how=How.NAME, using = "address1")
	WebElement Address1;
	
	@FindBy(how=How.NAME, using = "address2")
	WebElement Address2;
	
	@FindBy(how=How.NAME, using = "city")
	WebElement City;
	
	@FindBy(how=How.NAME, using = "state")
	WebElement State;
	
	@FindBy(how=How.NAME, using = "postalCode")
	WebElement PostalCode;
	
	@FindBy(how=How.NAME, using = "country")
	WebElement Countries;
	
	@FindBy(how=How.NAME, using = "email")
	WebElement Username;
	
	@FindBy(how=How.NAME, using = "password")
	WebElement Password;
	
	@FindBy(how=How.NAME, using = "confirmPassword")
	WebElement ConfirmPassword;
	
	@FindBy(how=How.NAME, using = "register")
	WebElement Submit;
	
	@FindBy(how=How.LINK_TEXT, using = "sign-in")
	WebElement Signin;
	
	  
	
	public  void registerData() throws Exception {
		
		Register.click();
		FirstName.sendKeys(Readproperty.getTestdata("FirstName"));
		LastName.sendKeys(Readproperty.getTestdata("Lastname"));
		Phone.sendKeys(Readproperty.getTestdata("Phone"));
		Address1.sendKeys(Readproperty.getTestdata("Address1"));
		Address2.sendKeys(Readproperty.getTestdata("Address2"));
		City.sendKeys(Readproperty.getTestdata("City"));
		State.sendKeys(Readproperty.getTestdata("state"));
		PostalCode.sendKeys(Readproperty.getTestdata("Postalcode"));
		
		Locators.selectmethod(Countries, Readproperty.getTestdata("country"), driver);
		Username.sendKeys(Readproperty.getTestdata("FirstName"));
		Password.sendKeys(Readproperty.getTestdata("Password"));
		ConfirmPassword.sendKeys(Readproperty.getTestdata("Password"));
		Submit.click();
		
		Signin.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
