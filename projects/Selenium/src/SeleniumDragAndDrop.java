import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDragAndDrop {

	public static void main(String[] args) {
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		try {
			driver = new ChromeDriver();
			driver.get("http://jqueryui.com/droppable/");
			driver.manage().window().maximize();
			//driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
			
			WebDriverWait explicitWait = new WebDriverWait(driver, 120);
			explicitWait.until(ExpectedConditions.
					frameToBeAvailableAndSwitchToIt(By.cssSelector(".demo-frame")));
			
			Actions actions = new Actions(driver);
			WebElement source = driver.findElement(By.cssSelector("#draggable.ui-widget-content"));
			WebElement destination = driver.findElement(By.cssSelector("#droppable.ui-widget-header"));
			
			actions.moveToElement(source).clickAndHold().moveToElement(destination).release().perform();
			
			driver.navigate().refresh();
			actions.dragAndDrop(source, destination).perform();
			
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
