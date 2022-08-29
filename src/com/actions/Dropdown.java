package com.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Anand Raja\\eclipse-workspace\\com.actions\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://adactinhotelapp.com/");

		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("anandhraja18");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("RAP@TER18");

		WebElement btnlogin = driver.findElement(By.xpath("//input[@class=\"login_button\"]"));
		btnlogin.click();
		
		WebElement dropdnl = driver.findElement(By.id("location"));

		Select select = new Select(dropdnl);

		select.selectByIndex(6);

		WebElement dropdnh = driver.findElement(By.id("hotels"));

		Select select1 = new Select(dropdnh);
		select1.selectByIndex(2);

		WebElement dropdnrt = driver.findElement(By.id("room_type"));

		Select select2 = new Select(dropdnrt);
		select2.selectByIndex(2);

		WebElement dropdnnor = driver.findElement(By.xpath("//select[@name='room_nos']"));

		Select select3 = new Select(dropdnnor);
		select3.selectByIndex(2);

		WebElement dropdnar = driver.findElement(By.id("adult_room"));

		Select select4 = new Select(dropdnar);
		select4.selectByIndex(2);

		WebElement btnsearch = driver.findElement(By.id("Submit"));
		btnsearch.click();

		WebElement btnselect = driver.findElement(By.id("radiobutton_0"));
		btnselect.click();

		WebElement btncontinue = driver.findElement(By.id("continue"));
		btncontinue.click();

		WebElement fname = driver.findElement(By.id("first_name"));  
		fname.sendKeys("Anandhraja");

		WebElement lname = driver.findElement(By.id("last_name"));
		lname.sendKeys("Anbu");

		WebElement add = driver.findElement(By.id("address"));
		add.sendKeys("Pobox 73601, belfast, maine");

		WebElement ccnum = driver.findElement(By.id("cc_num"));
		ccnum.sendKeys("6548924697852136");

		WebElement cctyp = driver.findElement(By.id("cc_type"));

		Select select5 = new Select(cctyp);
		select5.selectByIndex(3);

		WebElement ccmon = driver.findElement(By.id("cc_exp_month"));

		Select select6 = new Select(ccmon);
		select6.selectByIndex(12);

		WebElement ccyr = driver.findElement(By.id("cc_exp_year"));

		Select select7 = new Select(ccyr);
		select7.selectByIndex(12);

		WebElement ccvv = driver.findElement(By.id("cc_cvv"));
		ccvv.sendKeys("654");

		WebElement btnbook = driver.findElement(By.id("book_now"));
		btnbook.click();

		Thread.sleep(10000);
		
		WebElement orno = driver.findElement(By.id("order_no"));
		
        String att = orno.getAttribute("value");
        
        System.out.println(att);

	}

}
