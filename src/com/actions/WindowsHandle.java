package com.actions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anand Raja\\eclipse-workspace\\com.actions\\driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement lnkbox = driver.findElement(By.id("twotabsearchtextbox"));
		lnkbox.sendKeys("Iphone" , Keys.ENTER);
		
		WebElement lnkphn = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal'][1]"));
		lnkphn.click();
		
		String parwin = driver.getWindowHandle();
		System.out.println(parwin);
		
		Set<String> allwinid = driver.getWindowHandles();
		System.out.println(allwinid);
		
		for (String cntl : allwinid) {
			
			System.out.println(cntl);
			
			if (!(cntl.equals(parwin))) {
				
				driver.switchTo().window(cntl);
				
				WebElement addcart = driver.findElement(By.id("add-to-cart-button"));
				addcart.click();
				
				
			}
			
		}
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
