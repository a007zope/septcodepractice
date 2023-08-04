package SeleniumSessionsByNaveen;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingOptions {

	public static void main(String[] args) {

		//1 Browser specific --Cannot be used for cross browser
		ChromeDriver driver = new ChromeDriver();
		FirefoxDriver driver1 = new FirefoxDriver();

		// 2 WD = new CD(); - valid Top casting- recommended
		WebDriver driver2 = new ChromeDriver();

		//3 SC = new CD();- valid but not recommended as we cannot use get methods i e not all methods are accessible
		SearchContext sc = new ChromeDriver();
		
		//4 RWD = new CD();-valid Top casting as we are able to access all the methods
		RemoteWebDriver driver3 = new ChromeDriver();
		
		//5 WD = new RWD();-valid top casting - recommended-- GRID- used for remote execution
		/*
		 * If we want to run the testcases on some remote server or on AWS then we use this top casting
		 */
		WebDriver driver4 = new RemoteWebDriver(remoteAddress, Capabilities);
		
		//6 SC = new RWD();valid but not recommended as not all methods are accessible
		SearchContext driver5 = new RemoteWebDriver(remoteAddress, Capabilities);
		
		





	}

}
