package TestNG.Sessions;

import org.testng.annotations.Test;

public class AmazonTest extends Basetest {
	
	@Test
	public void titleTest()
	{
		String title =driver.getTitle();	
		if(title.contains("Online Shopping"))
		{
          System.out.println("Test Passed");
		}		
	}
}
