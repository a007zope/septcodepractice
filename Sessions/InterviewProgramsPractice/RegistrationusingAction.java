import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationusingAction {

	static WebDriver driver;
	private static By firstNameloc =By.xpath("//input[@type='text' and @name='firstname']");

	private static By continueButton = By.xpath("//input[@type='submit' and @value='Continue']");

	private static By first = By.cssSelector("label[for='input-firstname']");

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeOptions co = new ChromeOptions();

		co.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(co);

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		Actions a = new Actions(driver);

		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		a.sendKeys(Keys.SPACE).build().perform();

		Thread.sleep(2000);	

		a.sendKeys(getElement(firstNameloc),"aditya").build().perform();
		a.sendKeys(Keys.BACK_SPACE).build().perform();

		a.contextClick(getElement(first)).doubleClick().build().perform();

		a.scrollToElement(getElement(continueButton)).build().perform();	

	}

	public static WebElement getElement(By locator) {

		return driver.findElement(locator);
	}

}
