package PageObjects;

import org.openqa.selenium.By;

public class LoginPageObject {
	public By userName = By.name("userName");
	public By password = By.name("password");
	public By login = By.name("login");
	public By signOff = By.linkText("SIGN-OFF");
	
}
