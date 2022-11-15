package BasePackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;

import Util.UtilityClass;



public class BaseClass1 {

	
	public static WebDriver driver;
	
  public static void launchBrowser() throws InterruptedException, EncryptedDocumentException, IOException
{
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajit\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		 driver =new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	  
		
	  //Chrome chrome CHROME in case we use equalsignorecase
	  
	/* if (browser.equalsIgnoreCase("Chrome"))
	  {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajit\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	 driver =new ChromeDriver();
	
	 driver.get(UtilityClass.FetchDataFromExcell(4, 1));
	 
	  }
	 
	  else if(browser.equalsIgnoreCase("Firefox"))
	  {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajit\\Downloads\\chromedriver_win32\\FirefoxDriver.exe");
			
			 driver =new FirefoxDriver();
			 
			 driver.get(UtilityClass.FetchDataFromExcell(4, 1));
			 
	  }
	 /* else if(browser.equalsIgnoreCase("IE"))
	  {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajit\\Downloads\\chromedriver_win32\\IE.exe");
			
			 driver =new InternetExplorerDriver();  */
			   

	  
	/*Thread.sleep(2000);
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	driver.get("https://www.flipkart.com/");
	
	Thread.sleep(2000);  */
	
}	
}
