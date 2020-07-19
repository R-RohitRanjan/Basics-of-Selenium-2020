package com.basicsofselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept 
{


	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Ranjan\\eclipse-workspace\\SeleniumProjectSe2020\\Drivers\\chromedriver.exe"); //Set Path of Driver
		
		//1.HtmlUnitDriver is not available by default  from Selenium3.x onwards
		//2.HtmlUnitDriver -----> To use this concept we have to Download HtmlUnitDriver JAR file and add to selenium
		//3.In this case, without launching the browser testing or execution happens in the background
		//4.This process is very fast and hence performance of the script is improved
		//5.not suitable for Actions class or User action like mouse movement, double click, drag and drop.
		//6.HtmlUnitDriver is also called "Ghost Driver" or "Headless Browser" because browser is not launching i.e without browser.
		//7.Following are Headless Browser:
		//                ------HtmlUnitDriver :For Java
		//                ------PhantomJS :For JavaScript
		
		
//******************************************HtmlUnitDriver Concept********************************************************
		WebDriver driver=new HtmlUnitDriver();
		

//******************************************HtmlUnitDriver Concept********************************************************
		
		//WebDriver driver=new ChromeDriver(); //Launch Chrome
		
//***************************************************************************************************************
		
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
