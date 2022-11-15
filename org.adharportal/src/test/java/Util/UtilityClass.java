package Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import BasePackage.BaseClass1;

public class UtilityClass extends BaseClass1 {

	
	//screenshot
	//Excelsheet
	//.properties
	
	
	
	public static void captureScreenShot(WebDriver driver) throws IOException
	{
		 File src= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);// Screenshot capture
		
		String filename =  new SimpleDateFormat("yyyy-MM-dd-hh.mm.ss").format(new Date());
			
			File dest=new File("C:\\Users\\Ajit\\Desktop\\Screenshot\\"+filename+".jpg");
		     
	       FileHandler.copy(src, dest);
	} 
	
	public static String FetchDataFromExcell(int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Ajit\\Desktop\\Book1.xlsx");
		
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
		
	String  s1=sh.getRow(row).getCell(cell).getStringCellValue();
		
		return s1;
		
	}
	
	
		
}
