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

public class brokenlinktest3 {
	
	public static void main(String[] args) {
		
		String homePage ="https://www.zlti.com/";
		String url ="";
		int respCode = 200;
		HttpURLConnection huc = null;	
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(co);	
		driver.get(homePage);
		
		List<WebElement> eleList =driver.findElements(By.tagName("a"));
		
		 Iterator<WebElement> it =  eleList.iterator();
		 
		 while(it.hasNext())
		 {
			 
			  url = it.next().getAttribute("href");
			  
			  if(url==null || url.isEmpty())
			  {
				  System.out.println("url is not configured");
				  continue;
			  }
			  
			  if(!url.startsWith(homePage))
			  {
				  System.out.println("url belongs to thrid party domain");
				  continue;
			  }
		try
		{
			
			huc = (HttpURLConnection)(new URL(url)).openConnection();	
			huc.setRequestMethod("HEAD");
			huc.connect();
			respCode =huc.getResponseCode();
			
			if(respCode>=400)
			{
				System.out.println(url +"is a broken link");
			}
			
			else
			{
				System.out.println(url +"is a valid link");
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
