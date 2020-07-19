package com.firefoxseleniumdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessFireFoxBrowser 
{

	public static void main(String[] args) 
	{

		
		FirefoxBinary firefoxBinary = new FirefoxBinary();
		firefoxBinary.addCommandLineOptions("--headless");

		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rohit Ranjan\\eclipse-workspace\\rohit.selenium\\Drivers\\geckodriver\\geckodriver.exe");
		FirefoxOptions fo = new FirefoxOptions();
		
		fo.setBinary(firefoxBinary);
		WebDriver driver = new FirefoxDriver(fo);
		
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		System.out.println(title);
	}

}
