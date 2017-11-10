import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumJavaScriptExecutor {

	public static void main(String[] args) {
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		try {
			driver = new ChromeDriver();
			driver.get("http://newtours.demoaut.com/mercurywelcome.php");
			driver.manage().window().maximize();
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			//js.executeScript("alert(document.body.innerText)");
			System.out.println(js.executeScript("return document.body.innerText"));
			
			WebElement registerLink = driver.findElement(By.linkText("REGISTER"));
			js.executeScript("arguments[0].click()",registerLink);
			
		    WebElement userName = (WebElement) js.executeScript("return document.getElementById('email')");
		    WebElement password = (WebElement) js.executeScript("return document.getElementsByName('password')[0]");
		    WebElement lastName = (WebElement) js.executeScript("return document.getElementsByTagName('input')[1]");
			
			userName.sendKeys("abc");
			password.sendKeys("abc");
			lastName.sendKeys("abc");
			
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
