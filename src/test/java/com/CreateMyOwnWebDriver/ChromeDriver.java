package com.CreateMyOwnWebDriver;

public class ChromeDriver implements WebDriver
{
	public ChromeDriver()
	{
		System.out.println("Launch The Chrome Browser");
		
	}

	public void get(String url) 
	{
		System.out.println("Launching The URL"+url);
		
		 
	}

	public void findElement(String locator) 
	{
		
		System.out.println("Finding The Element "+locator);
	}

	public void close() 
	{
		
		System.out.println("Clase The Browser");
	}

	public void quit() 
	{
		
		System.out.println("Quit All The Browser");
	}

}
