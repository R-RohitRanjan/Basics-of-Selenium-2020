package com.singleton.pattern;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SingletonTestBase 
{
	public static WebDriver driver = null;
	
	public static void initialize()
	{
		//singleton pattern
		if(driver ==null)
		{
			if(Constants.browserName.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Rohit Ranjan\\eclipse-workspace\\SeleniumProjectSe2020\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			
			if(Constants.browserName.equalsIgnoreCase("firefox"))
			{
				System.setProperty("wedriver.gecko.driver","C:\\Users\\Rohit Ranjan\\eclipse-workspace\\SeleniumProjectSe2020\\Drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(Constants.url);
	}
	
	public static void quit()
	{
		System.out.println("Quitting The Browser");
		driver.quit();
		driver=null;
				
	}
	
	public void close()
	{
		System.out.println("closing The Brwoser");
		driver.close();
		driver = null;
	}
	
}
