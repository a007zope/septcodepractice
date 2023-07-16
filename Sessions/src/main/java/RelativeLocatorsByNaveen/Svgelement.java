package RelativeLocatorsByNaveen;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Svgelement {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		Thread.sleep(3000);

		driver.get("https://petdiseasealerts.org/forecast-map/");

		Thread.sleep(4000);

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));

		String svgxpath ="//*[local-name()='svg' and @id='map-svg']//*[name()='g']//*[@id='regions']//*[name()='g']//*[name()='path']";

		List<WebElement> stateslist =	driver.findElements(By.xpath(svgxpath));

		System.out.println(stateslist.size());
		
		
	ArrayList<String> regionnameList = new ArrayList<>();
	System.out.println(regionnameList);

		for(WebElement e : stateslist)
		{
			String statesName =e.getAttribute("name");

			if(statesName.equals("Kansas"))
			{
				e.click();
				//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));

				Thread.sleep(4000);

				String svgregion ="//*[local-name()='svg' and @id='map-svg']//*[name()='g']//*[name()='g' and @id='regions']//*[name()='g']";

				List<WebElement> regionList =driver.findElements(By.xpath(svgregion));
				System.out.println(regionList.size());
				for(WebElement r : regionList)
				{
					String regionname =r.getAttribute("id");
					
					regionnameList.add(regionname);
					
				}

			}

		}
		
		System.out.println(regionnameList);










	}

}
