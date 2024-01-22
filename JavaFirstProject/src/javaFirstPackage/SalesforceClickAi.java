package javaFirstPackage;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesforceClickAi {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\javasoftwares\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.salesforce.com/in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class=\"nav-item-label--l1\"")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/h3/hgf-button/span[1]']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"l1-0\"]/div[1]/div[1]/ul/li[3]/hgf-button/span")).click();

	}

}
