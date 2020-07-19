package com.basicsofselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium1DriverFundamentals 
{
	
	public static void main(String[] args) 
	{
		//*******************fire fox driver*************************************
		/*
		1.Goto google/type Firebug/Add to fireFox
		2.Goto google/type Firepath/Add to fireFox
		3.Enable Firebug By clicking on Icon of bug
		4.Click on Fire path
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rohit Ranjan\\eclipse-workspace\\rohit.selenium\\Drivers\\geckodriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver(); 
		driver.get("https://www.google.co.in/webhp");
		System.out.println("FireFox Browser Launching");
		*/
		
		
		//******************************Safari Driver***************************
		//No need to setProperty for safari driver
		/*
		1.Add safari WebDriver to the Safari Extension
		2.goto safari..>Prefences..>
		3.open google.com/search safari extension for selenium/download latest release
		4.Goto Develop Tab in Safari/Select "Allow Remote Automation"
		5.goto Safari/prefences/Advanced/tick CheckBox of "Show Develop menu in menu bar"
		
		 WebDriver driver=new SafariDriver();
		 driver.get("https://www.google.co.in");
		 System.out.println(driver.getTitle());
		 driver.quit();
		*/
		
		
		//*************************chrome Driver******************************
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Ranjan\\eclipse-workspace\\SeleniumProjectSe2020\\Drivers\\chromedriver.exe"); //Set Path of Driver
		WebDriver driver1=new ChromeDriver(); //Launch Chrome
		driver1.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp"); //Enter URL
		System.out.println("Chrome Browser Lauching");
		driver1.manage().window().maximize(); //Maximizing
		String title=driver1.getTitle(); //Get Title of WebPage
		System.out.println(title );
		//validation point:
//		if(title.equals("Google"))
//		{
//			System.out.println("Correcr Title");
//		}
//		else
//		{
//			System.out.println("in-Correct Title");
//		}
//		System.out.println(driver1.getCurrentUrl()); //Current Page URL
		//System.out.println(driver1.getPageSource()); //current Page sources of WebSite
		
		//driver1.manage().window().minimize();
		//driver1.quit(); //Quit the Browser
		
//*************************** 1.xpath() method:---2nd Priority ***********************************************************
		//Absolute Xpath should not be be used
		//only relative xpth should be used
		
		driver1.findElement(By.xpath("//input[contains(@aria-label,'First name')]")).sendKeys("Rohit");
		driver1.findElement(By.xpath("//input[contains(@aria-label,'Last name')]")).sendKeys("Ranjan");
		driver1.findElement(By.xpath("//input[contains(@autocomplete,'username')]")).sendKeys("rohitranjaann");
		driver1.findElement(By.xpath("//input[contains(@aria-label,'Password')]")).sendKeys("rajasobhit");
		driver1.findElement(By.xpath("//input[contains(@aria-label,'Confirm')]")).sendKeys("rajasobhit");
		//driver1.findElement(By.xpath("//div[@jscontroller='cUYNmd'][contains(.,'Sign in instead')]")).click();
		driver1.findElement(By.xpath("//span[@class='RveJvd snByac'][contains(.,'Next')]")).click();
		Select select=new Select(driver1.findElement(By.className("MocG8c aCjZuc LMgvRb KKjvXb")));
		select.selectByVisibleText("India");
		driver1.findElement(By.xpath("phoneNumberId")).sendKeys("7532842164");
		//driver1.findElement(By.className("RveJvd snByac")).click();

		//driver1.quit(); //Quit the Browser
		
//		
		
//*************************** 2.By Using id() method:---1st Priority ******************************************************
		
//		driver1.findElement(By.id("firstName")).sendKeys("Rohit");
//		driver1.findElement(By.id("lastName")).sendKeys("Ranjan");

//*************************** 3.By Using name() method:---3rd Priority ******************************************************
		
//		driver1.findElement(By.name("firstName")).sendKeys("Rohittttttttt");
//		driver1.findElement(By.name("lastName")).sendKeys("Ranjannnnnnnnn");

//*************************** 4.By Using linkText() method:---This is used Only for Links ******************************************************
		
		//driver1.findElement(By.linkText("Sign in instead")).click();

//************************** 5.By using partialLinkText() method:--- Used For links (Not Recommended)**************************************************************
	
		//driver1.findElement(By.partialLinkText("")).click();
		

//************************** 6.By using cssSelector() method:--- Used For links (Not Recommended)**************************************************************
//if id is there:--- #id
//if class is there:-- .class
		//driver1.findElement(By.cssSelector("")).sendKeys("");
		
		
//************************** 7.By using className() method:--- Not Recommended**************************************************************

		//driver1.findElement(By.className("")).sendKeys("");
		
	}

}
