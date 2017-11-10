import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DemoDesiredCapabilities {
	public static void main(String[] args) {
		String browser = "chrome";
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "C:/IEDriverServer.exe");
		System.setProperty("webdriver.firefox.driver", "C:/geckodriver.exe");
		try {
			switch (browser) {
			case "ie":
				DesiredCapabilities ieCapability = DesiredCapabilities.internetExplorer();
				ieCapability.setCapability(CapabilityType.SUPPORTS_ALERTS, false);
				ieCapability.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
				ieCapability.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
				driver = new InternetExplorerDriver(ieCapability);
				break;
			case "chrome":
				DesiredCapabilities chromeCapability = DesiredCapabilities.chrome();
				chromeCapability.setCapability(CapabilityType.SUPPORTS_ALERTS, false);
				chromeCapability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
				chromeCapability.setCapability(CapabilityType.TAKES_SCREENSHOT, true);
				driver = new ChromeDriver(chromeCapability);
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
