package DynamicnStaticWebTableHandlingByNaveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);

		driver.get("https://classic.crmpro.com/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("username")).sendKeys("newautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.cssSelector("input[value=Login")).click();
		
		Thread.sleep(5000);
		
		driver.switchTo().frame("mainpanel");
		
		driver.findElement(By.linkText("CONTACTS")).click();
		
		
		driver.findElement(By.xpath("//a[text()='Abel Kainan']//parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
		
		System.out.println(selectUser("Chicago Bruner"));

	}
	
	public static Boolean selectUser(String name )
	{
		
		driver.findElement(By.xpath("//a[text()='"+name+"']//parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
		
		return driver.findElement(By.xpath("//a[text()='"+name+"']//parent::td/preceding-sibling::td/input[@type='checkbox']")).isSelected();
		
	}

}
