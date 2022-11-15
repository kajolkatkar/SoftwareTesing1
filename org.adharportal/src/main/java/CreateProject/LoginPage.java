package CreateProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
		@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
		
		private WebElement entermobno;
		
	   @FindBy(xpath="//input[@type='password']")
		
		 private WebElement enterpass;
		
	   @FindBy(xpath="(//span[text()='Login'])[2]")
		
	 	private WebElement enterbutton;
	   
	 	
	   public LoginPage(WebDriver driver) {
		   
		   PageFactory.initElements(driver, this);
	   }
	   
	   public void m1(String UN)
	   {
		   entermobno.sendKeys(UN);
	   }
	             
	   public void m2(String Pw)
	   {
		   enterpass.sendKeys(Pw);
	   }
		
	  public void m3()
	  {
		  enterbutton.click(); 
	  }
		
}

	
	
	
	
	
	
	
	
	
	
	

