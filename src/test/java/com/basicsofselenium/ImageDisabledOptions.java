package com.basicsofselenium;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class ImageDisabledOptions 
{
	
	

	public static void main(String[] args) 
	{
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Ranjan\\eclipse-workspace\\rohit.selenium\\Drivers\\chromedriver\\chromedriver.exe"); //Set Path of Driver
//		ChromeOptions options = new ChromeOptions();
//		disableImageChrome(options);
//		
//		
//		WebDriver driver=new ChromeDriver(options); //Launch Chrome
//		
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rohit Ranjan\\eclipse-workspace\\SeleniumProjectSe2020\\Drivers\\chromedriver.exe"); //Set Path of Driver
		FirefoxOptions options = new FirefoxOptions();
		disableImageFirefox(options);
		
		
		WebDriver driver=new FirefoxDriver(options); 
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/"); //Enter URL
		System.out.println(driver.getTitle());

	}
//	public static void disableImageChrome(ChromeOptions options)
//	{
//	HashMap<String, Object> images = new HashMap<String, Object>();
//	images.put("images", 2);
//	
//	HashMap<String, Object> prefs = new HashMap<String, Object>();
//	prefs.put("profile.default_content_setting_values", images);
//	
//	options.setExperimentalOption("prefs", prefs);
//	}
//	
	
	
	
	public static void disableImageFirefox(FirefoxOptions options)
	{
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("permissions.default.image", 2);
		options.setProfile(profile);
		options.setCapability(FirefoxDriver.PROFILE, profile);
	}


}
