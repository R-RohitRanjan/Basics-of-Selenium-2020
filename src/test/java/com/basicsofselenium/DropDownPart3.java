package com.basicsofselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownPart3 
{
	static WebDriver driver;

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Ranjan\\eclipse-workspace\\SeleniumProjectSe2020\\Drivers\\chromedriver.exe"); //Set Path of Driver
		driver=new ChromeDriver(); //Launch Chrome
		driver.manage().window().maximize(); //Maximizing
		driver.get("https://www.facebook.com/"); //Enter URL
		System.out.println("Chrome Browser Lauching");
		
		
		driver.findElement(By.id("u_0_m")).sendKeys("Rohit");
		driver.findElement(By.id("u_0_o")).sendKeys("Ranjan");
		
		driver.findElement(By.id("u_0_r")).sendKeys("7532842164");
		
		driver.findElement(By.id("password_step_input")).sendKeys("Rajasobhit@5513");
		
		String day_xpath= "//select[@id='day']//option";
		String month_xpath= "//select[@id='month']//option";
		String year_xpath= "//select[@id='year']//option";
		selectDropDownValue(day_xpath, "25");
		selectDropDownValue(month_xpath, "Aug");
		selectDropDownValue(year_xpath, "1994");
		
	}
	public static void selectDropDownValue(String xpathValue, String value)
	{
		List<WebElement> monthList = driver.findElements(By.xpath(xpathValue));
		System.out.println(monthList.size());


		for(int i=0; i<monthList.size(); i++)
		{
			System.out.println(monthList.get(i).getText());
			
			if(monthList.get(i).getText().equals(value))
			{
				monthList.get(i).click();
				break;
			}
			
		}
	}

}
