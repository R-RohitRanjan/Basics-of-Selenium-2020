package com.TestNGRetryLogic;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer
{
	int countter = 0;
	int retryLimit = 3;

	public boolean retry(ITestResult result) 
	{

		if(countter <retryLimit)
		{
			countter++;
			return true;
		}
		return false;
	}
	

}
