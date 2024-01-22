package javaFirstPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

//Alert or Java Script Alert or php light box
//it is used to through error to let user know that something has gone wrong
public class Alert {
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\javasoftwares\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alerts");
		
		Thread.sleep(2000);
		//Alert handling
		driver.findElement(By.id("confirmButton")).click();
		
		// Verify the alert text
		String alertText = driver.switchTo().alert().getText();
		String expAlertText = "Do you confirm action?";
		Assert.assertEquals(alertText, expAlertText);
		System.out.println("Alert Handled");
		Thread.sleep(2000);
		
		// Accept alerts 
		driver.switchTo().alert().accept();
		System.out.println("Alert Accepted");
		//Alert dismissed
		Thread.sleep(2000);
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		System.out.println("Alert dismissed");
		System.out.println("vickkuu");
		
		
		
	}

}
