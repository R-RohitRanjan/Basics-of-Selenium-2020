package com.basicsofselenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ReadPropertiesFile 
{
	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		
//************************************************* Read Properties File **********************************************************
		Properties prop=new Properties();
		
		FileInputStream ips=new FileInputStream("C:\\Users\\Rohit Ranjan\\eclipse-workspace"
				+ "\\SeleniumProjectSe2020\\src\\test\\java\\com\\basicsofselenium\\TestingData.properties");
		prop.load(ips);
		System.out.println(prop.getProperty("FirstName"));
		System.out.println(prop.getProperty("LastName"));
		System.out.println(prop.getProperty("URL"));
		String url=prop.getProperty("URL");
		System.out.println(url);
		
		String browserName=prop.getProperty("BrowserName");
		System.out.println(browserName);
		
		if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Ranjan\\eclipse-workspace"
					+ "\\SeleniumProjectSe2020\\Drivers\\chromedriver.exe"); //Set Path of Driver
			driver = new ChromeDriver(); //Launch Chrome
		}
		else if(browserName.equals("FireFox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rohit Ranjan\\eclipse-workspace"
					+ "\\SeleniumProjectSe2020\\Drivers\\geckodriver.exe"); //Set Path of Driver
			 driver = new FirefoxDriver(); //Launch FireFox Browser
		}
		else if(browserName.equals("MicrosoftEdge"))
		{
			System.setProperty("webdriver.msedge.driver", "C:\\Users\\Rohit Ranjan\\eclipse-workspace"
					+ "\\SeleniumProjectSe2020\\Drivers\\msedgedriver.exe"); //Set Path of Driver
			 driver = new FirefoxDriver(); //Launch FireFox Browser
		}
		
		driver.manage().window().maximize(); //Maximizing
		driver.manage().deleteAllCookies(); //Deleting the cookies
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(prop.getProperty("UserName_xpath"))).sendKeys(prop.getProperty("UserName"));
		driver.findElement(By.xpath(prop.getProperty("Password_xpath"))).sendKeys(prop.getProperty("Password"));
		driver.findElement(By.xpath(prop.getProperty("LoginButton_xpath"))).click();
		Thread.sleep(2000);
		
		
//*******************************Frame Handling****************************************************
		
		driver.switchTo().frame("mainpanel");
		Thread.sleep(2000);
		
//*******************************Mouse movement Handling****************************************************
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();

//*******************************Select Handling****************************************************
		
		Select select=new Select(driver.findElement(By.xpath(prop.getProperty("Salutation_xpath"))));
		select.selectByVisibleText("Mr.");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(prop.getProperty("FirstName_xpath"))).sendKeys(prop.getProperty("FirstName"));
		driver.findElement(By.xpath(prop.getProperty("LastName_xpath"))).sendKeys(prop.getProperty("LastName"));
		driver.findElement(By.xpath(prop.getProperty("Email_xpath"))).sendKeys(prop.getProperty("Email"));
		
		//driver.findElement(By.xpath(prop.getProperty("SaveButton_xpath"))).click();
		
		//Thread.sleep(20000);
		//driver.quit();
		

	}
	

}
