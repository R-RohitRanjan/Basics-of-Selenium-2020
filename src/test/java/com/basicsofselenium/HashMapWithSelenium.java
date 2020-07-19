package com.basicsofselenium;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HashMapWithSelenium 
{
	
	//Role based---permission based use case
	//category manager user--got to the app---add all the products
	//customer user--go to the app--buy a product--place an order
	//admin user--go to the app--can see all the orders
	//seller user --- go to the app---see only those order which are relevant
	//distributer user user--go to the app--can see respective order
	//delivery boy user ---go to the app--can see the order and deliver
	//customer care user---go to the app

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Ranjan\\eclipse-workspace\\SeleniumProjectSe2020\\Drivers\\chromedriver.exe"); //Set Path of Driver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		
		driver.get("https://classic.crmpro.com/");
		
		System.out.println(getCredentialsMap());
		System.out.println(getCredentialsMap().get("admin"));
		
		String credentialsCustomer = getCredentialsMap().get("customer");
//		driver.findElement(By.name("username")).sendKeys(credentialsCustomer.split(":")[0]);
//		driver.findElement(By.name("password")).sendKeys(credentialsCustomer.split(":")[1]);
		
		driver.findElement(By.name("username")).sendKeys(getUserName("customer"));
		driver.findElement(By.name("password")).sendKeys(getUserPassword("customer"));
		Thread.sleep(2000);
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("password")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys(getUserName("admin"));
		driver.findElement(By.name("password")).sendKeys(getUserPassword("admin"));
		Thread.sleep(2000);
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("password")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys(getUserName("distributor"));
		driver.findElement(By.name("password")).sendKeys(getUserPassword("distributor"));
		Thread.sleep(2000);
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("password")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys(getUserName("seller"));
		driver.findElement(By.name("password")).sendKeys(getUserPassword("seller"));
		Thread.sleep(2000);
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("password")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys(getUserName("deliveryboy"));
		driver.findElement(By.name("password")).sendKeys(getUserPassword("deliveryboy"));
		Thread.sleep(2000);
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("password")).clear();
		Thread.sleep(2000);



	}
	
	public static HashMap<String, String> getCredentialsMap()
	{
		HashMap<String, String> userMap = new HashMap<String, String>();
		userMap.put("customer", "rohitranjan:rohit@123");
		userMap.put("admin", "nagma:ng@123");
		userMap.put("distributor", "niranjan:nirt@123");
		userMap.put("seller", "mukesh:mukesh@123");
		userMap.put("deliveryboy", "saket:saket@123");
		
		
		return userMap;
	}
	
	public static String getUserName(String role)
	{
		String credentials = getCredentialsMap().get(role);
		return credentials.split(":")[0];
	}
	
	public static String getUserPassword(String role)
	{
		String credentials = getCredentialsMap().get(role);
		return credentials.split(":")[1];
	}

}
 