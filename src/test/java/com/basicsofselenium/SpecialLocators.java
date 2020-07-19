package com.basicsofselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.pagefactory.ByChained;

public class SpecialLocators 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Ranjan\\eclipse-workspace\\SeleniumProjectSe2020\\Drivers\\chromedriver.exe"); //Set Path of Driver
		WebDriver driver=new ChromeDriver(); //Launch Chrome
		driver.manage().window().maximize(); //Maximizing
		driver.manage().deleteAllCookies(); //Deleting the cookies
		driver.get("https://www.facebook.com/"); //Enter URL
		
		//In these all process Implicit Wait is NOT recommended 
		
		//******************************************************************
		
		driver.findElement(new ByAll(By.name(""),By.id(""),By.xpath(""),By.cssSelector(""))).sendKeys("");
		
		driver.findElement(new ByIdOrName("")).sendKeys("");
		
		//This is Used when Parent to child relation is present
		driver.findElement(new ByChained(By.id(""),By.xpath(""),By.className(""))).sendKeys("");

	}

}
