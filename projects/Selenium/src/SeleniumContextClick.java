import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumContextClick {

	public static void main(String[] args) {
		WebDriver driver = null;
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");			
			WebElement button = driver.findElement(By.className("context-menu-one"));
			
			Actions actions = new Actions(driver);
			actions.moveToElement(button).contextClick().perform();
			
			WebElement copyOption = driver.findElement(By.className("context-menu-icon-copy"));
			copyOption.click();
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			alert.accept();
		
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			driver.close();
			driver.quit();
		}
		
		
	}

}
