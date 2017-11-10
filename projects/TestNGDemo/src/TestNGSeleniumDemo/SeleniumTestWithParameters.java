package TestNGSeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class SeleniumTestWithParameters{
	WebDriver driver;
	@BeforeMethod()
	@Parameters("browser")
	public void launchURL(@Optional("chrome") String browser){
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "C:/IEDriverServer.exe");
		System.out.println("Browser: "+browser);
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "IE":
			driver = new InternetExplorerDriver();
			break;
		default:
			break;
		}
		System.out.println("Launch URL");
		driver.get("http://newtours.demoaut.com");
		System.out.println("login");
	}  
	@Test()
	public void testCase1(){		
		System.out.println("Test case 1 execution");
		Assert.assertTrue(driver.findElement(By.linkText("Home")).isEnabled(), 
				"Home link is not visible");
	}	
		
	@AfterMethod(alwaysRun=true)
	public void logout()
	{
		System.out.println("Logout");
	}	
	
}
