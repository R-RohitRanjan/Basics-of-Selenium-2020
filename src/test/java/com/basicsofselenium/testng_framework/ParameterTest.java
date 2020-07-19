package com.basicsofselenium.testng_framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest 
{
	WebDriver driver;
	@Test
	@Parameters({"environment","browser","URL","emailId"})
	public void yahooLoginTest(String environment, String browser,String URL,String emailId)
	{
		/*Data Driven from Different Sources
			1.Excel file :------------>Store Test Data
			2.Properties File :------->Store environment Varialbles, Test Data
			3.TestNG.xml :------------>environment variables
			4.Xml Files
			5.JSON Files
			6.Database
			
		*/
		System.out.println(environment);
		if(browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Ranjan\\eclipse-workspace\\rohit.selenium\\Drivers\\chromedriver\\chromedriver.exe"); //Set Path of Driver
			driver=new ChromeDriver(); //Launch Chrome
		}
		else if(browser.equals("FirwFox"))
		{
			System.setProperty("webdriver.geco.driver", "C:\\Users\\Rohit Ranjan\\eclipse-workspace\\rohit.selenium\\Drivers\\chromedriver\\geckodriver.exe"); //Set Path of Driver
			driver=new FirefoxDriver(); //Launch Chrome 
		}
		
		driver.manage().window().maximize(); //Maximizing
		driver.manage().deleteAllCookies(); //Deleting the cookies
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(URL); //Enter URL
		
		driver.findElement(By.id("login-username")).clear();
		driver.findElement(By.id("login-username")).sendKeys(emailId);
		driver.findElement(By.id("login-signin")).click();
	}
}
