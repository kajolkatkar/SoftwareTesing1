package grouping;

import org.testng.annotations.Test;

public class testclass2 {

	@Test(groups="Regression1")
	public void tc01()
{
		System.out.println("testclass2 tc01");
}
	
	@Test(groups="Regression2")
	public void tc02()
{
		System.out.println("testclass2 tc02");
}	
	@Test
	public void tc03()
{
		System.out.println("testclass2 tc03");
}
	@Test
	public void tc04()
{
		System.out.println("testclass2 tc04");
}
}
