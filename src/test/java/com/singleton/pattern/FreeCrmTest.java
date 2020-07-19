package com.singleton.pattern;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FreeCrmTest 
{
	@BeforeClass
	public void setUp() 
	{
		SingletonTestBase.initialize();
	}
	
	
	@Test
	public void validateFreeCRMTitleTest()
	{
		String title = SingletonTestBase.driver.getTitle();
		System.out.println("Page Title is : "+title);
		Assert.assertEquals(title,Constants.loginTile);
	}
	@AfterClass
	public void tearDown()
	{
		SingletonTestBase.quit();
	}
	

}
