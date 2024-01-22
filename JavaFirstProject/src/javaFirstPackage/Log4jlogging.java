package javaFirstPackage;


import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4jlogging {

	public static void main(String[] args) {
		//Create Logger Instance
		Logger logger = Logger.getLogger("Log4jlogging");
		
		//Configure log4j properties file
		PropertyConfigurator.configure("C:\\Users\\vikram\\eclipse-workspace\\JavaFirstProject\\Log4j.properties");
		
		//open browser instance
		System.setProperty("webdriver.chrome.driver", "C:\\javasoftwares\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		logger.info("chrome browser instance opened");
		
		//maximize the window
		driver.manage().window().maximize();
		logger.info("window get maximized");
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		logger.info("applying implicitly wait");
		
		//open url
		driver.get("https://www.facebook.com/");
		logger.info("url opened");
		
		//check if web element is displayed or not
		try {
			driver.findElement(By.id("emails")).isDisplayed();
			logger.info("web element is displayed");
		} catch (Exception e) {
			logger.info("Failure- 'emails' is not displayed");
		}
		
	}

}
