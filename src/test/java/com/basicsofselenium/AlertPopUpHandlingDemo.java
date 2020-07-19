package com.basicsofselenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandlingDemo 
{

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rohit Ranjan\\eclipse-workspace\\SeleniumProjectSe2020\\Drivers\\chromedriver.exe"); //Set Path of Driver
		WebDriver driver1=new ChromeDriver(); //Launch Chrome
		driver1.manage().window().maximize(); //Maximizing
		driver1.get("https://www."); //Enter URL
		System.out.println("Chrome Browser Lauching");
		
//*********************************************Alert PopUp Handling********************************************************
	//We can not handle AlertPopUp window by using Locators because xpath,id,name,class, etc are not available for AlertPopUp
	//PopUp window is the java script PopUp window which has no any Locators
		
		driver1.findElement(By.id("u_0_m")).sendKeys("Rohit");
		
		Thread.sleep(10000);
		
		driver1.findElement(By.id("u_0_o")).sendKeys("Ranjan");
		Alert alert=driver1.switchTo().alert(); //Switch to the appeared AlertPpopUp Window from Current page
		System.out.println(alert.getText()); //Get the Total Text present in the AlertPopUp window
		alert.accept(); //Click on OK Button
		alert.dismiss(); //Click on Cancel Button
		
	}

}
