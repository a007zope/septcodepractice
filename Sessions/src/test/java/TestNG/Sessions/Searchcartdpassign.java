package TestNG.Sessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class Searchcartdpassign {

	static WebDriver driver;

	@BeforeTest
	public void setUp()
	{
		//WebDriverManager.chromedriver().setup();
//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");

	}

	@DataProvider
	public Object [][] registerData()
	{
		return new Object [][] {

			{"macbook","MacBook Pro"},
			{"samsung","Samsung Galaxy Tab 10.1"},	
			{"canon","Canon EOS 5D"}
		};

	}

	@Test(dataProvider ="registerData")
	public void searchProduct(String searchedBrandName, String actualProductName)
	{
		WebElement search =driver.findElement(By.xpath("//input[@type='text' and @name='search']"));
		WebElement searchClick =driver.findElement(By.xpath("//button[contains(@class,'btn btn-default btn-lg')]"));
		search.clear();
		search.sendKeys(searchedBrandName);
		searchClick.click();

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(actualProductName))).click();
	}

}