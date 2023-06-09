package DynamicnStaticWebTableHandlingByNaveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticWebTable {

	static WebDriver driver;

	public static void main(String[] args) {		
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.get("https://www.w3schools.com/html/html_tables.asp");	
		getCompanyList();

	}

	//get total header count or column count
	public static int getHeaderCount()
	{
		return driver.findElements(By.xpath("//table[@id='customers']//th")).size();
	}

	//get Total Row Count
	public static int getTotalRowCount()
	{
		return driver.findElements(By.xpath("//table[@id='customers']//tr")).size()-1;
	}


	public static void getCompanyList()
	{

		//table[@id="customers"]/tbody/tr[6]/td[1]

		String beforXpath ="//table[@id=\"customers\"]/tbody/tr[";
		String afterXpath ="]/td[1]";

		for(int i =2;i<=7;i++)
		{
			String xpath = beforXpath +i+afterXpath;
			System.out.println(xpath);

			String text =driver.findElement(By.xpath(xpath)).getText();
			System.out.println(text);    		

		}
	}




}
