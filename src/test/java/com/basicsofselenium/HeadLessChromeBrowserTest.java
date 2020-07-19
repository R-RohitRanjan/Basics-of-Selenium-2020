package com.basicsofselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessChromeBrowserTest 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Ranjan\\eclipse-workspace\\SeleniumProjectSe2020\\Drivers\\chromedriver.exe"); //Set Path of Driver
		
		ChromeOptions options=new ChromeOptions();
		
		//***********************************************************************
		//chrome version should be greater than 59version for Linux and greater than 60 for windows machine
		//In this case chrome will not be launched 
		//This is mobile window size:
		//Without this line, it is also working fine: It means the particular site is compatible without this mobile window
		//But for some other site or application, it will not work properly without this mobile window:It means that particular site is not compatible without this mobile window
		//This is recommended to write
		options.addArguments("window-size=1400,800");
		
		//***********************************************************************
		
		options.addArguments("headless");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().window().maximize(); //Maximizing
		driver.manage().deleteAllCookies(); //Deleting the cookies
		driver.get("https://classic.freecrm.com/index.html"); //Enter URL
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Title Before Login: "+driver.getTitle());
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("RohitN");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Rajasobhit");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000);
		System.out.println("Title After Login: "+driver.getTitle());
	

	}

}
