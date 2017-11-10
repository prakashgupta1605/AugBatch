package TestCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjects.LoginPage;

public class LoginTestCases extends BaseTestPlan{
	WebDriver driver = null;
	LoginPage loginPage = null;
	
	@BeforeMethod
	public void loginSetUp() {
		loginPage = new LoginPage(driver);
	}
	 
	@Test()
	public void testLogin() {
		loginPage.userName.sendKeys("a");
		loginPage.password.sendKeys("a");
		loginPage.login.click();
		Assert.assertTrue(loginPage.signOff.isDisplayed(), "login unsuccessful");		
	}	
	
	@Test()
	public void testNegetiveLogin() {
		loginPage.userName.sendKeys("a");
		loginPage.password.sendKeys("b");
		loginPage.login.click();
		Assert.assertTrue(loginPage.login.isDisplayed(), "-ve test failed");		
	}
	
}
