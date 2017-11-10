import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumSynchronization {

	public static void main(String[] args) {
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		try {
			driver = new ChromeDriver();
			driver.get("http://newtours.demoaut.com/mercurywelcome.php");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.name("userName")).sendKeys("a");
			driver.findElement(By.name("password")).sendKeys("a");
			//driver.findElement(By.name("login")).click();			
			//implicit wait
			//driver.findElement(By.name("fromPort"));			
			//explicit wait
			WebDriverWait explicitWait = new WebDriverWait(driver, 300);
			explicitWait.until(ExpectedConditions.presenceOfElementLocated(By.name("fromPort")));
			
			driver.navigate().to("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
			driver.manage().window().maximize();			
			List<WebElement> buttons = driver.findElements(By.tagName("button"));			
			// handle alert
			//buttons.get(0).click();
			explicitWait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			System.out.println("Alert text: "+ alert.getText());
			alert.accept();
			
			driver.navigate().back();
			explicitWait.until(new Function<WebDriver, WebElement>() {
				@Override
				public WebElement apply(WebDriver driver) {
					return driver.findElement(By.name("fromPort"));
				}
			});
			
			//fluent wait
			FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).ignoring(NoSuchElementException.class).
					pollingEvery(5, TimeUnit.SECONDS).withTimeout(5, TimeUnit.MINUTES);
			fluentWait.until(ExpectedConditions.presenceOfElementLocated(By.name("fromPort")));
			
			
			
			
			
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
