import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
public class SeleniumUnExpectedDialogs {
	public static void main(String[] args) {
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		try {
			DesiredCapabilities chromeCapabilities = DesiredCapabilities.chrome();
			chromeCapabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, 
					UnexpectedAlertBehaviour.ACCEPT);
			driver = new ChromeDriver(chromeCapabilities);
			driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
			driver.manage().window().maximize();			
			List<WebElement> buttons = driver.findElements(By.tagName("button"));
			
			// handle alert
			new Actions(driver).moveToElement(buttons.get(0)).perform();
			buttons.get(0).click();
			driver.getCurrentUrl();
			
			
			System.out.println();
			
		} catch (UnhandledAlertException e) {
			System.out.println(e.getMessage());
		}
		finally {
			driver.close();
			driver.quit();
		}

	}

}
