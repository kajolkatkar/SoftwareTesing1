package CreateProject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	
	 @FindBy(xpath="//div[text()='Kajol']")
		
		private WebElement homeactionsdropdown;
		
	

  @FindBy(xpath="//input[@type='text']")
	
	private WebElement searchproduct;

	
   @FindBy(xpath="//button[@class='L0Z3Pu']")

	private WebElement searchbutton;
   
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void customizedaction1(WebDriver driver) throws InterruptedException
	{
		homeactionsdropdown.click();
		
		Actions act=new Actions( driver);
		Thread.sleep(2000);
		
		for(int i=0;i<=5;i++)
		{
			
		act.sendKeys(Keys.ARROW_UP).perform();
		
		}
		
		
	}
	
	
	public void m1()
	{
		searchproduct.sendKeys("Iphone13");
	}
	public void m2()
	{
		searchbutton.click();
	}
	
	
}
