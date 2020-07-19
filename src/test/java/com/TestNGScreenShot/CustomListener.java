package com.TestNGScreenShot;

import org.testng.ITestListener;
import org.testng.ITestResult;



public class CustomListener extends ScreenShotBase implements ITestListener
{
	
	public void onTestFailure(ITestResult result)
	{
	    System.out.println("Test case got failed");
	    failed(result.getMethod().getMethodName());
	}
}
