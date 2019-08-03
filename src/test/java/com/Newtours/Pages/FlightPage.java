package com.Newtours.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.Helpermethods.Locators;
import com.newtours.ReadProperties.Readproperty;

public class FlightPage {
	
	WebDriver driver;
	
	public  FlightPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(how=How.NAME, using = "tripType")
	List<WebElement> Trip; 
	
	@FindBy(how=How.NAME, using = "passCount")
	WebElement Passengers; 
	
	@FindBy(how=How.NAME, using = "fromPort")
	WebElement CountryFromDeparting; 
	
	@FindBy(how=How.NAME, using = "fromMonth")
	WebElement FromMonth;
	
	@FindBy(how=How.NAME, using = "fromDay")
	WebElement FromDay; 
	
	
	
	@FindBy(how=How.NAME, using = "toPort")
	WebElement CountryToArrive; 
	
	@FindBy(how=How.NAME, using = "toMonth")
	WebElement ToMonth; 
	
	@FindBy(how=How.NAME, using = "toDay")
	WebElement ToDay; 
	
	@FindBy(how=How.NAME, using = "airline")
	WebElement Airline; 
	
	@FindBy(how=How.NAME, using = "findFlights")
	WebElement Continue; 
	
	@FindBy(how=How.NAME,using = "reserveFlights")
	WebElement ReserveFlight;
	
	@FindBy(how=How.NAME,using = "passFirst0")
	WebElement Username;
	
	@FindBy(how=How.NAME,using = "passLast0")
	WebElement Lastname;
	
	@FindBy(how=How.NAME,using = "creditnumber")
	WebElement CreditcardNumber;
	
	@FindBy(how=How.NAME,using = "buyFlights")
	WebElement Securepurchase;
	
	@FindBy(how=How.LINK_TEXT,using = "SIGN-OFF")
	WebElement SIGNOFF;
	
	
	
	
	
	
	
	
	public void enterFlightDetails() throws Exception {
		
		Locators.selectmethod(Passengers, Readproperty.getTestdata("Passengers"), driver);
		
		Locators.selectmethod(CountryFromDeparting, Readproperty.getTestdata("DepatFrom"), driver);
		
		Locators.selectmethod(FromMonth, Readproperty.getTestdata("FromMonth"), driver);
		
		Locators.selectmethod(FromDay, Readproperty.getTestdata("FromDate"), driver);
		
		Locators.selectmethod(CountryToArrive, Readproperty.getTestdata("ArrivingCountry"), driver);
		
		Locators.selectmethod(ToMonth, Readproperty.getTestdata("Return"), driver);
		
		Locators.selectmethod(ToDay, Readproperty.getTestdata("ReturnDay"), driver);
		
		Locators.selectmethod(Airline, Readproperty.getTestdata("Airline"), driver);
		
		Continue.click();
		
		ReserveFlight.click();
		
		Username.sendKeys(Readproperty.getTestdata("FirstName"));
		
		Lastname.sendKeys(Readproperty.getTestdata("Lastname"));
		
		CreditcardNumber.sendKeys(Readproperty.getTestdata("Creditcardnumber"));
		
		Securepurchase.click();
		
		SIGNOFF.click();
		
		
		
	}
	
	
	

}
