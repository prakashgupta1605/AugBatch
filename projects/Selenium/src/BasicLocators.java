import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators {

	public static void main(String[] args) {
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		try {
			driver = new ChromeDriver();
			driver.get("http://newtours.demoaut.com/mercurywelcome.php");
			
			//by name
			WebElement userName = driver.findElement(By.name("userName"));
			userName.sendKeys("abc");
			
			//by link text
			driver.findElement(By.linkText("REGISTER")).click();
			
			//by partial link
			driver.findElement(By.partialLinkText("REGIST")).click();
			
			//by id
			driver.findElement(By.id("userName")).sendKeys("abc.gmail.com");
			
			//by class
			driver.findElement(By.className("footer"));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			driver.close();
			driver.quit();
		}

	}

}
