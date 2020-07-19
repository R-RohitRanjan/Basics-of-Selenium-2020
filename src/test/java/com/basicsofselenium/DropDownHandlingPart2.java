package com.basicsofselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandlingPart2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Ranjan\\eclipse-workspace\\SeleniumProjectSe2020\\Drivers\\chromedriver.exe"); //Set Path of Driver
		WebDriver driver=new ChromeDriver(); //Launch Chrome
		driver.manage().window().maximize(); //Maximizing
		driver.get("https://www.facebook.com/"); //Enter URL
		System.out.println("Chrome Browser Lauching");
		
		
		driver.findElement(By.id("u_0_m")).sendKeys("Rohit");
		driver.findElement(By.id("u_0_o")).sendKeys("Ranjan");
		
		driver.findElement(By.id("u_0_r")).sendKeys("7532842164");
		
		driver.findElement(By.id("password_step_input")).sendKeys("Rajasobhit@5513");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		Select daySelect = new Select(day);
		daySelect.selectByIndex(25);
		
		Select monthSelect = new Select(month);
		monthSelect.selectByIndex(8);
		
		Select yearSelect = new Select(year);
		yearSelect.selectByIndex(27);
		
		
		System.out.println(daySelect.isMultiple());
		System.out.println(monthSelect.isMultiple());
		System.out.println(yearSelect.isMultiple());
		
		
		List<WebElement> listDays = daySelect.getOptions();
		System.out.println(listDays.size());
		int totalDays = listDays.size()-1;
		System.out.println("Total Days are : "+totalDays);
		
		for(int i=0;i<listDays.size();i++)
		{
			String dayVals = listDays.get(i).getText();
			System.out.println(dayVals);
			if(dayVals.equals("25"))
			{
				listDays.get(i).click();
				break;
			}
		}
		

	}

}
