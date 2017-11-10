package TestNGPackage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcases1 extends BaseTestClass{	
	 
	@Test(testName="test case 1", description = "test case description", 
			priority = 2 ,   groups= {"Regression", "security"})
	public void testCase1() {
		System.out.println("TestCase 1 execution");
		//Assert.assertTrue(false, "xyz button is not present");		
	}	
	@Test(priority = 1,  dependsOnMethods= {"testCase1"},   groups= {"Sanity", "security"})
	public void testCase2() {
		System.out.println("TestCase 2 execution");
		Assert.assertTrue(true);
	}	
}
