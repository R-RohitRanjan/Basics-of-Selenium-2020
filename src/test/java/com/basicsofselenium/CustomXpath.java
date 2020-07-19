package com.basicsofselenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Ranjan\\eclipse-workspace\\SeleniumProjectSe2020\\Drivers\\chromedriver.exe"); //Set Path of Driver
		WebDriver driver1=new ChromeDriver(); //Launch Chrome
		driver1.get("http://www.jquiryui.com/droppable/"); //Enter URL
		driver1.manage().window().maximize(); //Maximizing
		driver1.manage().deleteAllCookies(); //Deleting the cookies
		
		//Dynamic Wait
		driver1.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
//********************************************Custom XPath for text field************************************************
		
		
		//driver1.findElement(By.xpath("//input[@class='actextbox']")).sendKeys("Java");
		//driver1.findElement(By.xpath("//input[@name='query']")).sendKeys("Java");
		
		//driver1.findElement(By.xpath("//input[contains(@class,'actextbox')]")).sendKeys("java");
		
		
		//If dynamicID (Id is not fixed it will change randomly) is given as:
		//1.id=test_123
		//By.id("test_123")
		//2.id=test_234
		//3.id=123_test
		
		//4.id=test_test_1234
		//5.id=test_test_12455_test
		
		//6.id=12324_test_test_t
		//7.id=12324_test_t
		
		
		//driver1.findElement(By.xpath("//input[contains(@id,'test_')]")).sendKeys("java");
		//driver1.findElement(By.xpath("//input[starts-with(@id,'test_')]")).sendKeys("java");
		//driver1.findElement(By.xpath("//input[ends-with(@id,'_test_t')]")).sendKeys("java");
		
		
//***********************************Custom XPath for link************************************************************
		
		
		//driver1.findElement(By.xpath("//a[contains(text(),'My Account')]")).click();
		
		
//**************************************Find Elements(important for interview)****************************************
		//1.Get total count of links on a page
		//2.Get text of each link on a page
		
		List <WebElement> linkList=driver1.findElements(By.tagName("a")); // findElements but NOT findElement
		//tagName("a"):------>Tag For links:Give total links on a page
		//tagName("button"):---->Tag for Buttons:Gives total number of buttons on a page
		System.out.println(linkList.size());
		for(int i=0;i<linkList.size();i++)
		{
			String linkText=linkList.get(i).getText();
			System.out.println(linkText);
		}
		
		

	}

}
