package com.basicsofselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysCharSequences 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rohit Ranjan\\eclipse-workspace\\SeleniumProjectSe2020\\Drivers\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver(); //Launch Chrome
		driver.manage().window().maximize(); //Maximizing
		driver.manage().deleteAllCookies(); //Deleting the cookies
		driver.get("https://app.hubspot.com/login"); //Enter URL
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		WebElement email = driver.findElement(By.id("username"));
		
//We can send the keys to the SendKeysCharSequences in the following ways
		
		//1. String:
		//email.sendKeys("rohitranjan@gmail.com");
		
		//2. StringBuilder:
		
		/*
		StringBuilder username = new StringBuilder()
				.append("Rohit")
				.append(" ")
				.append("Ranjan")
				.append(" ")
				.append("Selenium");
		System.out.println(username);
		email.sendKeys(username);
		*/
		//3. StringBuffer
		/*
		StringBuffer username = new StringBuffer()
				.append("Rohit")
				.append(" ")
				.append("Ranjan")
				.append(" ")
				.append("Selenium");
		System.out.println(username);
		email.sendKeys(username);
		
		*/
		
		//4. We can Send Multiple keys to the SendKeysCharSequences in the Combination of : StringBuilder, StringBuffer, String, Keys
		 
		StringBuilder username = new StringBuilder()
				.append("Rohit")
				.append(" ")
				.append("Ranjan")
				.append(" ")
				.append("Selenium");
		System.out.println(username);
		
		
		String space= " ";
		
		StringBuffer userInfo = new StringBuffer()
				.append("Nagma")
				.append(" ")
				.append("Jabee")
				.append(" ")
				.append("Selenium")
				.append(" ");
		
		String author = "Rohit Ranjan";
		System.out.println(userInfo);
		
		email.sendKeys(username,space,userInfo,author,Keys.TAB);

	}

}
