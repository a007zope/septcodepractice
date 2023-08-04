package SeleniumSessionsByNaveen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class SessionSelenium1 {

	public static void main(String[] args) {

		WebDriver driver = null;

		String browserName = "chrome";

		switch(browserName)
		{ 
		case "chrome":
			driver = new ChromeDriver();
			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;

		default:
			System.out.println("please enter correct browser name");		 
		}

		driver.get("https://www.amazon.com/");
		String title =	 driver.getTitle();
		if(title.contains("Amazon.com"))
		{
			System.out.println("Test passed");
			Assert.assertEquals(title,"Amazon.com. Spend less. Smile more.");
		}

	}
}
