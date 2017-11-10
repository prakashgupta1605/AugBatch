import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumBasicOperations {

	public static void main(String[] args) {
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		try {
			driver = new ChromeDriver();
			driver.get("http://newtours.demoaut.com/mercurywelcome.php");
			driver.manage().window().maximize();
			System.out.println("current URL: "+ driver.getCurrentUrl());
			System.out.println("current title: "+ driver.getTitle());
			System.out.println("page source: "+ driver.getPageSource());
			
			WebElement userName = driver.findElement(By.name("userName"));
			System.out.println("User displayed: "+ userName.isDisplayed());
			System.out.println("User enabled: "+ userName.isEnabled());
			System.out.println("get type attribute: "+ userName.getAttribute("type"));
			userName.sendKeys("a");
			userName.clear();
			
			WebElement footer  = driver.findElement(By.className("footer"));
			System.out.println("application version: "+ footer.getText());
			
			userName.sendKeys("a");
			driver.findElement(By.name("password")).sendKeys("a");
			driver.findElement(By.name("login")).click();
			
			//dropdown actions
			WebElement fromPort = driver.findElement(By.name("fromPort"));
			Select selectFromPort = new Select(fromPort);
			System.out.println("selected port: "+ selectFromPort.getFirstSelectedOption().getText());
			selectFromPort.selectByIndex(1);
			selectFromPort.selectByValue("London");
			selectFromPort.selectByVisibleText("Paris");
			
			
			
			
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
