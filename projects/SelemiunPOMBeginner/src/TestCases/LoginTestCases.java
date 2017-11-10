package TestCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjects.LoginPage;

public class LoginTestCases{
	WebDriver driver = null;
	LoginPage loginPage = null;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		loginPage = new LoginPage(driver);
	}
	 
	@Test()
	public void testLogin() {
		loginPage.userName.sendKeys("a");
		loginPage.password.sendKeys("a");
		loginPage.login.click();
		Assert.assertTrue(loginPage.signOff.isDisplayed(), "login unsuccessful");		
	}	
	
	@AfterMethod
	public void destroyDriver() {
		driver.close();
		driver.quit();
	}
}
