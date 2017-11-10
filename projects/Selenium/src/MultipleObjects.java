import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleObjects {

	public static void main(String[] args) {
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		try {
			driver = new ChromeDriver();
			driver.get("http://newtours.demoaut.com/mercurywelcome.php");
			driver.manage().window().maximize();	
			driver.findElement(By.name("userName")).sendKeys("a");
			driver.findElement(By.name("password")).sendKeys("a");
			driver.findElement(By.name("login")).click();
			
			// select radio button
			List<WebElement> tripTypes = driver.findElements(By.name("tripType"));
			for (WebElement tripType : tripTypes) {
				System.out.println("radio button text: "+ tripType.getAttribute("value"));
				if(tripType.getAttribute("value").equals("oneway")) {
					tripType.click();
					break;
				}
			}
			
			// dropdown
			Select departFromList = new Select(driver.findElement(By.name("fromPort")));
			List<WebElement> fromPortOptions = departFromList.getOptions();
			for (WebElement port : fromPortOptions) {
				System.out.println("Port: "+ port.getText());
				if(port.getText().equals("Paris")) {
					port.click();
				}
			}
			
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
