package com.basicsofselenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUpHandling 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Rohit Ranjan\\eclipse-workspace\\SeleniumProjectSe2020\\Drivers\\chromedriver.exe"); //Set Path of Driver
		WebDriver driver1=new ChromeDriver(); //Launch Chrome
		driver1.manage().window().maximize(); //Maximizing
		driver1.get("http://www.popuptest.com/"); //Enter URL
		System.out.println("Chrome Browser Lauching");
		driver1.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		
		driver1.findElement(By.xpath("//a[contains(text(),'Multi-PopUp Test')]")).click();
		Thread.sleep(2000);
		
		//********************Types of PopUp*********************
		//1.Alerts PopUp--->It is javaScript PopUp---->Alert API(accept,dismiss)
		//2.File Upload PopUp----->Brows button or upload button or choose button (type=file,sendKeys()path)
		//3.Brows window PopUp----->Advertisement PopUp (windowHandler API--->getWindowHandles())
		
		Set<String>handler=driver1.getWindowHandles();
		Iterator<String>it=handler.iterator();
		String parentWindowId=it.next();
		System.out.println("Parent Window ID: "+parentWindowId);
		
		String childWindowId=it.next();
		System.out.println("Child Window ID: "+childWindowId);
		
		driver1.switchTo().window(childWindowId);
		Thread.sleep(2000);
		System.out.println("Child Window PopUp Title: "+driver1.getTitle());
		driver1.manage().window().maximize();
		Thread.sleep(10000);
		driver1.close();
		driver1.switchTo().window(parentWindowId);
		Thread.sleep(2000);
		System.out.println("Parent Window Title: "+driver1.getTitle());
		
		driver1.findElement(By.xpath("//input[@type='button']")).click();
		driver1.findElement(By.xpath("//a[contains(text(),'Multi-PopUp Test #2')]")).click();
		driver1.manage().window().maximize();
		driver1.close();
		
	}

}
