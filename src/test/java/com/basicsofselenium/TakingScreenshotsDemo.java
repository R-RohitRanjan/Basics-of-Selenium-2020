package com.basicsofselenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakingScreenshotsDemo 
{

	public static void main(String[] args) throws IOException, InterruptedException
	{
		//*********************************************Proper Way of Launching the Browser*************************************************************************************************
		
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Ranjan\\eclipse-workspace\\SeleniumProjectSe2020\\Drivers\\chromedriver.exe"); //Set Path of Driver
				WebDriver driver1=new ChromeDriver(); //Launch Chrome
				driver1.manage().window().maximize(); //Maximizing
				driver1.manage().deleteAllCookies(); //Deleting the cookies
				driver1.get("https://www.apiit.edu.in/"); //Enter URL
				driver1.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				driver1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				
				File scr=((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);
				Files.copy(scr,new File("C:\\Users\\Rohit Ranjan\\eclipse-workspace\\rohit.selenium\\ScreenShots\\Picture1.png"));
				Thread.sleep(5000);
				
				File scr1=((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);
				Files.copy(scr1,new File("C:\\Users\\Rohit Ranjan\\eclipse-workspace\\rohit.selenium\\ScreenShots\\Picture2.jpg"));

	}

}
