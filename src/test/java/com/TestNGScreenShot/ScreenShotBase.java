package com.TestNGScreenShot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenShotBase 
{
	public static WebDriver driver;
	
	public static void initialization()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Ranjan\\eclipse-workspace\\SeleniumProjectSe2020\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
	}
	
	public void failed(String testMethodName)
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try 
		{
			String date = new Date().toString();
			String dateTime = date.replaceAll(":", "_");
			FileUtils.copyFile(scrFile, new File("C:\\Users\\Rohit Ranjan\\eclipse-workspace\\SeleniumProjectSe2020\\TestNGScreenshot\\"+testMethodName+dateTime+".png"));
			System.out.println(new Date().toString());
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

}
