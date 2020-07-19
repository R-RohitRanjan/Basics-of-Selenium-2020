package com.basicsofselenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDown 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Ranjan\\eclipse-workspace\\SeleniumProjectSe2020\\Drivers\\chromedriver.exe"); //Set Path of Driver
		WebDriver driver=new ChromeDriver(); //Launch ChromeBrowser
		driver.manage().window().maximize(); //Maximizing
		driver.manage().deleteAllCookies(); //Deleting the cookies
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2"); //Enter URL
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default' and @title='HTML, CSS']")).click();
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li//a//label"));
		System.out.println(list.size());

		
//*************************Select Only 'Angular' if we pass Angular to contains() method
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("Angular"))
			{
				list.get(i).click();
				break;
			}
			
		}
	

//****************************Select All the elements present in the List and DeSelect already selected elements
		
/*
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
			list.get(i).click();
			
		}
*/

	}

}
