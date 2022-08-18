package com.actions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

    public static void main(String[] args) throws IOException {
    	
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anand Raja\\eclipse-workspace\\com.actions\\driver\\chromedriver.exe");
		
    	WebDriver driver = new ChromeDriver();
    	
    	driver.get("https://www.facebook.com/");
    	
    	TakesScreenshot screenshot = (TakesScreenshot)driver;
    	
    	File s = screenshot.getScreenshotAs(OutputType.FILE);
    	
    	File destination = new File("C:\\Users\\Anand Raja\\eclipse-workspace\\com.actions\\screenshot.png");
    
        FileUtils.copyFile(s, destination);
        
       
        
    	
	}
    
}
