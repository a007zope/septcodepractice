package calendarhandlingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalendarHandling {
	
	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\P7111642.INAIRLT541343\\Downloads\\chrome-win64\\chrome-win64\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.setBinary("C:\\Users\\P7111642.INAIRLT541343\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		
		 driver = new ChromeDriver(co);
       driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
       
       driver.findElement(By.id("datepicker")).click();
    //   driver.findElement(By.xpath("//a[text()='18']")).click();
       
       selectDate("25");
      
	}
	
	public static void  selectDate(String day)
	{
		driver.findElement(By.xpath("//a[text()='"+day+"']")).click();
		
	}
	
	

}
