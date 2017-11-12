package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KeywordUtilities {
static WebDriver driver = ApplicationProperties.getDriver();	
	
	public static WebElement getElement(String locator){
		WebElement element = null;
		try {
			String propertyValue = locator.substring(locator.indexOf("=")+1);
			if(locator.startsWith("name"))
				element = driver.findElement(By.name(propertyValue));
			else if(locator.startsWith("id"))
				element = driver.findElement(By.id(propertyValue));
			else if(locator.startsWith("class"))
				element = driver.findElement(By.className(propertyValue));
			else if(locator.startsWith("linkText"))
				element = driver.findElement(By.linkText(propertyValue));
			else if(locator.startsWith("xpath"))
				element = driver.findElement(By.xpath(propertyValue));
			else if(locator.startsWith("css"))
				element = driver.findElement(By.cssSelector(propertyValue));
			else if(locator.startsWith("partialLinkText"))
				element = driver.findElement(By.partialLinkText(propertyValue));
		} catch (Exception e) {
			
		}		
		return element;
	} 
	
	
}
