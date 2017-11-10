package TestNGPackage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcases2 extends BaseTestClass{	
	
	@Test(groups= {"Regression", "security"})
	public void testCase3() {
		System.out.println("TestCase 3 execution");
		//Assert.assertTrue(false, "xyz button is not present");		
	}	
	@Test(groups= {"Sanity"})
	public void testCase4() {
		System.out.println("TestCase 4 execution");
		Assert.assertTrue(true);
	}	
}
