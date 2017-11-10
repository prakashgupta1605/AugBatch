package TestNGPackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestPlanWithDataProvider{
	@Test(dataProvider="getBrowsers")
	public void testCase1(String browser) {
		System.out.println("Test case execution on browser: "+ browser);
		//Assert.assertTrue(true);
	}
	
	@DataProvider
	public Object[][] getBrowsers() {
		Object[][] browsers = new Object[3][1];
		browsers[0][0] = "chrome";
		browsers[1][0] = "Firefox";
		browsers[2][0] = "IE";
		return browsers;
	}
	
}
