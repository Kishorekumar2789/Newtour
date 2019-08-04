package Listeners;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.testng.Reporter;

import com.Helpermethods.Webdriver;

public class TakeScreenshot extends Webdriver  {
	
	public static void takeScreenshot(String methodname) throws IOException {

    	
    	System.out.println("Entering into Screenshot class");
    
	    File scrFile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    
	    File screenShotName = new File(System.getProperty("user.dir")+"/FailedScreenshots/"+methodname+timestamp()+".png");
	   
	   
	    FileUtils.copyFile(scrFile, screenShotName);
	     
	  
	    Reporter.log("<br><img src='"+screenShotName+"' height='400' width='400'/><br>");
    	
    	 }
	 public static String timestamp() {
	        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	    }

}
