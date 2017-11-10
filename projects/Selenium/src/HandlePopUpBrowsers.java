import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlePopUpBrowsers {
	public static void main(String[] args) {
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		try {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://toolsqa.com/automation-practice-switch-windows/");
			String mainWindowHandle = driver.getWindowHandle();
			System.out.println("Main window handle: "+ mainWindowHandle);
			driver.findElement(By.id("button1")).click();			
			//switch to pop up window
			Set<String> windowHandles = driver.getWindowHandles();
			for (String handle : windowHandles) {
				driver.switchTo().window(handle);
				if(driver.getTitle().equals("QA Automation Tools Tutorial")){
					break;
				}				
			}	
			//operations on pop up
			driver.manage().window().maximize();
			System.out.println(driver.findElement(By.cssSelector(".masthead.classic-header")).getText());
			driver.close();
			// switch back to main window
			driver.switchTo().window(mainWindowHandle);
			System.out.println("main window title: "+ driver.getTitle());			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			driver.close();
			driver.quit();
		}

	}

}
