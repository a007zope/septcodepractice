package RelativeLocatorsByNaveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextForTextField {

	
	public static void main(String[] args) {
		
		
	WebDriverManager.chromedriver().setup();
		
		ChromeOptions co = new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");	
		
		WebElement firstname =driver.findElement(By.id("input-firstname"));
		
		firstname.sendKeys("Aditya");
		String name =firstname.getAttribute("value");
		System.out.println(name);
		
		
		/*
		 * to get the placholder value use the getAttribute method for getting the placeholder value
		 */
		System.out.println(driver.findElement(By.id("input-lastname")).getAttribute("placeholder"));
		
		
	}
}
