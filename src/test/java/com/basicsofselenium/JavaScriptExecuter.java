package com.basicsofselenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;


public class JavaScriptExecuter
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Ranjan\\eclipse-workspace\\SeleniumProjectSe2020\\Drivers\\chromedriver.exe"); //Set Path of Driver
		WebDriver driver=new ChromeDriver(); //Launch Chrome
		driver.manage().window().maximize(); //Maximizing
		driver.manage().deleteAllCookies(); //Deleting the cookies
		driver.get("https://classic.freecrm.com/index.html"); //Enter URL
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("RohitN");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Rajasobhit12");
		
		
//****************************JavaScript Method call********************************************************************
		
		WebElement loginButton=driver.findElement(By.xpath("//input[@type='submit']"));
		//flash(loginButton,driver); //Lighting the element
		
		flash(loginButton, driver);
		
		drawBorder(loginButton, driver);
		

		
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(scr,new File("C:\\Users\\Rohit Ranjan\\eclipse-workspace\\SeleniumProjectSe2020\\ScreenShots\\Picture_Bug.png"));
		
		//generateAlert(driver, "There is an issue with the LOGIN BUtton");
		clickOnElementByJS(loginButton, driver);
		refreshPageByJS(driver);
		System.out.println(getTitleByJS(driver));
		System.out.println(getInnerTextOfPage(driver));
		//scrollingOfPage(driver);
		
		WebElement forgotPassword=driver.findElement(By.xpath("//a[contains(text(),'Forgot Password?')]"));
		scrollIntoView(forgotPassword, driver);
		
	}
	
	
	
//************************************JavaScript Methods****************************************

//*****************************************To Perform Box or Button Blinking with some color*************************************** 
	           //executeScript:---------->To execute JavaScript code
	
	public static void flash(WebElement element,WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		System.out.println(js);
		String bgcolor=element.getCssValue("backgroundColor");
		for(int i=0;i<=10;i++)
		{
			changeColor("#000000",element,driver);
			changeColor(bgcolor,element,driver);
		}
	}
	
	public static void changeColor(String color,WebElement element,WebDriver driver) 
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.backgroundColor='"+color+"'",element);
		
		try
		{
			Thread.sleep(2);
		}
		catch(InterruptedException e)
		{
			
		}	
		
	}
	
//*****************************************To Draw Colored Border For any Button or Box*************************************** 
	public static void drawBorder(WebElement element,WebDriver driver) 
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	
//*****************************************To Generate Alert Message***********************************************************
	public static void generateAlert(WebDriver driver,String message)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('"+message+"')");
	}
	
//*****************************************To Click on a particular element*************************************** 
	public static void clickOnElementByJS(WebElement element,WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",element);
	}

//*****************************************To Refresh the Page using JS*************************************** 
	
	public static void refreshPageByJS(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("history.go(0)");
	}
//*****************************************To get Title of the Page using JS*************************************** 
	
	public static String getTitleByJS(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String title=js.executeScript("return document.title;").toString();
		return title;
		
	}

//*****************************************To get Inner Text of the Page using JS*************************************** 
	
	public static String getInnerTextOfPage(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String pageText = js.executeScript("return document.documentElement.innerText;").toString();
		return pageText;
			
	}

	
	//*****************************************To do Scrolling of the Page using JS*************************************** 
	
		public static void scrollingOfPage(WebDriver driver)
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			
				
		}
		
		//*****************************************To do Scrolling into view of the Page using JS*************************************** 
		
			public static void scrollIntoView(WebElement element,WebDriver driver)
			{
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].scrollIntoView(true);",element);
				
					
			}
}
