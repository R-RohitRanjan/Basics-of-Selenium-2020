package com.basicsofselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling 
{

	public static void main(String[] args) 
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
		
		
//***********************************Method1 to handling the DropDown**************
	
		
		
//		Select select=new Select(driver.findElement(By.id("day")));
//		select.selectByVisibleText("25");
//		Select select1=new Select(driver.findElement(By.id("month")));
//		select1.selectByVisibleText("Aug");
//		Select select2=new Select(driver.findElement(By.id("year")));
//		select2.selectByVisibleText("1994");

		
		
//************************************Method2 to handle the DropDown (Recommended)***********************
		
		
//		WebElement day = driver.findElement(By.id("day"));
//		WebElement month = driver.findElement(By.id("month"));
//		WebElement year = driver.findElement(By.id("year"));
//		
//		selectValueFromDropDown(day,"25");
//		selectValueFromDropDown(month,"Aug");
//		selectValueFromDropDown(year,"1994");
		
		
		
//******************************************Generic way to handle DropDown******************
		//Recommended if we are accessing the data form the properties or some other file
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		
		String dob = "25-Aug-1994";
		String dobArr[]= dob.split("-");
		
		selectValueFromDropDown(day,dobArr[0]);
		selectValueFromDropDown(month,dobArr[1]);
		selectValueFromDropDown(year,dobArr[2]);
		
		driver.findElement(By.id("u_0_7")).click();

	}
	public static void selectValueFromDropDown(WebElement element, String value)
	{
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}

}
