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


public class BrokenLinks {

	private static WebDriver driver;

	public static void main(String[] args) {

//		WebDriverManager.chromedriver().setup();
//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--remote-allow-origins=*");
		String homepage ="https://www.zlti.com/";

		String url ="";
		HttpURLConnection huc = null;

		int respCode = 200;

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(homepage);

		List<WebElement> links=driver.findElements(By.tagName("a"));

		Iterator<WebElement> it = links.iterator();

		while(it.hasNext())
		{
			url = it.next().getAttribute("href");
			System.out.println(url);

			if(url==null || url.isEmpty())
			{
				System.out.println("URL is either not configured for anchor tag or it is empty");
				continue;
			}
			if(!url.startsWith(homepage))
			{
				System.out.println("URL belongs to another domain, skipping it.");
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
					System.out.println(url +"is a broken link");
				}

				else
				{
					System.out.println(url+ "is a valid link");
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


//			driver.quit();
		}

	}

}
