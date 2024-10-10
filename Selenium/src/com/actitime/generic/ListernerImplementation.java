package com.actitime.generic;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class ListernerImplementation extends BaseClass implements ITestListener {
	
	@Override
	public void onTestStart(ITestResult result) {
		
	}
	
	@Override
    public void onTestSuccess(ITestResult result) {
		
	}
	
	@Override
    public void onTestFailure(ITestResult result) {
		//String name =result.getName();
		TakesScreenshot T= (TakesScreenshot) driver;
		File src=T.getScreenshotAs(OutputType.FILE);
		 File dst=new File("./screenshot/ss.png");
		 try {
		 FileUtils.copyFile(src, dst);}
		 catch (Exception e) {
			 driver.quit();
		}
		 
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		
	}
	
	@Override
	 public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	  }
	
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	  }
	
	@Override
	public  void onStart(ITestContext context) {
	  }
	 
	@Override
	public void onFinish(ITestContext context) {
	  }
}
