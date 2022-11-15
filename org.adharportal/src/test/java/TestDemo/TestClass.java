package TestDemo;

import org.testng.annotations.Test;

public class TestClass {

	@Test(priority =-2)
	public void testcaseA()
	{
		System.out.println("testcase1");
	}
	
	@Test(invocationCount =2)
	public void testcaseB()
	{
		System.out.println("testcase2");
	}
	
	@Test(priority=1,timeOut=2000)
	public void testcasec()
	{
		System.out.println("testcase3");
	}
	
	@Test(priority =2)
	public void testcased()
	{
		System.out.println("testcase4");
	}

}
