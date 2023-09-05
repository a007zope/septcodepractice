package SeleniumSessionsByNaveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {


	public static void main(String[] args) throws InterruptedException {
		
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");

		Thread.sleep(3000);

		String header =driver.findElement(By.tagName("h2")).getText();

		System.out.println(header);










	}

}
