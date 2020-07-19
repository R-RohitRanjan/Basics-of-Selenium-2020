package com.basicsofselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick 
{

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Ranjan\\eclipse-workspace\\SeleniumProjectSe2020\\Drivers\\chromedriver.exe"); //Set Path of Driver
		WebDriver driver=new ChromeDriver(); //Launch Chrome
		driver.manage().window().maximize(); //Maximizing
		driver.manage().deleteAllCookies(); //Deleting the cookies
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html"); //Enter URL
		
		Actions action=new Actions(driver);
		
		WebElement rightClickButton = driver.findElement(By.cssSelector(".context-menu-one"));
		
		action.contextClick(rightClickButton).build().perform();
		
		WebElement copy = driver.findElement(By.cssSelector(".context-menu-icon-copy"));
		
		String copyText = copy.getText();
		System.out.println(copyText);
		
		copy.click();
		
		
		

	}

}
