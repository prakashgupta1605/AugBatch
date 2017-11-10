package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import TestCases.BaseTestPlan;

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
		BaseTestPlan.driver.navigate().refresh();
	}
	
	public static void maximizePage() {
		BaseTestPlan.driver.manage().window().maximize();
	}
	

}
