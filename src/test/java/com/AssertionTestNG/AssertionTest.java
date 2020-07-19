package com.AssertionTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTest 
{
	
	SoftAssert softAssert = new SoftAssert(); //Global Level softAssertion declaration:
	@Test
	public void test1()
	{
		SoftAssert softAssert1 = new SoftAssert();
		System.out.println("Open Browser");
		Assert.assertEquals(true, false); //Hard Assertion: If it is failed, then next line will automatically failed
		
		
		System.out.println("Enter User Name");
		System.out.println("Enter Password");
		System.out.println("Click On Sign BUtton");
		Assert.assertEquals(true, false); //Hard Assertion:Right Place to put Hard Assertion
		
		System.out.println("Validate Home Page");
		//Assert.assertEquals(true, false); //Hard Assertion: Not the Right Place to put Hard Assertion.For proper execution we have to put softAssertion
		softAssert1.assertEquals(true, false); 
		
		System.out.println("Got To Ddeals Page");
		System.out.println("Create a Deal");
		softAssert1.assertEquals(true, false);//softAssert:It will execute all the test case even though the test cases are failed i.e It will treat all the test cases as Passed
		
		System.out.println("Got To Cantact Page");
		System.out.println("Create a Contact");
		softAssert1.assertEquals(true, false);//softAssert
		
		softAssert1.assertAll();//As softAssert pass all the test cases which failed, so to over come this problem we have to use assertAll() to get all the failed Test cases
	}
	
	@Test
	public void test2()
	{
		SoftAssert softAssert2 = new SoftAssert();
		System.out.println("Log Out");
		softAssert2.assertEquals(true, false);
		softAssert2.assertAll();
		
	}
	

}
