/*
package com.basicsofselenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTableWithExcelFile 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Ranjan\\eclipse-workspace\\SeleniumProjectSe2020\\Drivers\\chromedriver.exe"); //Set Path of Driver
		WebDriver driver=new ChromeDriver(); //Launch Chrome
		driver.manage().window().maximize(); //Maximizing
		driver.manage().deleteAllCookies(); //Deleting the cookies
		driver.get("https://www.w3schools.com/html/html_tables.asp"); //Enter URL
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//xpath for company name
		
				//*[@id='customers']/tbody/tr[2]/td[1]
				//*[@id='customers']/tbody/tr[3]/td[1]
				//*[@id='customers']/tbody/tr[4]/td[1]
				//*[@id='customers']/tbody/tr[5]/td[1]
				//*[@id='customers']/tbody/tr[6]/td[1]
				//*[@id='customers']/tbody/tr[7]/td[1]
		
		//xpath for contact

				//*[@id='customers']/tbody/tr[2]/td[2]
				//*[@id='customers']/tbody/tr[3]/td[2]
				//*[@id='customers']/tbody/tr[4]/td[2]
				//*[@id='customers']/tbody/tr[5]/td[2]
				//*[@id='customers']/tbody/tr[6]/td[2]
				//*[@id='customers']/tbody/tr[7]/td[2]
		
		//xpath for contact

				//*[@id='customers']/tbody/tr[2]/td[3]
				//*[@id='customers']/tbody/tr[3]/td[3]
				//*[@id='customers']/tbody/tr[4]/td[3]
				//*[@id='customers']/tbody/tr[5]/td[3]
				//*[@id='customers']/tbody/tr[6]/td[3]
				//*[@id='customers']/tbody/tr[7]/td[3]
		

		

		String beforeXpath_company="//*[@id='customers']/tbody/tr[";
		String afterXpath_company="]/td[1]";
		
		String beforeXpath_contact="//*[@id='customers']/tbody/tr[";
		String afterXpath_contact="]/td[2]";
		
		
		String beforeXpath_country="//*[@id='customers']/tbody/tr[";
		String afterXpath_country="]/td[3]";
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println("Total number of ROWS = "+rows.size());
		int rowCount = rows.size();
		
		
		Xls_Reader reader = new Xls_Reader("C:\\Users\\Rohit Ranjan\\eclipse-workspace\\rohit.selenium\\src\\test\\java\\3school.xlsx");
		reader.addSheet("TableData");
		
		if(!reader.isSheetExist("TableData"))
		{
			reader.setCellData("TableData","CompanyName");
			reader.addColumn("TableData","ContactName");
			reader.addColumn("TableData","CountryName");
			
		}
		
		for(int i=2;i<=rowCount;i++)
		{
			String actualXpath_company= beforeXpath_company+i+afterXpath_company;
			String companyName=driver.findElement(By.xpath(actualXpath_company)).getText();
			System.out.println(companyName);
	
			reader.setCellData("TableData","CompanyName",i,companyName);
			
			String actualXpath_contact= beforeXpath_contact+i+afterXpath_contact;
			String contactName=driver.findElement(By.xpath(actualXpath_contact)).getText();
			System.out.println(contactName);
		
			reader.setCellData("TableData","ContactName",i,contactName);
		
			String actualXpath_country= beforeXpath_country+i+afterXpath_country;
			String countryName=driver.findElement(By.xpath(actualXpath_country)).getText();
			System.out.println(countryName);
			
			reader.setCellData("TableData","CountryName",i,countryName);
			
	
		}
		
		

	}

}
*/
