package TestDemo;

import static org.testng.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BasePackage.BaseClass1;
import CreateProject.HomePage;
import CreateProject.LoginPage;
import CreateProject.ProductPage;
import Util.UtilityClass;

public class annotation extends BaseClass1{

	//WebDriver driver;
	LoginPage log;
	HomePage page;
	 ArrayList <String> array;
	 ProductPage products;
	 File source;
	 File destination;
	 UtilityClass uclass;
	 
	// @Parameters("browser")
	 
@BeforeClass
	
	public void m1() throws InterruptedException, EncryptedDocumentException, IOException
	{
	
		
   launchBrowser();
	
	/*System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajit\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	 driver =new ChromeDriver();
	
	Thread.sleep(2000);
	
	driver.manage().window().maximize();
	
	driver.get("https://www.flipkart.com/");

	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); */
	 
	System.out.println("kk");
	}
	
	@BeforeMethod
	
	public void beforeM() throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		log=new LoginPage(driver);
		
	log.m1(UtilityClass.FetchDataFromExcell(4, 1));
	Thread.sleep(2000);
	
	log.m2(UtilityClass.FetchDataFromExcell(5,1));
	Thread.sleep(1000);
	
	log.m3();
   Thread.sleep(1000);
   
   page=new HomePage(driver);
   
 
		System.out.println("kajol");
	}
	
	@Test
	
	public void m3() throws InterruptedException
	{
		page.customizedaction1(driver);
		//customized actions perform
		Thread.sleep(3000);
		 
		Assert.fail();
		
		 page.m1();
		   Thread.sleep(2000);
		   
		   page.m2();
		   Thread.sleep(2000);
		   
		   products=new ProductPage(driver);
		   
		   products.m1();
		   Thread.sleep(2000);
		   
		    array=new  ArrayList <String> (driver.getWindowHandles());
		   String childid=array.get(1);
		   
		   driver.switchTo().window(childid);
		   
		   Thread.sleep(2000);
		   
		   products.m2();
		   Thread.sleep(2000);
		   
		   products.m3();
		   Thread.sleep(2000);
		   
		   driver.navigate().back();
		   Thread.sleep(2000);
		   
		   driver.navigate().back();
		   Thread.sleep(3000);
		   
		  // driver.switchTo().window(childid);
		  // Thread.sleep(3000);
		System.out.println("katkar");	
		//Assert.fail();
	}
	
	@AfterMethod
	
	public void m5(ITestResult result) throws IOException
	{
		
	if(result.getStatus()==ITestResult.FAILURE)
	{
		uclass=new UtilityClass();
		uclass.captureScreenShot(driver);
	}
	}
	
@AfterClass
	
	public void m4() throws InterruptedException
	{
	//Thread.sleep(2000);
	//products.m4();

		System.out.println("Strong");
	}
	}

	
	
	
	
	
	
	
	

