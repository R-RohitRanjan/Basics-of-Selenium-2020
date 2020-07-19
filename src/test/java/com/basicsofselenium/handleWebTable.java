package com.basicsofselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleWebTable 
{

	public static void main(String[] args) throws InterruptedException 
	{
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Ranjan\\eclipse-workspace\\SeleniumProjectSe2020\\Drivers\\chromedriver.exe"); //Set Path of Driver
		WebDriver driver=new ChromeDriver(); //Launch Chrome
		driver.manage().window().maximize(); //Maximizing
		driver.manage().deleteAllCookies(); //Deleting the cookies
		driver.get("https://classic.freecrm.com/index.html"); //Enter URL
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("RohitN");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Rajasobhit");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		driver.switchTo().frame("mainpanel");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		
		
		/*

		Method1:
			Iterate row and column and get the cell Value.
			Using for loop
			Get total rows and iterate table
			Put if(String matches) then select the value
			Lengthy method
		*/
		
		//*[@id='vContactsForm']/table/tbody/tr[4]/td[2]/a
		//*[@id='vContactsForm']/table/tbody/tr[5]/td[2]/a
		//*[@id='vContactsForm']/table/tbody/tr[6]/td[2]/a
		//*[@id='vContactsForm']/table/tbody/tr[7]/td[2]/a
		//*[@id='vContactsForm']/table/tbody/tr[8]/td[2]/a
		
/*
		String before_xpath="//*[@id='vContactsForm']/table/tbody/tr[";
		String after_xpath="]/td[2]/a";
		for(int i=4;i<=16;i++)
		{
			String name=driver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
			System.out.println(name);
			if(name.contains("Rahul Ranjan"))
			{
				driver.findElement(By.xpath("//*[@id='vContactsForm']/table/tbody/tr["+i+"]/td[2]/a")).click();
			}
	
		}
*/
		
		
/* 
Method2:
	Using custom xpath
	Using parent and preceding sibling tags
	No need to write for loop
	No full iteration of table
	Single line statement
	More dynamic
	Efficient and fast
	
*/
		
		driver.findElement(By.xpath("//a[contains(text(),'Rahul Ranjan')]/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Niranjan Nihal')]/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Nagma Jabee')]/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Niranjan Nihal')]/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Niranjan Nihal')]/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Sobhit Kumar')]/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();


	}

}
