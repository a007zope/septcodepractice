import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class FacebookReg {
	
	
	public static void main(String[] args) {
		
//		WebDriverManager.chromedriver().setup();		
//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver();
	
//		//driver.get("https://www.facebook.com/reg");
//		
//		WebElement firstname = driver.findElement(By.name("firstname"));
//		
//		Actions a = new Actions(driver);
//		a.sendKeys(firstname,"aditya").build().perform();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
	 int sizeCount =  driver.findElements(By.xpath("//*[@class='form-control']")).size();
	 System.out.println(sizeCount);
	  
	 
		
	}

}
