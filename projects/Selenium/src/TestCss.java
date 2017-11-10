import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestCss {	
	public static void main(String...strings){			
		WebDriver driver = null;
		try {
			System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://newtours.demoaut.com/mercurywelcome.php");			
			//absolute path
			System.out.println(driver.findElement(By.cssSelector("html table")).getText());			
			//direct child relationship
			System.out.println(driver.findElement(By.cssSelector("html > body")).getText());			
			// by instance
            System.out.println(driver.findElement(By.cssSelector("a:nth-of-type(1)")).getText());
            System.out.println(driver.findElement(By.cssSelector("a:nth-of-type(2)")).getText());
            // by attribute
            driver.findElement(By.cssSelector("input[name=userName]")).sendKeys("a");
            //startswith
            driver.findElement(By.cssSelector("input[name^='user']")).sendKeys("b");
            //contains
            driver.findElement(By.cssSelector("input[name*='user']")).sendKeys("c");                                         
            //by text
            driver.findElement(By.linkText("REGISTER")).click();
            //in heirarchy
            driver.findElement(By.cssSelector("form[method='post']>table input[name='firstName']")).sendKeys("MyFirstName"); 
            driver.findElement(By.cssSelector("input#email")).sendKeys("myEmail");
            //login
            driver.findElement(By.xpath("//a[text()='Home']")).click();
            driver.findElement(By.cssSelector("input[name=userName]")).sendKeys("a");
            driver.findElement(By.cssSelector("[name=password]")).sendKeys("a");
            driver.findElement(By.cssSelector("[name=login]")).click();            
            //radio button with multiple attributes
            driver.findElement(By.cssSelector("input[type=radio][value=oneway]")).click();            
            // directly using class and id
            System.out.println(driver.findElement(By.cssSelector(".footer")).getText());			
			
		} 
		catch (Exception e) {
			System.out.println("Exception occured: "+ e.getMessage());
		}
		finally {
			driver.close();
			driver.quit();
		}
		
	}
	
}
