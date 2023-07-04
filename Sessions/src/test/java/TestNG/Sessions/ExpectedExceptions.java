package TestNG.Sessions;

import org.testng.annotations.Test;

public class ExpectedExceptions {
		
	@Test(expectedExceptions = ArithmeticException.class)
	public void loginTest()
	{
		System.out.println("login test");
		int i =9/0;	
	}

}
