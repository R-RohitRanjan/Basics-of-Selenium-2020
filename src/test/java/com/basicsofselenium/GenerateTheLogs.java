
package com.basicsofselenium;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GenerateTheLogs 
{

	public static void main(String[] args) 
	{
		Logger log = Logger.getLogger(GenerateTheLogs.class);
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Ranjan\\eclipse-workspace\\SeleniumProjectSe2020\\Drivers\\chromedriver.exe"); //Set Path of Driver
		WebDriver driver=new ChromeDriver(); //Launch Chrome
	
		
		log.info("Launching Browser");
		
		driver.get("https://www.google.co.in/");
		
		String title = driver.getTitle();
		System.out.println("Title Value is: "+title);
		
		log.info("Title value is:"+title);
		
		if(title.equals("Google"))
		{
			System.out.println("Correct Title is Google");
			log.info("Correct Title is Google and test cases are Passed");
		}
		else
		{

			System.out.println("Correct Title is NOT Google");
			log.info("Correct Title is NOT Google and test cases are Failed");
			
		}
	}
}
	

