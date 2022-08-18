package com.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Scrolls {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anand Raja\\eclipse-workspace\\com.actions\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		
		WebElement lnktxt = driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
		executor.executeScript("arguments[0].scrollIntoView('true')", lnktxt);
		
		Thread.sleep(5000);
		
		WebElement lnktxt2 = driver.findElement(By.xpath("//h2[@class='a-color-base headline truncate-2line'][1]"));
		executor.executeScript("arguments[0].scrollIntoView('false')", lnktxt2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
