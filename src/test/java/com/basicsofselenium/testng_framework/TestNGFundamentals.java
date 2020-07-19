package com.basicsofselenium.testng_framework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGFundamentals 
{ 
	
//************************************************Execution Order Documentation********************************************************	
/*
	@BeforeSuite 	: SetUp The System Property For Chrome :----> (1)
	@BeforeTest 	: Launching The Browser :-------------------> (2)
	@BeforeClass 	: Login To The App :------------------------> (3)
	
	===========================================================
					[Execution Order For Test 2]
	===========================================================
	
	@BeforeMethode 	: Entering URL of The Application :---------> (4)
	@Test2 			: Test The Logo of Google :-----------------> (5)
	@AfterMethod	: LogOut Form The App :---------------------> (6)
	
	===========================================================
					[Execution Order For Test 3]
	===========================================================
	
	@BeforeMethode 	: Entering URL of The Application :---------> (7)
	@Test3 			: Test The SearchBox of Google :------------> (8)
	@AfterMethod	: LogOut Form The App :---------------------> (9)
	
	===========================================================
					[Execution Order For Test 1]
	===========================================================
	
	@BeforeMethode 	: Entering URL of The Application :---------> (10)
	@Test1 			: Test The Title of Google :----------------> (11)
	@AfterMethod	: LogOut Form The App :---------------------> (12)
	
	===========================================================
	
	@AfterClass 	: Closing the browser :---------------------> (13)
	@AfterTest 		: Delete All The Cookies :------------------> (14)
	
	===========================================================
*/
	

//****************************************************TestNG Methods**********************************************************************
	
	@BeforeSuite  //1
	public static void setUp()
	{
		System.out.println("@BeforeSuite : SetUp The System Property For Chrome");
	}
	
	@BeforeTest  //2
	public static void launchBrowser()
	{
		System.out.println("@BeforeTest : Launching The Browser");
	}
	
	@BeforeClass  //3
	public static void login()
	{
		System.out.println("@BeforeClass : Login To The App");
	}
	
	@BeforeMethod  //4
	public static void enterURL()
	{
	System.out.println("@BeforeMethode : Entering URL of The Application");	
	}
	
	@Test  //5
	public static void googleTitleTest()
	{
		System.out.println("@Test1 : Test The Title of Google");
	}
	
	@Test  //5
	public static void googleLogoTest()
	{
		System.out.println("@Test2 : Test The Logo of Google");
	}
	
	@Test  //5
	public static void googleSearchTest()
	{
		System.out.println("@Test3 : Test The SearchBox of Google");
	}
	
	//Post Conditions : Starting With '@After'
	
	@AfterMethod  //6
	public static void logOut()
	{
		System.out.println("@AfterMethod : LogOut Form The App");
	}
	
	@AfterClass  //7
	public static void claseBrowser()
	{
		System.out.println("@AfterClass : Closing the browser");
	}
	
	@AfterTest  //8
	public static void deleteAllCookies()
	{
		System.out.println("@AfterTest : Delete All The Cookies");
	}

	

}
