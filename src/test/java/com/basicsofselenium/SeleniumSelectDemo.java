package com.basicsofselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumSelectDemo 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Ranjan\\eclipse-workspace\\SeleniumProjectSe2020\\Drivers\\chromedriver.exe"); //Set Path of Driver
		WebDriver driver1=new ChromeDriver(); //Launch Chrome
		driver1.manage().window().maximize(); //Maximizing
		driver1.get("https://www.facebook.com/"); //Enter URL
		System.out.println("Chrome Browser Lauching");
		
//*****************************By Using xpath***********************
//
//		driver1.findElement(By.xpath("//input[@type='text'][contains(@id,'m')]")).sendKeys("Rohit");
//		driver1.findElement(By.xpath("//input[@type='text'][contains(@id,'o')]")).sendKeys("Ranjan");
//		driver1.findElement(By.xpath("//input[contains(@name,'reg_email__')]")).sendKeys("7532842164");
//		
//		driver1.findElement(By.xpath("//input[@type='password'][contains(@id,'w')]")).sendKeys("Rajasobhit@5513");
//		Select select=new Select(driver1.findElement(By.xpath("//select[contains(@aria-label,'Day')]")));
//		select.selectByVisibleText("25");
//		Select select1=new Select(driver1.findElement(By.xpath("//select[contains(@aria-label,'Month')]")));
//		select1.selectByVisibleText("Aug");
//		Select select2=new Select(driver1.findElement(By.xpath("//select[contains(@aria-label,'Year')]")));
//		select2.selectByVisibleText("1994");
//		
//		driver1.findElement(By.xpath("//span[@class='_5k_2 _5dba'][contains(.,'Male')]")).click();
		
		
		
//*******************************By Using id**************************************
		


		driver1.findElement(By.id("u_0_m")).sendKeys("Rohit");
		driver1.findElement(By.id("u_0_o")).sendKeys("Ranjan");
		
		driver1.findElement(By.id("u_0_r")).sendKeys("7532842164");
		
		driver1.findElement(By.id("u_0_w")).sendKeys("Rajasobhit@5513");
		
		Select select=new Select(driver1.findElement(By.id("day")));
		select.selectByVisibleText("25");
		Select select1=new Select(driver1.findElement(By.id("month")));
		select1.selectByVisibleText("Aug");
		Select select2=new Select(driver1.findElement(By.id("year")));
		select2.selectByVisibleText("1994");
		
		driver1.findElement(By.id("u_0_7")).click();

	}

}
