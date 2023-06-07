import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assist {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://assisttst1.pearsonvue.com/Assist/#/authenticate");
		Thread.sleep(3);
		driver.findElement(By.id("username")).sendKeys("vzopead");
		driver.findElement(By.id("password")).sendKeys("Ironman@123");
		driver.findElement(By.id("primaryBtnLogin")).click();
		Thread.sleep(10);
		driver.findElement(By.xpath("//vue-navigation-menu-item/span[text()='Correspondence']")).click();
		
		
		

	}

}
