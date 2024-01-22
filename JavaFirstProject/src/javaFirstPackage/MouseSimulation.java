package javaFirstPackage;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\javasoftwares\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		//after open url its asking to login so close this we use following
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		//created electronic web element reference
		Thread.sleep(1000);
		WebElement electro = driver.findElement(By.xpath("//*[text()='Electronics']"));
		//mouse simulation using action class
		//mouse hover on webElement
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		act.moveToElement(electro).build().perform();
		
		//perform keyboard operations
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		WebElement fash = driver.findElement(By.xpath("//*[text()='Fashion']"));
		//performed enter operation on fashion webelement
		Thread.sleep(2000);
		act.sendKeys(fash, Keys.ENTER).build().perform();
		System.out.println("fashion option clicked");
		//performed right click on web page
		Thread.sleep(2000);
		act.contextClick().build().perform();
	}

}
