import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestXpath {
	
	public static void main(String...strings){			
		WebDriver driver = null;
		try {
			System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://newtours.demoaut.com/mercurywelcome.php");			
			//absolute path
			System.out.println(driver.findElement(By.xpath("html/body")).getText());			
			// by instance
            System.out.println(driver.findElement(By.xpath("//a[1]")).getText());
            System.out.println(driver.findElement(By.xpath("//a[2]")).getText());
            // by attribute
            driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("a");
            //startswith
            driver.findElement(By.xpath("//input[starts-with(@name,'user')]")).sendKeys("b");
            //contains
            driver.findElement(By.xpath("//input[contains(@name,'erNa')]")).sendKeys("c");                                         
            //by text
            driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
            //in heirarchy
            driver.findElement(By.xpath("//form[@method='post']/table/tbody/tr[3]/td[2]/input")).sendKeys("abc");            
            //login
            driver.findElement(By.xpath("//a[text()='Home']")).click();
            driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("a");
            driver.findElement(By.xpath("//input[@name='password']")).sendKeys("a");
            driver.findElement(By.xpath("//input[@name='login']")).click();            
            //radio button with multiple attributes
            driver.findElement(By.xpath("//input[@type='radio'][@name='tripType'][@value='oneway']")).click();		
			
			
			
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
