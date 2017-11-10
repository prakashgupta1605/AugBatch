import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumScreenshot {

	public static void main(String[] args) {
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		try {
			driver = new ChromeDriver();
			driver.get("https://www.google.co.in/");
			driver.manage().window().maximize();

			TakesScreenshot screenShot = (TakesScreenshot)driver;
			File file = screenShot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File("C:/temp/abc.png"));
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			driver.close();
			driver.quit();
		}

	}

}
