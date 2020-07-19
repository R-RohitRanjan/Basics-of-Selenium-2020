/*
package com.basicsofselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Ranjan\\eclipse-workspace\\SeleniumProjectSe2020\\Drivers\\chromedriver.exe"); //Set Path of Driver
		WebDriver driver1=new ChromeDriver(); //Launch Chrome 
		
		driver1.manage().window().maximize(); //Maximizing
		driver1.manage().deleteAllCookies(); //Deleting the cookies
		
		driver1.get("https://www.who.int/emergencies/diseases/novel-coronavirus-2019?gclid=Cj0KCQjwudb3BRC9ARIsAEa-vUs0YgLe6tIOnVsQw0_r9imlMTstBkMufG8CTdq3qDOiemkI8wo47QAaAoTwEALw_wcB"); //Enter URL
		
		//Dynamic Wait
		driver1.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
//****************************************Calling Explicitly Wait Method*********************************************************************
		
		clickOn(driver1, driver1.findElement(By.xpath("//a//img[@src='https://www.who.int/images/default-source/health-topics/coronavirus/map.tmb-768v.jpg']")), 100);
		Thread.sleep(5000);
//		driver1.navigate().back();
//		Thread.sleep(2000);
		clickOn(driver1, driver1.findElement(By.xpath("//div[@class='sc-AxjAm sc-oTmZL iyMYjo']")), 100);
		
		Thread.sleep(5000);
		driver1.quit();
		
	}
	
	//****************************************Declaring Explicitly Wait Method*********************************************************************
	
	@SuppressWarnings("deprecation")
	public static void clickOn(WebDriver driver1,WebElement locator,int timeout)
	{
//		new WebDriverWait(driver1,timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
//		locator.click();
		new WebDriverWait(driver1,timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
	}

}
*/
