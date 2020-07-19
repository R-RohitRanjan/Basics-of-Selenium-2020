package com.basicsofselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ElementVisibilityTest 
{

	public static void main(String[] args) 
	{
		//Set Path of Driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rohit Ranjan\\eclipse-workspace\\SeleniumProjectSe2020\\Drivers\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver(); //Launch Chrome
		driver.manage().window().maximize(); //Maximizing
		driver.manage().deleteAllCookies(); //Deleting the cookies
		driver.get("https://classic.freecrm.com/register"); //Enter URL
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
//******************************************isDisplay(), isEnable() and isSelected() Methods*************************************************
		/*
		1. isDisplay():
			isDisplay() is the method used to verify presence of a web element within the webPage.
			This method returns a "true"value if the specific web element is present on the web page,
			and a 'false' value if the web element is not present on the web page.
			This method is capable to check for the presence of all kinds of web element.
		
		2. isEnable():
			isEnable() is the method used to verify if the web element is enabled or disabled within the webPage.
			It is mostly used wit Button.Button1
			
		3. isSelected():
			isSelected() is the method used to verify if the web element is selected or not.
			It is mostly used with radio buttons, dropDowns and checkBox.
			
		*/

//********************************************************************************************************************************************
		
		
		//1. isDisplayed() Method: Applicable for all elements
		boolean b1=driver.findElement(By.id("submitButton")).isDisplayed();
		System.out.println(b1); //true
		
		//2. isEnable() Method:
		boolean b2=driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(b2); //false
		
		//Select I Agree CheckBox:
		driver.findElement(By.name("agreeTerms")).click(); //Submit Button is Enabled now
		boolean b3=driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(b3); //true
		
		
		//3. isSelected() Method: Applicable for CheckBox, DropDown, RadioButton
		boolean b4=driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(b4); //true
		
		//DeSelect the CheckBox
		driver.findElement(By.name("agreeTerms")).click();
		boolean b5=driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(b5); //false

	}

}
