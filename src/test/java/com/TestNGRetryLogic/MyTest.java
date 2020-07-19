package com.TestNGRetryLogic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest 
{
	//1.@Test Level
	//@Test(retryAnalyzer = RetryAnalyser.class) //-->Method 1:The argument "retryAnalyzer = RetryAnalyser.class" we have to write for every @Test case so complexity of the program will be increase hence it is not recommended to use method1
	
	
	//2. Run Time:Best Approach
	@Test //Method 2 : Without argument--->Recommended to use
	public void Test1()
	{
		Assert.assertEquals(false, true);
	}
	
	//1.@Test Level
	//@Test(retryAnalyzer = RetryAnalyser.class)
	
	//2. Run Time:Best Approach
	@Test
	public void Test2()
	{
		Assert.assertEquals(false, true);
	}
	
	//2. Run Time:Best Approach
	@Test
	public void Test3()
	{
		Assert.assertEquals(false, true);
	}
	
	//2. Run Time:Best Approach
	@Test
	public void Test4()
	{
		Assert.assertEquals(false, true);
	}
	
	//2. Run Time:Best Approach
	@Test
	public void Test5()
	{
		Assert.assertEquals(false, true);
	}


}
