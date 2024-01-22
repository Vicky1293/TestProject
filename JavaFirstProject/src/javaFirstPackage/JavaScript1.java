package javaFirstPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript1 {

	public static void main(String[] args) throws Exception {
		//System.setProperty("webdriver.chrome.driver","C:\\javasoftwares\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//Locate web element using javaScript
		
		JavascriptExecutor jse = (JavascriptExecutor) driver; //Type casting with driver
		jse.executeScript("document.getElementById('email').value='katkars@2712'");
		jse.executeScript("document.getElementById('pass').value='@q2712'");
		
		//scroll down by using java script
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,500)");
		
		//scroll up by using java script
		Thread.sleep(2000);
		jse.executeScript("window.scroll(0, -500)");
		
		//scroll left by using java script
		Thread.sleep(2000);
		jse.executeScript("window.scroll(-100,0)");
		
		//scroll right by using java script
		
		Thread.sleep(2000);
		jse.executeScript("window.scroll(+100,0)");
		
		

	}

}
