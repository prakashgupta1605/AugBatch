import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestXpath2 {
	
	public static void main(String...strings){			
		WebDriver driver = null;
		try {
			System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://newtours.demoaut.com/mercurywelcome.php");
			
			driver.findElement(By.xpath
					("//table//table//table//table//table//table//tr[*]/td/font[contains(text(),'Angeles to Chicago')]/../../td[2]")).getText();
			
			List<WebElement> tours = driver.findElements
					(By.xpath("//table//table//table//table//table//table//tr"));
			
			System.out.println("total tours: "+tours.size());
			for (WebElement tour : tours) {
				System.out.println(tour.getText());
			}
			
			
			
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
