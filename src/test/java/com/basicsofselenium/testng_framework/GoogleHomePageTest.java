package com.basicsofselenium.testng_framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleHomePageTest 
{
	static WebDriver driver;
	@BeforeMethod  //4
	public static void systemSetUp()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Ranjan\\eclipse-workspace\\rohit.selenium\\Drivers\\chromedriver\\chromedriver.exe"); //Set Path of Driver
		driver=new ChromeDriver(); //Launch Chrome
		driver.manage().window().maximize(); //Maximizing
		driver.manage().deleteAllCookies(); //Deleting the cookies
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/"); //Enter URL 
	}
	
	@Test(priority=1,groups="Title")  //5
	public static void googleTitleTest()
	{
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Test(priority=2,groups="Logo")  //5
	public static void googleLogoTest()
	{
		boolean logo=driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
		System.out.println(logo);
		//Assert.assertEquals(logo, "Google","Invalid Logo");
	}
	
	@Test(priority=3,groups="Search")  //5
	public static void googleSearchTest()
	{
		boolean mail=driver.findElement(By.linkText("Gmail")).isDisplayed();
		System.out.println(mail);
		//Assert.assertEquals(mail, "Gmail","Text not Mached");
	}
	
	@Test(priority=4,groups="Test")  //5
	public static void Test1()
	{
		System.out.println("Test1");
	}
	
	@Test(priority=5,groups="Test")  //5
	public static void Test2()
	{
		System.out.println("Test2");
	}
	
	@Test(priority=6,groups="Test")  //5
	public static void Test3()
	{
		System.out.println("Test3");
	}
	//Post Conditions : Starting With '@After'
	
	@AfterMethod  //6
	public static void tearDown()
	{
		driver.quit();
	}
	
	

	
	

}
