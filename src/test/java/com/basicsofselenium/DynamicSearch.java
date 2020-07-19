package com.basicsofselenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicSearch 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Ranjan\\eclipse-workspace\\SeleniumProjectSe2020\\Drivers\\chromedriver.exe"); //Set Path of Driver
		WebDriver driver=new ChromeDriver(); //Launch Chrome
		driver.manage().window().maximize(); //Maximizing
		driver.manage().deleteAllCookies(); //Deleting the cookies
		driver.get("https://www.google.com"); //Enter URL
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
//*************************************************************************************************************************************		
/*STEPS: Most Important for Interview

		Google Search--->Pick a value from suggestions
		Search using xPath
		To find more than one element Use: driver.findElements(By.)
		Store all the elements in list: By using List
		Get list of elements by using: get(index)
		Print list of elements by using: get(index).getText()
		Use if condition to match the value: list.get(index).getText().contains("Type Matching Text")
		Click on the Match value
		Apply break to come out from the for loop, if desired element found successfully 
*/
//**************************************Use of Descendant in Customize xPath*************************************************************
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Testing");

		List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
		System.out.println("Total Number of Suggetions in Search Box: "+list.size());
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("testing types"))
			{
				list.get(i).click();
				break;
			}
		}
		
	}

}
