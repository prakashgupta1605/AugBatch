import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandleFrames {
	public static void main(String[] args) {
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		try {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://toolsqa.com/iframe-practice-page/");	
			System.out.println("Main window title: "+ driver.getTitle());
			
			//switch to frame by index
			driver.switchTo().frame(1);
			driver.switchTo().defaultContent();
			//switch to frame by ID or name
			driver.switchTo().frame("IF2");
			driver.switchTo().defaultContent();
			//switch to frame using webelement of iframe object
			driver.switchTo().frame(driver.findElement(By.id("IF2")));			
			// operations on frame
			System.out.println("Frame title: "+ driver.getTitle());
			System.out.println(driver.findElement(By.id("breadcrumbs")).getText());
			
			// switch to main window
			driver.switchTo().defaultContent();
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			driver.close();
			driver.quit();
		}

	}

}
