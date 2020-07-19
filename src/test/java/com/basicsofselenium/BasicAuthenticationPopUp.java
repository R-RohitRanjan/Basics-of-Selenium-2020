package com.basicsofselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthenticationPopUp 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Ranjan\\eclipse-workspace\\SeleniumProjectSe2020\\Drivers\\chromedriver.exe"); //Set Path of Driver
		WebDriver driver=new ChromeDriver();
		//http://username:password@url
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		String pageMessage= driver.findElement(By.cssSelector("p")).getText();
		System.out.println(pageMessage);

	}

}
