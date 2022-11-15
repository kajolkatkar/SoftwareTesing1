package Assertionspack;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test1 {

	 	String expUrl="google.com";
         String actUrl1 ="google.com";
         String actUrl2 ="google.co";
	
	
	@Test
	public void TC01()  //for hard assert
	{
		System.out.println("assert1");
		Assert.assertEquals(actUrl1, expUrl);  //pass
		System.out.println("assert2");
		
		Assert.assertNotEquals(actUrl2, expUrl);
		System.out.println("assert3");          //pass
		
		Assert.assertTrue(true);  //fail //expected true 
		System.out.println("assert4");         

		Assert.assertFalse(false,"assertion failed due to");  //pass
		System.out.println("assert5"); 
		
		Assert.assertFalse(false,"assertion failed due to");  //pass
		System.out.println("assert6"); 
			
	}
	
	@Test    //for soft assert
	public void TC02()
	{
		SoftAssert s=new SoftAssert();
		
		s.assertEquals(actUrl1, expUrl);   //pass
		System.out.println("Assert1");
		
		s.assertNotEquals(actUrl2, expUrl);  //pass
		System.out.println("Assert2");
		
		s.assertEquals(actUrl2, expUrl);  //pass
		System.out.println("Assert3");

		s.assertNotEquals(actUrl1, expUrl);  //pass
		System.out.println("Assert4");
		
		s.assertTrue(false);  //fail//pass showing
		
		//s.assertFalse(false);
		
		s.assertAll();
		s.fail(); //to fail the test method
		System.out.println("last");

	}
	
}

//difference bet- both assertion are same but only soft assertion will continue with tests

