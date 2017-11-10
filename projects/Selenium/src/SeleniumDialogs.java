import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class SeleniumDialogs {
	public static void main(String[] args) {
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		try {
			driver = new ChromeDriver();
			driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
			driver.manage().window().maximize();			
			List<WebElement> buttons = driver.findElements(By.tagName("button"));
			
			// handle alert
			new Actions(driver).moveToElement(buttons.get(0)).perform();
			buttons.get(0).click();
			Alert alert = driver.switchTo().alert();
			System.out.println("Alert text: "+ alert.getText());
			alert.accept();
			
			//handle confirmation
			//dismiss confirmation
			new Actions(driver).moveToElement(buttons.get(1)).perform();
			buttons.get(1).click();
			Alert confirmation = driver.switchTo().alert();
			System.out.println("confirmation text: "+ confirmation.getText());
			confirmation.dismiss();
			// accept confirmation
			buttons.get(1).click();
			confirmation = driver.switchTo().alert();
			confirmation.accept();
			
			System.out.println();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			driver.close();
			driver.quit();
		}

	}

}
