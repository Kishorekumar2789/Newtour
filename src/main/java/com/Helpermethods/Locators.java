package com.Helpermethods;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class Locators {
	
	static WebElement element,fluentelement;
	
	public static void selectmethod(WebElement element,String value,WebDriver driver) throws Exception{
		
		Select select=new Select(element);
		select.selectByVisibleText(value);
	}

	
}
