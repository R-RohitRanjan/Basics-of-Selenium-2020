//package com.basicsofselenium.testng_framework;
//
//import java.io.File;
//import java.util.UUID;
//import java.util.HashMap;
//import java.util.Map;
//
//import org.apache.commons.math3.random.ISAACRandom;
//import org.apache.tools.ant.taskdefs.condition.Not;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxProfile;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//
//public class DownloadFileWithTestNG 
//{
//	WebDriver driver;
//	File folder;
//	
//	@BeforeMethod
//	public void setUp()
//	{
//		//UUID:88884-99879-24325-85489-98988
//		folder = new File(UUID.randomUUID().toString());
//		folder.mkdir();
//		
//		
//		//Firefox
//		FirefoxProfile profile = new FirefoxProfile();
//		profile.setPreference("browser.download.dir", folder.getAbsolutePath());
//		profile.setPreference("browser.download.folderList", 2);
//		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "image/jpeg,application/pdf,application/octet-stream");
//		profile.setPreference("pdfjs.disabled", true);
//		
//		driver=new FirefoxDriver(profile);
//		
//		//Chrome:
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Ranjan\\eclipse-workspace\\SeleniumProjectSe2020\\Drivers\\chromedriver.exe");
//		ChromeOptions options = new ChromeOptions();
//		
//		Map<String, Object> prefs = new HashMap<String, Object>();
//		prefs.put("profile.default_content_settings.popups", 0);
//		prefs.put("download.default_directory", folder.getAbsolutePath());
//		
//		options.setExperimentalOption("prefs", prefs);
//		DesiredCapabilities cap =DesiredCapabilities.chrome();
//		cap.setCapability(ChromeOptions.CAPABILITY, options);
//		
//		
//		driver = new ChromeDriver(cap);
//	}
//	
//	@Test
//	public void downloadFileTest() throws InterruptedException
//	{
//		driver.get("http://the-internet.herokuapp.com/download");
//		driver.findElement(By.linkText("some-file.txt")).click();
//		
//		Thread.sleep(2000);
//		File listOfFiles[] = folder.listFiles();
//		//make sure directory is not empty
//		
//		//Assert.assertEquals(listOfFiles.length(), is(not(0)));
//		Assert.assertTrue(listOfFiles.length>0);
//		
//		for(File file:listOfFiles)
//		{
//			//Assert.assertEquals(file.length(),is(not((long)0)));
//			Assert.assertTrue(file.length()>0);
//		}
//	}
//	
//	@AfterMethod
//	public void tearDown()
//	{
//		driver.quit();
//		for(File file:folder.listFiles())
//		{
//			file.delete();
//		}
//		folder.delete();
//	}
//
//}
