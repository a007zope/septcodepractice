package RelativeLocatorsByNaveen;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorsConcept {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
//		driver.get("https://www.aqi.in/dashboard/canada");	
//		Thread.sleep(2000);
//		WebElement ele = driver.findElement(By.linkText("St Thomas, Canada"));
//		
//		String rightele =driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
//		System.out.println(rightele);
//
//		String leftele =driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
//		System.out.println(leftele);
//		
//		String aboveele = driver.findElement(with(By.tagName("p")).above(ele)).getText();
//		System.out.println(aboveele);
//		
//		String belowele = driver.findElement(with(By.tagName("p")).below(ele)).getText();
//		System.out.println(belowele);
//		
//		String nearbyle = driver.findElement(with(By.tagName("a")).near(ele)).getText();
//		System.out.println(nearbyle);
//		
		driver.get("https://www.espncricinfo.com/series/australia-a-in-new-zealand-2023-1365973/new-zealand-a-vs-australia-a-1st-unofficial-test-1365976/full-scorecard");
		
		WebElement ele =driver.findElement(By.xpath("//span[text()='Teague Wyllie']"));
		
		String belowEletext =driver.findElement(with(By.tagName("td")).below(ele)).getText();
		System.out.println(belowEletext);
		
		String rightEleText =driver.findElement(with(By.tagName("td")).toRightOf(ele)).getText();
		System.out.println(rightEleText);
		
		String nearText =driver.findElement(with(By.tagName("td")).near(ele)).getText();
		System.out.println(nearText);
		

		String aboveeletext =driver.findElement(with(By.tagName("td")).above(ele)).getText();
		System.out.println(aboveeletext);
		
		
		WebElement ele1 =driver.findElement(By.xpath("//td[text()='c †Fletcher b Bracewell']"));
		
		String lefteletest =driver.findElement(with(By.tagName("a")).toLeftOf(ele1)).getText();
		System.out.println(lefteletest);
		
		
		
		
		 


	}

}
