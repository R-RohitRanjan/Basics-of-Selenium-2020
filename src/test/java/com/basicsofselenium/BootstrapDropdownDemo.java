package com.basicsofselenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdownDemo 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Ranjan\\eclipse-workspace\\SeleniumProjectSe2020\\Drivers\\chromedriver.exe"); //Set Path of Driver
		WebDriver driver=new ChromeDriver(); //Launch ChromeBrowser
		driver.manage().window().maximize(); //Maximizing
		driver.manage().deleteAllCookies(); //Deleting the cookies
		driver.get("https://v4-alpha.getbootstrap.com/components/dropdowns/"); //Enter URL
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		driver.findElement(By.id("dropdownMenuButton")).click();
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='dropdown-menu'and @aria-labelledby='dropdownMenuButton']//a"));
		System.out.println(list.size());
		
		for(int i=0;i<=list.size();i++)
		{
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("Another action"))
			{
				list.get(i).click();
				break;
			}
			
		}
	

	}

}
