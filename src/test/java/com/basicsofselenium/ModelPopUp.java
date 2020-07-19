package com.basicsofselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ModelPopUp {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Ranjan\\eclipse-workspace\\SeleniumProjectSe2020\\Drivers\\chromedriver.exe"); //Set Path of Driver
		WebDriver driver=new ChromeDriver(); //Launch Chrome
		driver.manage().window().maximize(); //Maximizing
		driver.manage().deleteAllCookies(); //Deleting the cookies
		driver.get("https://classic.freecrm.com/index.html"); //Enter URL
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("RohitN");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Rajasobhit");
		
		//Switch to popUp frame
		Thread.sleep(5000);
		driver.switchTo().frame("frame nname");
		
		//Mouse over the PopUp
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("xpath of PopUp "))).build().perform();
		
		//close or cancel the popUp
		driver.findElement(By.xpath("xpath of Ok or cancle or cross(x) icon")).click();
		
		//Then click on login button
		driver.findElement(By.xpath("//input[@value='Login']")).click();



	}

}
