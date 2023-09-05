package TestNG.Sessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Basetest {

	static WebDriver driver;
	@Parameters({"url","browser"})
	@BeforeTest
	public void setup(String url,String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
//			WebDriverManager.chromedriver().setup();
//			ChromeOptions co = new ChromeOptions();
//			co.addArguments("--remote-allow-origins=*");
			
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\P7111642.INAIRLT541343\\Downloads\\chrome-win64\\chrome-win64\\chromedriver.exe");
			//ChromeOptions co = new ChromeOptions();
			//co.setBinary("C:\\Users\\P7111642.INAIRLT541343\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
			driver = new ChromeDriver();	
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			//WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			//WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("please enter correct browserName");
		}
		driver.get(url);
	}

	@AfterTest
	public void quit()
	{
		driver.quit();
	}
}
