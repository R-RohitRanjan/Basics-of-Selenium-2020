package com.basicsofselenium;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
  
public class DynamicCalendar 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Ranjan\\eclipse-workspace\\SeleniumProjectSe2020\\Drivers\\chromedriver.exe"); //Set Path of Driver
		WebDriver driver=new ChromeDriver(); //Launch ChromeBrowser
		driver.manage().window().maximize(); //Maximizing
		driver.manage().deleteAllCookies(); //Deleting the cookies
		driver.get("https://classic.freecrm.com/index.html"); //Enter URL
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("RohitN");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Rajasobhit");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		driver.switchTo().frame("mainpanel");
		
/*   How to handle Calendar
		with the help of dynamic web table xPath concept
		Iterate the entire calendar grid by row and column
		Match the value and select the day
		Handle NoSuchElementException in the case of exceeding day value
*/
		
		String date="25-August-2020";
		String date1[]=date.split("-");
		String day=date1[0];
		String month=date1[1];
		String year=date1[2];
		Select select=new Select(driver.findElement(By.name("slctMonth")));
		select.selectByVisibleText(month);;
		
		//Thread.sleep(2000);

		Select select1=new Select(driver.findElement(By.name("slctYear")));
		select1.selectByVisibleText(year);
		String before_xpath="";
		String after_xpath="";
		final int totalWeekDays=7;
		String dayValue=null;
		boolean flag=false;
		for(int rowNum=2;rowNum<=7;rowNum++)
		{
			for(int colNum=1;colNum<=totalWeekDays;colNum++)
			{
				try 
				{
				dayValue=driver.findElement(By.xpath(before_xpath+rowNum+after_xpath+colNum+"]")).getText();
				}
				catch(NoSuchElementException e)
				{
					System.out.println("Please enter a correct Day value");
					flag= false;
					break;
				}
				System.out.println(dayValue);
				if(dayValue.equals(day))
				{
					driver.findElement(By.xpath(before_xpath+rowNum+after_xpath+colNum+"]")).click();
					flag=true;
					break;
				}
			}
			if(flag)
			{
				break;
			}
		}
	}

}
