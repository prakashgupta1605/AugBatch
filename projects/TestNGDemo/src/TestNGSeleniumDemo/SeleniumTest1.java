package TestNGSeleniumDemo;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class SeleniumTest1 extends BaseTest{	
	@BeforeMethod(alwaysRun=true)
	public void launchURL(){
		System.out.println("Launch URL");
		driver.get("http://newtours.demoaut.com");
		System.out.println("login");
	}  
	@Test(groups={"Sanity"})
	public void testCase1(){		
		System.out.println("Test case 1 execution");
		Assert.assertTrue(driver.findElement(By.linkText("Home")).isEnabled(), 
				"Home link is not visible");
	}	
	@Test(groups={"Regression"})
	public void testCase2(){		
		System.out.println("Test case 2 execution");
		Assert.assertFalse(driver.findElement(By.linkText("Home")).isEnabled(), 
				"Home link is visible");
	}	
	@AfterMethod(alwaysRun=true)
	public void logout()
	{
		System.out.println("Logout");
	}	
	
}
