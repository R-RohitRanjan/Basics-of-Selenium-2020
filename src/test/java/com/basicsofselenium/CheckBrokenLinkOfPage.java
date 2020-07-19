package com.basicsofselenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBrokenLinkOfPage 
{

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Ranjan\\eclipse-workspace\\SeleniumProjectSe2020\\Drivers\\chromedriver.exe"); //Set Path of Driver
		WebDriver driver=new ChromeDriver(); //Launch Chrome
		driver.manage().window().maximize(); //Maximizing
		driver.manage().deleteAllCookies(); //Deleting the cookies
		driver.get("https://classic.freecrm.com/index.html"); //Enter URL
		//driver.get("https://makemysushi.com/404");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("RohitN");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Rajasobhit");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		driver.switchTo().frame("mainpanel");
		
		//Links---> //a href<http://www.google.com>

		//image---> //img href<http://www.google.com>
		
		//1.Get the List of all the links and images
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		linkList.addAll(driver.findElements(By.tagName("img")));
		System.out.println("Size of Total Links and Images : "+linkList.size());
		
		List<WebElement> activeLinks=new ArrayList<WebElement>();
		
		//2.Iterate linkList
		for(int i=0; i<linkList.size(); i++)
		{
			System.out.println(linkList.get(i).getAttribute("href"));
			if(linkList.get(i).getAttribute("href") != null && (!linkList.get(i).getAttribute("href").contains("javascript")))
			{
				activeLinks.add(linkList.get(i));
			}
		}
		
		//get the size of active links
		System.out.println("Size of Active Links and Images : "+activeLinks.size());
		
		//3.Check the href url, with httpconnection api
		//200 -- OK Link
		//404 -- Not Found
		//500 -- Internal Error
		//400 -- Bad Request
		
		for(int j=0; j<activeLinks.size(); j++)
		{
			HttpURLConnection connection=(HttpURLConnection)new URL(activeLinks.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String response=connection.getResponseMessage();
			connection.disconnect();
			System.out.println(activeLinks.get(j).getAttribute("href")+"---:"+response);
		}
		
	}
}
