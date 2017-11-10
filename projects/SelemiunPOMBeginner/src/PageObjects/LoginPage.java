package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="userName")
	public WebElement userName;
	
	@FindBy(name="password")
	public WebElement password;
	
	@FindBy(name="login")
	public WebElement login;
	
	@FindBy(linkText="SIGN-OFF")
	public WebElement signOff;
}
