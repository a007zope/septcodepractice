package SeleniumSessionsByNaveen;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricInfo {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.get("https://www.espncricinfo.com/series/australia-a-in-new-zealand-2023-1365973/new-zealand-a-vs-australia-a-1st-unofficial-test-1365976/full-scorecard");
		System.out.println(getWicketTakerName("Xavier Bartlett"));
		System.out.println(getWicketTakerName("Campbell Kellaway"));
		System.out.println(getWicketTakerName("Nathan McSweeney"));
		System.out.println(getWicketTakerName("Tim Ward"));
		
		 ArrayList<String> scoreCard =getScoreCard("Tim Ward");
		 System.out.println(scoreCard);
	
	}

	public static String getWicketTakerName(String batsmanName)
	{
		return driver.findElement(By.xpath("(//span[text()='"+batsmanName+"']/ancestor::td/following::td)[position()=1]")).getText();
	}
	
	public static ArrayList<String> getScoreCard(String name)
	{
		 
		 ArrayList<String> scoreCardList = new ArrayList<String>();
		
		for(int i =1;i<=6;i++)
		{
		List<WebElement> scoreList = driver.findElements("(//span[text()='"+name+"']/ancestor::td/following::td/following::td/following::td)[i]");
		
		    for(WebElement e: scoreList)
		    {
		    	scoreCardList.add(e.getText());
		    }
		}
		return scoreCardList;
	}
}
	


