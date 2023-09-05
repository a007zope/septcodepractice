package RelativeLocatorsByNaveen;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class StaleElementReferenceConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
//
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions co = new ChromeOptions();
//
//		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();

		JavascriptExecutor js = (JavascriptExecutor)driver;

		List<WebElement> eleList =driver.findElements(By.xpath("//span[@class='sc-b323b31-0 ieRFkx']"));
		System.out.println(eleList.size());
		for(int e =0;e<eleList.size();e++)
		{
			System.out.println(eleList.get(e).getText());
			js.executeScript("arguments[0].click();",eleList.get(e));

			Thread.sleep(2000);

			eleList =driver.findElements(By.xpath("//span[@class='sc-b323b31-0 jXxwrI']"));
			System.out.println(eleList.size());
		}
	}

}
