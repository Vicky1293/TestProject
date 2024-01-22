package javaFirstPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\javasoftwares\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
		Thread.sleep(2000);
		int AllFrame = driver.findElements(By.tagName("iframe")).size();
		System.out.println(AllFrame);
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Watch Video')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'close')]")).click();
		System.out.println("closed");

	}

}
