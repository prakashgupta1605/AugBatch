import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumActions {

	public static void main(String[] args) {
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		try {
			driver = new ChromeDriver();
			driver.get("http://newtours.demoaut.com/mercurywelcome.php");
			driver.manage().window().maximize();					
			WebElement registerLink = driver.findElement(By.linkText("REGISTER"));
			
			Actions actions = new Actions(driver);
			//actions.moveToElement(registerLink).click().perform();
			Action action = actions.moveToElement(registerLink).click().build();
			action.perform();

			WebElement firstName = driver.findElement(By.name("firstName"));		
			WebElement lastName = driver.findElement(By.name("lastName"));			
			//type in Caps
			actions.moveToElement(firstName).click().keyDown(Keys.SHIFT).
			sendKeys("hello").keyUp(Keys.SHIFT).perform();
			//double click
			actions.doubleClick(firstName).perform();
			
			// copy from firstname using ctrl C
		    actions.moveToElement(firstName).click().
			keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).
			keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
			//paste into lastnae using ctrl V
			actions.moveToElement(lastName).click().
			keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
			
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
