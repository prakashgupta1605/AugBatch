package TestCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjects.LoginPageObject;

public class LoginTestCasesByPageObject{
	WebDriver driver = null;
	LoginPageObject loginPage = new LoginPageObject();
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
	}
	 
	@Test()
	public void testLogin() {
		driver.findElement(loginPage.userName).sendKeys("a");
		driver.findElement(loginPage.password).sendKeys("a");
		driver.findElement(loginPage.login).click();
		Assert.assertTrue(driver.findElement(loginPage.signOff).isDisplayed(), "Login usuccessful");		
		
	}	
}
