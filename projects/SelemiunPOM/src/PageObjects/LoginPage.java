package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="userName")
	public WebElement userName;
	
	@FindBy(name="password")
	public WebElement password;
	
	@FindBy(name="login")
	public WebElement login;
	
	public void enterUserName(String userName) {
		this.userName.sendKeys(userName);
	}
	public void enterPassword(String password) {
		this.password.sendKeys(password);
	}
	public void clickLogin() {
		this.login.click();
	}
	
	public void login(String userName, String password) {
		enterUserName(userName);
		enterPassword(password);
		clickLogin();
	}
}
