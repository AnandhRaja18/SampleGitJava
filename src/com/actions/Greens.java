package com.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens {
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anand Raja\\eclipse-workspace\\com.actions\\driver\\chromedriver.exe");
	
	    WebDriver driver = new ChromeDriver();
	    
	    
	    
	    driver.get("http://www.greenstechnologys.com/");
	    
	   
	    
	    driver.close();
	    
	
	
	
	
	
	
	}



}
