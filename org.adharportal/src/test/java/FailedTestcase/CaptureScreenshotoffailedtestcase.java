package FailedTestcase;

import static org.testng.Assert.fail;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import BasePackage.BaseClass1;
import Util.UtilityClass;


public class CaptureScreenshotoffailedtestcase extends BaseClass1  {

	WebDriver driver;
	UtilityClass uclass;
	File source;
	File destination;
	
	@Test
	public void TC01()
	{
		System.out.println("test case1");
	}
	
	@Test
	public void TC02()
	{
		System.out.println("test case2");
	
	}
	@Test
	public void TC03()
	{
		//Assert.fail();
		System.out.println("test case3");
	
	}
	@Test
	public void TC04()
	{
		System.out.println("test case4");
	}
	
	@AfterMethod
 public void aftermethod(ITestResult result) throws IOException
	{
		System.out.println(result.getStatus());
		
	if(result.getStatus()==ITestResult.FAILURE)
	{
		uclass=new UtilityClass();
		uclass.captureScreenShot(driver); 
		
	}     
		
	System.out.println("after method");
	
	}
}
