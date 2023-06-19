package DynamicnStaticWebTableHandlingByNaveen;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webschool {

	static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		System.out.println(getHeaderCount());
		System.out.println(getTotalRowCount());

		System.out.println(getCompanyColumnValue());

		System.out.println(getContactValues());

		System.out.println(getCountryValues());

	}

	public static int getHeaderCount()
	{
		return driver.findElements(By.xpath("//table[@id='customers']/tbody//th")).size();
	}

	public static int getTotalRowCount()
	{
		return driver.findElements(By.xpath("//table[@id='customers']/tbody//tr")).size()-1;
	}


	public static List<String> getCompanyColumnValue() {

		List<String> textlist = new ArrayList<>();

		for(int i =2;i<=7;i++)
		{
			String text =driver.findElement(By.xpath("//*[@id='customers']/tbody/tr["+i+"]/td[1]")).getText();
			textlist.add(text);
		}

		return textlist;
	}

	public static List<String> getContactValues()
	{
		List<String> textlist = new ArrayList<>();

		for(int i =2;i<=7;i++)
		{
			String text =driver.findElement(By.xpath("//*[@id='customers']/tbody/tr["+i+"]/td[2]")).getText();
			textlist.add(text);
		}

		return textlist;

	}

	public static List<String> getCountryValues()
	{
		List<String> textlist = new ArrayList<>();

		for(int i =2;i<=7;i++)
		{
			String text =driver.findElement(By.xpath("//*[@id='customers']/tbody/tr["+i+"]/td[3]")).getText();
			textlist.add(text);
		}

		return textlist;

	}






}
