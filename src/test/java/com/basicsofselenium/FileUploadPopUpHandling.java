package com.basicsofselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUpHandling 
{

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Rohit Ranjan\\eclipse-workspace\\SeleniumProjectSe2020\\Drivers\\chromedriver.exe"); //Set Path of Driver
		WebDriver driver1=new ChromeDriver(); //Launch Chrome
		driver1.manage().window().maximize(); //Maximizing
		driver1.get("URL"); //Enter URL
		System.out.println("Chrome Browser Lauching");
		
//*****************************************	FileUploadPopUp Handling from Our Computer Instead of Browser*******************************
	//As we can't Automate Desktop application by using Selenium,so  we can not switch to desktop's PopUp window appeared during the file upload
	//So instead of selecting the file from the DesktopPopUp window, we have to provide the complete path of the corresponding File
	//Don't click on Brows or Upload Button only provide the location or Path of the file present in your computer
	//i.e don't use click() method, only sendKeys() method will be used
		
		driver1.findElement(By.xpath("xpath or id or name etc")).sendKeys("file location andd file name with file extension");

	}

}
 