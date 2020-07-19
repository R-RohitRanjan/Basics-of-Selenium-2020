package com.basicsofselenium.testng_framework;

import org.testng.annotations.Test;

public class TestNGFeatures 
{
	@Test  //5
	public static void loginTest()
	{
		System.out.println("@Test1 : Test The Title of Google");
		//int i=9/0;
	}
	
	@Test(dependsOnMethods="loginTest")  //5
	public static void homePageTest()
	{
		System.out.println("@Test2 : Test The Logo of Google");
	}
	
	@Test(dependsOnMethods="homePageTest")  //5
	public static void SearchPageTest()
	{
		System.out.println("@Test3 : Test The SearchBox of Google");
	} 
}
