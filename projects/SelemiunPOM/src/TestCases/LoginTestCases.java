package TestCases;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjects.LoginPage;

public class LoginTestCases extends BaseTestPlan{
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
	public void testInvalidLogin() {
		loginPage.userName.sendKeys("a");
		loginPage.password.sendKeys("");
		loginPage.login.click();
		Assert.assertTrue(loginPage.login.isDisplayed(), "-ve login failed");		
	}
	
}
