package com.FreeCRMTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FreeCRMTest 
{
	public static WebDriver driver;
	public static String Credentials;
	public static String credentialsInfo[];
	
	@BeforeMethod
	 

	public static void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Ranjan\\eclipse-workspace\\rohit.selenium\\Drivers\\chromedriver\\chromedriver.exe"); //Set Path of Driver
		driver=new ChromeDriver(); //Launch Chrome
		driver.manage().window().maximize(); //Maximizing
		driver.get("https://classic.freecrm.com/index.html"); //Enter URL
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test(priority=1)
	
	public static void loginWithAdminUserTest() throws InterruptedException
	{
	
		Credentials=DataForCRMTest.getUserLoginInfo().get("admin");
		credentialsInfo=Credentials.split("_");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(credentialsInfo[0]);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(credentialsInfo[1]);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		Thread.sleep(3000);
		driver.switchTo().frame("mainpanel");
		Select select= new Select(driver.findElement(By.name("slctMonth")));
		select.selectByVisibleText(DataForCRMTest.monthMap().get(11));
		
	}

		
	@Test(priority=2)
	
	public static void loginWithCustomerUserTest()
	{
	
		Credentials=DataForCRMTest.getUserLoginInfo().get("admin");
		String adminInfo[]=Credentials.split("_");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(adminInfo[0]);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(adminInfo[1]);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}
	@AfterMethod
	public void tearDown() 
	{
		driver.quit();
	}

}


