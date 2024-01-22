package javaFirstPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\javasoftwares\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("vicky@");
		//fetch value of input box
		System.out.println(driver.findElement(By.id("email")).getAttribute("value"));
		//Height of input box
		System.out.println("Height of input box is:- " + driver.findElement(By.id("email")).getSize().getHeight());
		//get width of input box
		System.out.println("width of input box:- " + driver.findElement(By.id("email")).getSize().getWidth());
		//use explicit wait to check password field is visible
		WebDriverWait wt = new WebDriverWait(driver, 30);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass"))).sendKeys("12345@");
		
		

	}

}
