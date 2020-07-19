package com.PDFreader.TestNG;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PDFReaderTest 
{
	@Test
	public void readerPDFTest() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rohit Ranjan\\eclipse-workspace\\SeleniumProjectSe2020\\Drivers\\chromedriver.exe"); //Set Path of Driver
		WebDriver driver=new ChromeDriver(); //Launch Chrome
		driver.manage().window().maximize(); //Maximizing
		System.out.println("Chrome Browser Lauching");
		//driver.get("http://www.africau.edu/images/default/sample.pdf"); //URL form WebSite
		
		driver.get("file:///C:/Users/Rohit%20Ranjan/Downloads/sample.pdf");//URL form Computer location
		
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		URL url = new URL(currentURL);
		
		//URL url = new URL("file:///C:/Users/Rohit%20Ranjan/Downloads/sample.pdf");
		
		
		InputStream is = url.openStream();
		BufferedInputStream fileParse = new BufferedInputStream(is);
		PDDocument document = null;
		
		document = PDDocument.load(fileParse);
		String pdfContent = new PDFTextStripper().getText(document);
		System.out.println(pdfContent);
		
		Assert.assertTrue(pdfContent.contains("A Simple PDF File"));
		Assert.assertTrue(pdfContent.contains("And more text. And more text. "));
		Assert.assertTrue(pdfContent.contains("Simple PDF File 2"));
		Assert.assertTrue(pdfContent.contains("...continued from page 1."));
		Assert.assertTrue(pdfContent.contains("The end, and just as well."));
	}

}
