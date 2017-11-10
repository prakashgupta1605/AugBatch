import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment_css_multipleObjects {
	public static void main(String[] args) {
		WebDriver driver = null;
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://www.phptravels.net/");
			JavascriptExecutor jsExec = (JavascriptExecutor)driver;
			//get dropdown options
			WebElement currencyElement = driver.findElement(By.cssSelector(".navbar-right.currency_btn .dropdown:nth-of-type(2)"));
			currencyElement.click();
			
			//WebElement currencyElement = driver.findElement(By.name("currency"));
			//Select currencyDropDown = new Select(currencyElement);
			// iterate through all currency options
			List<WebElement> currencyOptions = driver.findElement(By.cssSelector(".dropdown.open .dropdown-menu")).findElements(By.tagName("li"));
			for (WebElement currencyOption : currencyOptions) {
				System.out.println("Currency value: "+ currencyOption.getAttribute("value"));
				System.out.println("Currency Text: "+ currencyOption.getText());
				if(currencyOption.getText().equals("INR")) {
					//currencyElement.click();
					//jsExec.executeScript("arguments[0].click()", currencyOption);
					currencyOption.findElement(By.tagName("a")).click();
					break;
				}				
			}
			Thread.sleep(2000);
			// get all links on the page
			List<WebElement> links = driver.findElements(By.tagName("a"));
			System.out.println(links.get(18).getText());			
			int instance = 0;
			for (WebElement link : links) {
				instance++;
				System.out.println("link text: "+ link.getText());
				if(link.getText().equals("Hotels")) {
					System.out.println("Its found at instance: "+ instance);
					link.click();
					break;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			driver.close();
			driver.quit();
		}
		
		
	}

}
