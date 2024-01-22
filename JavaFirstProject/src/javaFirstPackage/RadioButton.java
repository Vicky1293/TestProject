package javaFirstPackage;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) throws Exception{
		//System.setProperty("webdriver.chrome.driver", "C:\\javasoftwares\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@id,'u_0')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@value='2']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@value='1']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		driver.close();
	}

}
