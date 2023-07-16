package TestNG.Sessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Opencart extends Basetest {
		
	@Test
	public void titleTest()
	{
		String title =driver.getTitle();	
		Assert.assertEquals(title,"Your Store");		
	}

}
