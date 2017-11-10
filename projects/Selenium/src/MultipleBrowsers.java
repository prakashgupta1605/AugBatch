import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MultipleBrowsers {
	public static void main(String[] args) {
		String browser = args[0];
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "C:/IEDriverServer.exe");
		System.setProperty("webdriver.firefox.driver", "C:/geckodriver.exe");
		try {
			switch (browser) {
			case "ie":
				driver = new InternetExplorerDriver();
				break;
			case "chrome":
				driver = new ChromeDriver();
				break;
			case "firefox":
				driver = new FirefoxDriver();
				break;
			default:
				driver = new ChromeDriver();
				break;
			}
			driver.get("https://www.google.co.in/");			
			WebElement searchBox = driver.findElement(By.id("lst-ib"));
			searchBox.sendKeys("selenium");			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			driver.close();
			driver.quit();
		}

	}

}
