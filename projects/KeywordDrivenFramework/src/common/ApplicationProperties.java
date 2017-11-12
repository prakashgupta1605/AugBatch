package common;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ApplicationProperties {
	public static WebDriver driver;
	public static String browser;
	public static String URL;
	public static String chromeDriverPath;
	public static String ieDriverPath;
	public static String waitTime;
	public static Properties properties= new Properties();
	public static InputStream propertiesStream = null;	
	public static void readProperties() throws IOException{
		propertiesStream = ApplicationProperties.class.getClassLoader().
				getResourceAsStream("application.properties");
		properties.load(propertiesStream);
		browser = properties.getProperty("browser");
		URL = properties.getProperty("URL");
		chromeDriverPath = properties.getProperty("chromeDriverPath");
		ieDriverPath = properties.getProperty("ieDriverPath");
		waitTime = properties.getProperty("waitTime");
	}	
	public static WebDriver launchDriver(){
		switch (browser.toUpperCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;	
		case "IE":
			driver = new InternetExplorerDriver();
			break;	
		default:
			driver = new ChromeDriver();
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


	public static Properties getProperties() {
		return properties;
	}


	public static InputStream getPropertiesStream() {
		return propertiesStream;
	}

	
}
