package com.basicsofselenium.testng_framework;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest  
{
//	@Test(invocationTimeOut=2000) //we can also use timeOut=2000 instead of invocationTimeOut=2000
//	public void infinteloopTest()
//	{
//		while(true)
//		{
//			System.out.println("Hi...");
//		}
//	}
//	@Test(invocationTimeOut=2000,expectedExceptions=NumberFormatException.class) //we can also use timeOut=2000 instead of invocationTimeOut=2000
//	public void infinteloopTest()
//	{
//		while(true)
//		{
//			System.out.println("Hi...");
//		}
//	}
	
//	@Test
//	public void infinteloopTest()
//	{
//		String x="100A";
//		Integer.parseInt(x);
//	}
	@Test(expectedExceptions=NumberFormatException.class) 
	public void infinteloopTest()
	{
		String x="100A";
		Integer.parseInt(x);
	}

}
