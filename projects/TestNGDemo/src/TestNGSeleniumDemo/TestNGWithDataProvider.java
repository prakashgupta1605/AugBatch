package TestNGSeleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGWithDataProvider { 
	WebDriver driver = null;
	
	@BeforeMethod
	public void setBrowserDriverLocations(){
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "C:/IEDriverServer.exe");
		
	}
	
	@Test(dataProvider = "getBrowser")
	public void testCase(String browser){		
		System.out.println("Test case 1 execution.");
		try {	
			switch (browser) {
			case "chrome":
				driver = new ChromeDriver();
				break;
			case "IE":
				DesiredCapabilities ieCap = DesiredCapabilities.internetExplorer();
				ieCap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
				ieCap.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
				driver = new InternetExplorerDriver(ieCap);
				break;
			default:
				break;
			}
			driver.get("http://newtours.demoaut.com/");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@DataProvider
	public Object[][] getBrowser(){
		Object[][] browsers = new Object[2][1];
		browsers[0][0] = "chrome";
		browsers[1][0] = "IE";
		return browsers;
	}
	
	@AfterMethod
	public void closeBrowser(){
		driver.close();
		driver.quit();
	}
	
}
