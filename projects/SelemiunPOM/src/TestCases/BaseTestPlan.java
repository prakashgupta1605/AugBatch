package TestCases;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import PageObjects.BasePage;
import common.ApplicationProperties;

public class BaseTestPlan{
	public static WebDriver driver = null;
	
	@BeforeClass
	public void beforeClass() throws IOException {
		ApplicationProperties.readProperties();
		System.setProperty("webdriver.chrome.driver", ApplicationProperties.getChromeDriverPath());
		System.setProperty("webdriver.ie.driver", ApplicationProperties.getIeDriverPath());
		Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe");
		Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");		
	}
	
	@BeforeMethod
	public void setUp() throws IOException {
		driver = ApplicationProperties.launchDriver();
		driver.get(ApplicationProperties.getURL());
		driver.manage().timeouts().implicitlyWait(Long.valueOf(ApplicationProperties.getWaitTime()), 
				TimeUnit.SECONDS);
		BasePage.maximizePage();
	}	
	
	@AfterMethod
	public void destroyDriver() {
		driver.close();
		driver.quit();
	}
}
