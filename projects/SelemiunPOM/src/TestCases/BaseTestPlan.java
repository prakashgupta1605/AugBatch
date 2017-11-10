package TestCases;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import PageObjects.BasePage;

public class BaseTestPlan{
	public static WebDriver driver = null;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "C:/IEDriverServer.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		BasePage.maximizePage();
	}	
	
	@AfterMethod
	public void destroyDriver() {
		driver.close();
		driver.quit();
	}
}
