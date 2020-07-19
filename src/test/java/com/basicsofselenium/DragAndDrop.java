package com.basicsofselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Ranjan\\eclipse-workspace\\SeleniumProjectSe2020\\Drivers\\chromedriver.exe"); //Set Path of Driver
		WebDriver driver1=new ChromeDriver(); //Launch Chrome
		driver1.manage().window().maximize(); //Maximizing
		driver1.manage().deleteAllCookies(); //Deleting the cookies
		driver1.get("https://jqueryui.com/droppable/"); //Enter URL
		
//***************************************Drag And Drop The Element**************************************************************
		
		driver1.switchTo().frame(0); //switch to frame if it is present otherwise no need to write this line
//if frame is not there in the page and if we want to perform drag and drop for normal element then we will not use this line "driver1.switchTo().frame(0);"
		Actions action=new Actions(driver1);
		action.clickAndHold(driver1.findElement(By.xpath("//div[@id='draggable']")))
		.moveToElement(driver1.findElement(By.xpath("//div[@id='droppable']")))
		.release()
		.release()
		.perform();

	}

}
