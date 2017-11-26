import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestPlan1 {
  WebDriver driver = null;
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
	  System.setProperty("webdriver.ie.driver", "C:/IEDriverServer.exe");
	  driver = new ChromeDriver();
	  driver.get("http://newtours.demoaut.com");
  }
  
  @Test
  public void test1() {
	  Assert.assertTrue(driver.findElement(By.linkText("Home")).isEnabled(), 
				"Home link is not visible");
  }
  
  @Test
  public void test2() {
	  Assert.assertFalse(driver.findElement(By.linkText("Home")).isEnabled(), 
				"Home link is not visible");
  }
  

  @Test
  public void test3() {
	  Assert.assertTrue(driver.findElement(By.linkText("Home")).isEnabled(), 
				"Home link is not visible");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
	  driver.quit();
  }

}
