package TestNGSeleniumDemo;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class SeleniumTest2 extends BaseTest{	
	@BeforeMethod(alwaysRun=true)
	public void launchURL(){
		System.out.println("Launch URL");
		driver.get("http://newtours.demoaut.com");
		System.out.println("login");
	}  
	@Test(groups={"Regression"})
	public void testCase3(){
		System.out.println("Test case 3 execution");
		Assert.assertTrue(driver.findElement(By.linkText("Hotels")).isEnabled(), 
				"Home link is not visible");
	}	
	@Test(groups={"Sanity"})
	public void testCase4(){		
		System.out.println("Test case 4 execution");
		Assert.assertTrue(driver.findElement(By.linkText("Flights")).isEnabled(), 
				"Home link is not visible");
	}	
	@AfterMethod(alwaysRun=true)
	public void logout()
	{
		System.out.println("Logout");
	}
	
}
