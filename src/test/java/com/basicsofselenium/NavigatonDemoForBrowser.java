package com.basicsofselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NavigatonDemoForBrowser 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
//*********************************************Proper Way of Launching the Browser*************************************************************************************************
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Ranjan\\eclipse-workspace\\SeleniumProjectSe2020\\Drivers\\chromedriver.exe"); //Set Path of Driver
		WebDriver driver1=new ChromeDriver(); //Launch Chrome
		driver1.manage().window().maximize(); //Maximizing
		driver1.manage().deleteAllCookies(); //Deleting the cookies
		driver1.get("https://www.apiit.edu.in/"); //Enter URL
		driver1.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
//****************************************************Mouse Movement*****************************************************************************************************************
		
		Actions action=new Actions(driver1);
		action.moveToElement(driver1.findElement(By.linkText("Faculty"))).build().perform();
		Thread.sleep(2000);
//		action.moveToElement(driver1.findElement(By.linkText("Faculty at APIIT"))).click();
//		Thread.sleep(2000);
		driver1.findElement(By.linkText("Faculty at APIIT")).click();
		Thread.sleep(5000);
		driver1.findElement(By.linkText("View Profile")).click();
		Thread.sleep(5000);
		//driver1.quit();
		
		
//********************************Back, Forward and Refresh Button simulation************************************************************************		
		//get() method is used to get the URL in first time
		//navigate.to() method is used to get the link of another URL from working current URL
		driver1.navigate().to("https://www.apiit.edu.in/");
		Thread.sleep(10000);
		driver1.navigate().back();
		Thread.sleep(10000);
		driver1.navigate().forward();
		Thread.sleep(10000);
		driver1.navigate().back();
		Thread.sleep(10000);
		driver1.navigate().refresh();
		Thread.sleep(10000);

		action.moveToElement(driver1.findElement(By.linkText("Faculty"))).build().perform();
		Thread.sleep(2000);
//		action.moveToElement(driver1.findElement(By.linkText("Faculty at APIIT"))).click();
//		Thread.sleep(2000);
		driver1.findElement(By.linkText("Faculty at APIIT")).click();
		Thread.sleep(5000);
		driver1.findElement(By.linkText("View Profile")).click();
		Thread.sleep(5000);
	}

}
