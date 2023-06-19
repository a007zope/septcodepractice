package DynamicnStaticWebTableHandlingByNaveen;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class cricinfo2 {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.get("https://www.espncricinfo.com/series/australia-a-in-new-zealand-2023-1365973/new-zealand-a-vs-australia-a-1st-unofficial-test-1365976/full-scorecard");
		String wicketTakeName =  getWicketTakerName("Matt Renshaw");
		System.out.println(wicketTakeName);
		System.out.println(getWicketTakerName("Teague Wyllie"));

		System.out.println("#############################################################################");

		System.out.println(getscoreReportOfBatsman("Teague Wyllie"));
		System.out.println(getscoreReportOfBatsman("Matt Renshaw"));

	}

	public static String getWicketTakerName(String batsmanName) {

		return driver.findElement(By.xpath("(//span[text()='"+batsmanName+"']//following::td)[1]")).getText();
	}

	public static List<String> getscoreReportOfBatsman(String batsmanName)
	{
		List<String> scoreList = new ArrayList<String>();
		for(int i=2;i<=7;i++)
		{
			String text =driver.findElement(By.xpath("(//span[text()='"+batsmanName+"']//following::td)["+i+"]")).getAccessibleName();
			scoreList.add(text);		
		}
		return scoreList; 		
	}

}
