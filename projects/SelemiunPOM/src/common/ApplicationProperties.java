package common;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class ApplicationProperties {
	// read all environment variables from application.properties file	
	static private WebDriver driver;
	static private String browser;
	static private String URL;
	static private String chromeDriverPath;
	static private String ieDriverPath;
	static private String waitTime;
	static Properties properties = new Properties();
	static InputStream inputStream;
	
	public static void readProperties() throws IOException {
		//inputStream = new FileInputStream("C:/application.properties");
		inputStream = ApplicationProperties.class.getClassLoader().getResourceAsStream("application.properties");
		properties.load(inputStream);
		browser = properties.getProperty("browser");
		URL = properties.getProperty("URL");
		chromeDriverPath = properties.getProperty("chromeDriverPath");
		ieDriverPath = properties.getProperty("ieDriverPath");
		waitTime = properties.getProperty("waitTime");
	}
	
	public static WebDriver launchDriver() {
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();	
			break;
		case "ie":
			driver = new InternetExplorerDriver();	
			break;
		case "firefox":
			driver = new FirefoxDriver();	
			break;
		default:
			driver = new ChromeDriver();
			break;
		}
		return driver;
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

	public static String getBrowser() {
		return browser;
	}

	public static String getURL() {
		return URL;
	}

	public static String getChromeDriverPath() {
		return chromeDriverPath;
	}

	public static String getIeDriverPath() {
		return ieDriverPath;
	}

	public static String getWaitTime() {
		return waitTime;
	}
}
