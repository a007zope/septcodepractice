package RelativeLocatorsByNaveen;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;



public class Flipkartsvg {

	static WebDriver driver;

	@BeforeMethod
	public  void setUp() throws InterruptedException {

		

		//ChromeOptions co = new ChromeOptions();

		//co.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");	
		driver.manage().deleteAllCookies();
		
		Thread.sleep(3000);
	}

	@Test(invocationCount =5)
	public static  void searchItem() throws InterruptedException
	{
      try
		{
			if((driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).isEnabled()))
			{

				driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			}
		}

		catch(NoSuchElementException e)
		{
			e.printStackTrace();
		}
		
		WebElement searchText = driver.findElement(By.xpath("//input[@type='text' and  contains(@title,'Search for products, brands and more')]"));
		searchText.sendKeys("mobile");
		WebElement searchIcon =	driver.findElement(By.xpath("//*[local-name()='svg']"));
		searchIcon.click();
		Thread.sleep(2000);
		searchText.clear();
		Thread.sleep(2000);

		searchText.sendKeys("pendrive");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@type='submit']//*[local-name()='svg']")).click();

		System.out.println("Test Passed");

	}

	@AfterMethod
	public void quitBrowser()
	{
		driver.quit();
	}
}
