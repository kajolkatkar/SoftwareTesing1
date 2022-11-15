package CreateProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

@FindBy(xpath="//div[text()='APPLE iPhone 13 (Pink, 128 GB)']")
	
	private WebElement searchproduct;
	
    @FindBy(xpath="//button[text()='ADD TO CART']")
	
	private WebElement cartproduct;
    
    @FindBy(xpath="//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")
    
	private WebElement placeproduct;
    
   // @FindBy (xpath="//div[text()='Kajol']")
    
  // private WebElement logout;
    
    
    public ProductPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void m1()
    {
    	searchproduct.click();
    	
    }
    public void m2()
    {
    	cartproduct.click();
    	
    }
    
    public void m3()
    {
    	placeproduct.click();
    
	
    }
    
 // public void m4()
 // {
	 //  logout.click();
 // }
		
}
