package com.HashMapHandlingWithTestNG;

import java.util.HashMap;

public class TestNGData 
{
	public HashMap<String,String> getUserLoginInfo()
	{
		HashMap<String, String> userMap =new HashMap<String, String>();
		userMap.put("customer", "rohit@123");
		userMap.put("admin", "rohitranjan@123");
		return userMap;
	}

}
