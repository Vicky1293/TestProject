package javaFirstPackage;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniun {

	public static void main(String[] args) throws Exception     {
		//To Up The Any Browser instance
		//Setting the property of Chrome Browser and passing ChromeDriver path
		System.setProperty("webdriver.chrome.driver", "C:\\javasoftwares\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		//WebDriver is an interface and driver is a reference
		//Launching Chrome Browser Instance
		WebDriver driver = new ChromeDriver();
		Thread.sleep(0);
		//Open Url using get() method
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		// maximize the window
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		//opening Url using navigate() method
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.close();
	}

}
