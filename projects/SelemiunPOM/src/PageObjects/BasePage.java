package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import common.ApplicationProperties;

public class BasePage {
	
	@FindBy(linkText = "Home")
	public WebElement homeLink;

	@FindBy(linkText="SIGN-OFF")
	public WebElement signOff;
	
	@FindBy(className="footer")
	public WebElement footer;
	
	public void logout() {
		signOff.click();
	}
	
	public static void pageRefresh() {
		ApplicationProperties.getDriver().navigate().refresh();
	}
	
	public static void maximizePage() {
		ApplicationProperties.getDriver().manage().window().maximize();
	}
	

}
