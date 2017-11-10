package TestNGPackage;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestcasesWithParameters{	
	
	@Test
	@Parameters("browser")
	public void testCase(@Optional("chrome") String browserName) {
		System.out.println("TestCase execution on browser: "+ browserName);
		//Assert.assertTrue(false, "xyz button is not present");		
	}	
}
