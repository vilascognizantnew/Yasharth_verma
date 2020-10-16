package com.cts.demo;

import com.cts.demo.service.PermanentPersonService;
import com.cts.demo.service.PermanentPersonServiceImpl;

public class Utility {
	
	
	public static PermanentPersonService getPermanentPersonService()
	{
		
		return new PermanentPersonServiceImpl();
	}

}
