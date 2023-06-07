import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PageTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{     
			DriverInit instance =DriverInit.getInstance();
		driver =instance.openBrowser();
	}
	
	@Test
	public void test() {
		
		driver.get("https://www.google.co.in");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
