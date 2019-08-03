package com.Helpermethods;

import java.io.*;
import java.util.*;
import java.text.*;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.*;

import org.testng.*;

public class TakeScreenshot extends TestListenerAdapter {
	
	
	
 WebDriver driver;
	
	    public void onTestFailure() throws IOException {
	    	
	    	String timeStamp;
		    File screenShotName;
		    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    //The below method will save the screen shot in d drive with name "screenshot.png"
		    timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()); 
		    screenShotName = new File("D:\\MyTest\\Screenshots\\"+timeStamp+".png");
		    FileUtils.copyFile(scrFile, screenShotName);
		     
		    String filePath = screenShotName.toString();
		    String path = "\"<a href=" + filePath +" target='_blank' >\" \"</a>\"";
		    Reporter.log(path);
	    	
	    	 }
	    }
	    
	    
	    
	


