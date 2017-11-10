import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOperations {

	public static void main(String[] args) {
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		try {
			driver = new ChromeDriver();
			Navigation navigate = driver.navigate();
			Window window  = driver.manage().window();
			//Launch URL
			driver.get("https://www.google.co.in/");
			//maximize window
			window.maximize();			
			//navigate to new URL
			navigate.to("http://www.gmail.com");
			//move back
			navigate.back();
			//move forward
			navigate.forward();
			//refresh page
			navigate.refresh();			
			//resize window
			Dimension dimension = new Dimension(500, 500);
			window.setSize(dimension);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			driver.close();
			driver.quit();
		}

	}

}
