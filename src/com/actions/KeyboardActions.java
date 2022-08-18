package com.actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardActions {
	
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anand Raja\\eclipse-workspace\\com.actions\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		
		robot.keyPress(KeyEvent.VK_N);
		robot.keyRelease(KeyEvent.VK_N);
		
		robot.keyPress(KeyEvent.VK_R);
		robot.keyRelease(KeyEvent.VK_R);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_N);
		robot.keyRelease(KeyEvent.VK_N);
		
		robot.keyPress(KeyEvent.VK_J);
		robot.keyRelease(KeyEvent.VK_J);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
	  
	    
	    
	    
		
	}

}
