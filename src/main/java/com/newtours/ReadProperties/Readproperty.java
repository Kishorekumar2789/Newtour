package com.newtours.ReadProperties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readproperty {
	
	private static String TEST_ROOT_DIR;
	private static String PROP_FILE="Data.properties";
	public static FileInputStream fis=null;
	
	private static Properties prop= new Properties();
	
     public Readproperty() {
		
	    
		TEST_ROOT_DIR = System.getProperty("user.dir");
		try {
			
		fis=new FileInputStream(TEST_ROOT_DIR+File.separator+PROP_FILE);
		
		prop.load(fis);
		//System.out.println("Browser is "+prop.getProperty("Browser"));
		
		String Browser=getTestdata("Browser");
		System.out.println("Browser is "+Browser);
		fis.close();
		
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	
	public  static String getTestdata(String element){
		 String locator=prop.getProperty(element);
		 System.out.println("locator :"+locator);
		  return locator;
		
	}

}
