import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverInit {

	private static WebDriver driver ;
	private static DriverInit instanceDriver = null;
	private DriverInit()
	{

	}

	public WebDriver openBrowser()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("-remote-allow-origins=*");
		driver = new ChromeDriver(co);
		
		
		return driver;
	}


	public  static DriverInit getInstance()
	{

		if(instanceDriver==null)
			instanceDriver = new DriverInit();
		return instanceDriver;
	}
	
	









}
