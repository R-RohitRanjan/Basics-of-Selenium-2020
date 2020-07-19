package com.basicsofselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementExceptionConcept 
{
	static WebDriver driver;

	public static void main(String[] args) 
	{
		
		//StaleElementException we will mostly get in Ajax based WebPage designing to refresh the particular element of the page
				
		//Run in the DeBug mode
		//Press fn+F6
		//Mouse over on the particular element: We will get Unique Dynamic ID, which is generated by Selenium
		//By using that particular ID Selenium is interact with the element
		//Refresh the page: Older ID will be gone and new ID will be generated and due to this we will get StaleElementException
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Ranjan\\eclipse-workspace\\SeleniumProjectSe2020\\Drivers\\chromedriver.exe"); //Set Path of Driver
		driver=new ChromeDriver(); //Launch Chrome
		driver.manage().window().maximize(); //Maximizing
		driver.manage().deleteAllCookies(); //Deleting the cookies
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://classic.freecrm.com/index.html"); //Enter URL
		
		WebElement useName=driver.findElement(By.xpath("//input[@name='username']"));
		useName.sendKeys("RohitN");
		WebElement Password=driver.findElement(By.xpath("//input[@name='password']"));
		Password.sendKeys("Rajasobhit");
		
	}

}