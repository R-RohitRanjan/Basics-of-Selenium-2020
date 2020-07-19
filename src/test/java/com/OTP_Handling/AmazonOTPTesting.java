/*
package com.OTP_Handling;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.twilio.Twilio;
import com.twilio.base.ResourceSet;
import com.twilio.rest.api.v2010.account.Message;




public class AmazonOTPTesting 
{
	public static final String ACCOUNT_SID = "AC790f738dfbbf49d216d3415f7c662b10";
	public static final String AUTH_TOKEN	= "f24b4497c7f59e72a99d9a417532ea18";
			
	

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Ranjan\\eclipse-workspace\\SeleniumProjectSe2020\\Drivers\\chromedriver.exe"); //Set Path of Driver
		WebDriver driver=new ChromeDriver(); //Launch Chrome
		driver.manage().window().maximize(); //Maximizing
		driver.manage().deleteAllCookies(); //Deleting the cookies
		driver.get("https://www.amazon.in/"); //Enter URL
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
				
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Start here.")).click();
				
		driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("ROHIT RANJAN");
				
		driver.findElement(By.xpath("//span[@id='auth-country-picker-container']")).click();
		driver.findElement(By.xpath("//a[@id='auth-country-picker_212']")).click();
				
		driver.findElement(By.xpath("//input[@id='ap_phone_number']")).sendKeys("2054486540");
				
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("rohitranjan@gmail.com");
				
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Rohit@5513");
				
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		String smsBody = getMessage();
		System.out.println(smsBody);
		String OTPNumber = smsBody.replaceAll("[^-?0-9]+", " ");
		System.out.println(OTPNumber);
		driver.findElement(By.id("auth-pv-enter-code")).sendKeys("OTPNumber");
		
				
	}
	public static String getMessage()
	{
		return getMessages().filter(m -> m.getDirection().compareTo(Message.Direction.INBOUND)==0)
				.filter(m -> m.getTo().equals("+12054486540")).map(Message::getBody).findFirst()
				.orElseThrow(IllegalStateException::new);
		
	}
	private static Stream<Message> getMessages()
	{
		ResourceSet<Message> messages = Message.reader(ACCOUNT_SID).read();
		return StreamSupport.stream(messages.spliterator(), false);
	}

}
*/
