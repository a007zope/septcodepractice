package DynamicnStaticWebTableHandlingByNaveen;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class Crmpro {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

//		WebDriverManager.chromedriver().setup();
//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("newautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.cssSelector("input[value=Login")).click();
		Thread.sleep(5000);
		
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();
		Thread.sleep(3000);
		System.out.println(getCompanyName("Abel Kainan"));
		System.out.println(getCompanyName("Adam Lambert"));
		
	System.out.println("########################################################################");
	
		//System.out.println(getCompleteInfo("Adam Lambert"));
	
	System.out.println(getHomePhone("Abel Kainan"));
	
	System.out.println(getEmail("Abel Kainan"));

	}

	//Abel Kainan

	public static String getCompanyName(String contactName)
	{
		return driver.findElement(By.xpath("(//a[text()='"+contactName+"']//following::td)[1]")).getText();
	}
	
	public static ArrayList<String> getCompleteInfo(String contactName)
	{
		List<WebElement> ele =driver.findElements(By.xpath("(//a[text()='"+contactName+"']//following::td)"));
		
		ArrayList<String> al = new ArrayList<String>();
		for(WebElement e : ele)
		{
			al.add(e.getText());
		}	
				return al;
	}
	
	public static String getHomePhone(String contactName)
	{
		return driver.findElement(By.xpath("(//a[text()='Abel Kainan']//following::td/span[@context='phone'])[1]")).getText();
	}
	
	public static String getEmail(String contactName)
	{
		return driver.findElement(By.xpath("(//a[text()='"+contactName+"']//following::td/a)[2]")).getText();
	}






}
