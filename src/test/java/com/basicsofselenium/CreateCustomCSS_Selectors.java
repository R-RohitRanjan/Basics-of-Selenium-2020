package com.basicsofselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateCustomCSS_Selectors 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rohit Ranjan\\eclipse-workspace\\SeleniumProjectSe2020\\Drivers\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver(); //Launch Chrome
		driver.manage().window().maximize(); //Maximizing
		driver.manage().deleteAllCookies(); //Deleting the cookies
		driver.get("https://guide.blazemeter.com/hc/en-us"); //Enter URL
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Custom CSS Selector
		
		//1. ID : htmalTag#id, #id
		
		//2. class : htmlTag.classname, .className, .c1.c2.c3, htmltag.c1.c2...cn
		
		//3. htmlTag#id.className1.className2....
		
		//4. parent>childTag
		
		//5.htmlTag[id='idName']-----CSS Selector with one attribute
		//htmlTag[@id='idName']-----xpath with one attribute
		
		//6.htmlTag[id='idName'][type='typeName']-----CSS Selector with two attributes
		//htmlTag[@id='idName' and @type='typeName']-----xpath with two attributes
		
		//7. contains in CSS
		//input[id*='name']
		//input[id*='user']
		
		//8. Starting the text in CSS
		//test_123
		//test_4576
		//Ex for username
		//input[id^='user']
		
		//9. Ending the text in CSS
		//1123_test
		//5877_test
		//input[id$='name']
		
		//10. Comma in CSS
		//div.classname,htmlTag#childIdNameof Same Class
		
		//11.Handling List(li) tag		
		//htmlTag#id>li:first-of-type------go to first element of li
		//htmlTag#id>li:last-of-type------go to last element of li
		//htmlTag#id>li:nth-of-type(enter specific li number)------go to specific element of li
		//htmlTag#id>li:nth-of-type(n)------for all the elements
		
		//12.sibling of elements(+ is used for sibling)
		//htmlTag.className+htmlTag
		//htmlTag.className+htmlTag.className Of sibling
		
		//13.not operator in CSS
		//htmlTag.className:not(.content to be excluded from the corresponding class)
		
	}

}
