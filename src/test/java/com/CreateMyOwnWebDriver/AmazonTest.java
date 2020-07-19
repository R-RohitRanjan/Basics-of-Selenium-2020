package com.CreateMyOwnWebDriver;

public class AmazonTest 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("www.amazon.com");
		driver.findElement("name");
		driver.close();
		driver.quit();

	}

} 
