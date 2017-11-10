package TestNGSeleniumDemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
public class BaseTest {	
	protected WebDriver driver = null;	
	@BeforeSuite(alwaysRun=true)	
	public void setProperties(){
		System.out.println("Set system properties");
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "C:/IEDriverServer.exe");
	}	
	@BeforeTest(alwaysRun=true)
	public void createData(){
		System.out.println("create pre-requisite data");
	}	
	@BeforeClass(alwaysRun=true)
	public void launchDriver(){
		System.out.println("Launch driver");
		driver = new ChromeDriver();
	}		
	@AfterClass(alwaysRun=true)
	public void quitDriver(){
		System.out.println("Quit and close driver");
		driver.close();
		driver.quit();
	}	
	@AfterTest(alwaysRun=true)
	public void destroyData(){
		System.out.println("destroy pre-requisite data");
	}	
	@AfterSuite(alwaysRun=true)
	public void resetProperties(){
		System.out.println("after suite");
	}	
}
