package com.SVG_Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElementHandling 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rohit Ranjan\\eclipse-workspace\\SeleniumProjectSe2020\\Drivers\\chromedriver.exe"); //Set Path of Driver
		WebDriver driver=new ChromeDriver(); //Launch Chrome
		driver.manage().window().maximize(); //Maximizing
		driver.get("http://debeissat.nicolas.free.fr/svg3d.php"); //Enter URL
		System.out.println("Chrome Browser Lauching");
		
		/*
		String color=driver.findElement(By.xpath("//*[name()='svg']//*[local-name()='circle']")).getAttribute("fill");
		System.out.println(color);
		
		String text=driver.findElement(By.xpath("//*[name()='svg']//*[local-name()='text' and @id='pointline']")).getText();
		System.out.println(text);
		
		*/
		
		driver.switchTo().frame("svg_result");
		while(true)
		{
			List<WebElement> eleList = driver.findElements(By.xpath("//*[name()='svg']//*[local-name()='g' and @id='g2']//*[local-name()='path' and contains(@id,'face')]"));
			for(WebElement ele : eleList)
			{
				String text = null;
				text = ele.getAttribute("d");
				System.out.println(text);
			}
		}

	}

}
