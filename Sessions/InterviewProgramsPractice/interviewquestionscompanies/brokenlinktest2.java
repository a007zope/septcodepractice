package interviewquestionscompanies;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class brokenlinktest2 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);

		String url ="";
		HttpURLConnection huc  =null;
		int respCode =200;
		String home ="https://www.zlti.com/";
		driver.get(home);
		List<WebElement> webList =driver.findElements(By.tagName("a"));

		Iterator<WebElement> it =webList.iterator();
		while(it.hasNext())
		{
			url =it.next().getAttribute("href");
			System.out.println(url);

			if(url==null ||url.isEmpty())
			{
				System.out.println(url+"url is not configured");
				continue;
			}

			if(!url.startsWith(home))
			{
				System.out.println(url+"url belongs to third party domain");
				continue;
			}
			try
			{
				huc = (HttpURLConnection)(new URL(url).openConnection());
				huc.setRequestMethod("HEAD");
				huc.connect();
				respCode = huc.getResponseCode();
				if(respCode >=400)
				{
					System.out.println("url is broken");
				}
				else
				{
					System.out.println("url is valid");
				}
			}
			catch(MalformedURLException e)
			{
				e.printStackTrace();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}

		}


	}

}
