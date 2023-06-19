import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class switchForInt {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		/*
		 * int variable = 6; switch(variable) { case'1':System.out.println(); break;
		 * case'2':System.out.println(); break; case'3':System.out.println(); break;
		 * case'6':System.out.println(); break;
		 * default:System.out.println("execute default statement");
		 * 
		 * }
		 */
		
	//	String car ="m";
//		
//		switch(car)
//		{
//		case "m":System.out.println("BMW");
//		break;
//		case "a":System.out.println("Audii");
//		break;
//		case "M":System.out.println("Maruti");
//		break;
//		case "z":System.out.println("Zen");
//		break;
//		case "T":System.out.println("Truck");
//		break;
//		case "A":System.out.println("Aeroplane");
//		break;
//		default:System.out.println("please select car");
//		
//		}
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*"); 
		driver = new ChromeDriver(co);
		driver.get("https://www.facebook.com/reg");
		
		 WebElement day = driver.findElement(By.id("day"));
		  WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		switchForInt i = new switchForInt();
		
		i.selectElement("value",day,"19");
		i.selectElement("value",month,"4");
		i.selectElement("value",year,"2015");
		
	}
	
	public  void selectElement(String locatorvalue,WebElement element,String value)
	{
		Select s = new Select(element);
		switch(locatorvalue)
		{
		case"visibleText" :
			s.selectByVisibleText(value);
			break;
			
		case "index":
			s.selectByIndex(Integer.parseInt(value));
			break;
			
		case"value":
		   s.selectByValue(value);
		   break;
		   
		default:
			System.out.println("default selection");
		}
	}
	

}
