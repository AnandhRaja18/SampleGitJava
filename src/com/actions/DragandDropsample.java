package com.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropsample {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anand Raja\\eclipse-workspace\\com.actions\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement s = driver.findElement(By.id("credit2"));
		WebElement d = driver.findElement(By.id("bank"));
		
		Actions actions = new Actions(driver);
		
		actions.dragAndDrop(s, d).perform();
		
		WebElement s1 = driver.findElement(By.id("fourth"));
		WebElement d1 = driver.findElement(By.id("amt7"));
		
		actions.dragAndDrop(s1, d1).perform();
		
		WebElement s2 = driver.findElement(By.id("credit1"));
		WebElement d2 = driver.findElement(By.id("loan"));
		
		actions.dragAndDrop(s2, d2).perform();
		
		WebElement source = driver.findElement(By.id("fourth"));
		WebElement destination = driver.findElement(By.id("amt8"));
		
		actions.dragAndDrop(source, destination).perform();
		
		
		
		
		
		
	
		
		
		
		
	}

}
