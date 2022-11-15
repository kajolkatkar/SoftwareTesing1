package TestDemo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import CreateProject.HomePage;
import CreateProject.LoginPage;
import CreateProject.ProductPage;
import Util.UtilityClass;

public class flipkarttest1 {

	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajit\\Downloads\\chromedriver_win32\\chromedriver.exe");
				
				WebDriver driver =new ChromeDriver();
				
				Thread.sleep(2000);
				
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				
				driver.get("https://www.flipkart.com/");
				
				Thread.sleep(2000);
				
				LoginPage log=new LoginPage(driver);
			
				log.m1(UtilityClass.FetchDataFromExcell(4, 1));
				Thread.sleep(2000);
				
				
				log.m2(UtilityClass.FetchDataFromExcell(5,1));
				Thread.sleep(1000);
			
		
			log.m3();
		   Thread.sleep(1000);
			
		   HomePage page=new HomePage(driver);
		   
		   page.m1();
		   Thread.sleep(2000);
		   
		   page.m2();
		   Thread.sleep(2000);
		   
		   ProductPage products=new ProductPage(driver);
		   
		   products.m1();
		   Thread.sleep(2000);
		   
		   ArrayList <String> array=new  ArrayList <String> (driver.getWindowHandles());
		   String childid=array.get(1);
		   driver.switchTo().window(childid);
		   
		   Thread.sleep(2000);
		   
		   products.m2();
		   Thread.sleep(2000);
		   
		   products.m3();
		   Thread.sleep(2000);
		   
		   File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   
		   File destination= new File("C:\\Users\\Ajit\\Desktop\\Screenshot\\image1.jpg");
		   
		   FileHandler.copy(source, destination);
		   
		   
				
			}
			

		}

	
	
	

	
	
	
	
	
	
	
	
	
	

