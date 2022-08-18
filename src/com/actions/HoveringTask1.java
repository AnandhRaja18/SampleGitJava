package com.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoveringTask1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anand Raja\\eclipse-workspace\\com.actions\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		WebElement btnclose = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		
		btnclose.click();
		
		WebElement btnelectronics = driver.findElement(By.xpath("(//div[@class='xtXmba'])[5]"));
	
		Actions actions = new Actions(driver);
		
		actions.moveToElement(btnelectronics).perform();
		
		WebElement Linklaptop = driver.findElement(By.xpath("//a[contains(text(),'Laptop and Desktop')]"));
		
		actions.moveToElement(Linklaptop).perform();
		
		WebElement btnlaptop = driver.findElement(By.xpath("(//a[@class='_6WOcW9 _3YpNQe'])[3]"));
		
		btnlaptop.click();
		
		WebElement linktxt = driver.findElement(By.xpath("//span[text()='Become a Seller']"));
		
		String text = linktxt.getText();
		
		System.out.println(text);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
