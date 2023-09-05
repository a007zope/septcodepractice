package DynamicnStaticWebTableHandlingByNaveen;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class CricInfo {

	static WebDriver driver;

	public static void main(String[] args) {

//		WebDriverManager.chromedriver().setup();
//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/australia-a-in-new-zealand-2023-1365973/new-zealand-a-vs-australia-a-1st-unofficial-test-1365976/full-scorecard");
		//		System.out.println(getWicketTakerName("Xavier Bartlett"));
		//		System.out.println(getWicketTakerName("Campbell Kellaway"));
		//		System.out.println(getWicketTakerName("Nathan McSweeney"));
		//		System.out.println(getWicketTakerName("Tim Ward"));
		//		
		ArrayList<String> scoreCard =getScoreCard("Nathan McSweeney");
		System.out.println(scoreCard);

	}

	public static String getWicketTakerName(String batsmanName)
	{
		return driver.findElement(By.xpath("(//span[text()='"+batsmanName+"']/ancestor::td/following::td)[position()=1]")).getText();
	}

	public static ArrayList<String> getScoreCard(String name)
	{

		ArrayList<String> scoreCardList = new ArrayList<String>();

		//		List<WebElement> webeleList	=driver.findElements(By.xpath("//span[text()='"+name+"']//following::td[contains(@class,'ds-w-0 ds-whitespace-nowrap ds-min-w-max ds-text-right')]"));
		//          for(WebElement e:webeleList)
		//          {
		//        	  scoreCardList.add(e.getAccessibleName());
		//          }

		for(int i =1;i<=6;i++)
		{
			String scoreno=driver.findElement(By.xpath("(//span[text()='"+name+"']//following::td[contains(@class,'ds-w-0 ds-whitespace-nowrap ds-min-w-max ds-text-right')])["+i+"]")).getAccessibleName();
			scoreCardList.add(scoreno);
		}

		return scoreCardList;
	}
}



