package SeleniumSessionsByNaveen;

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
	}
		
	    //get total header count
	    public static int getHeaderCount()
     {
    	return driver.findElements(By.xpath("//table[@id='customers']//th")).size();
     }

	    //get Total Row Count
	    public static int getTotalRowCount()
	     {
	    	 return driver.findElements(By.xpath("//table[@id='customers']//tr")).size()-1;
	     }
	    
	    
	    //get Total Column Count
	    public static void getTotalColumnCount()
	     {
	    	 driver.findElement(By.xpath("//table[@id='customers']//th")).getSize();  	 
	     }
}
