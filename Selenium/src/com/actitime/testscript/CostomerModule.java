package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;


@Listeners(com.actitime.generic.ListernerImplementation.class)

public class CostomerModule extends BaseClass{

	@Test
	public void createCustomer() throws InterruptedException
	{
		Reporter.log("CreateCustomer",true);
		Thread.sleep(4000);
		Assert.fail();
	}
	
}
