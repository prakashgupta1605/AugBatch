package TestNGPackage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
public class BaseTestClass {	
	@BeforeSuite
	public void setSystemProperties() {
		System.out.println("set system properties");
	}	
	@AfterSuite
	public void resetSystemProperties() {
		System.out.println("reset system properties");
	}	
	@BeforeTest
	public void preRequisite() {
		System.out.println("create pre-requisite data");
	}	
	@AfterTest 
	public void detroyData() {
		System.out.println("destroy data");
	}	
	@BeforeClass
	public void launchDriver() {
		System.out.println("launch driver");
	}	
	@AfterClass
	public void quitDriver() {
		System.out.println("quit driver");
	}	
	@BeforeMethod
	public void login() {
		System.out.println("launch URL");
	}	
	@AfterMethod
	public void logout() {
		System.out.println("close browser");
	}  
	
}
