package javaFirstPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MenuAccessibilityTest {

	public static void main(String[] args) throws Exception {
		 // Set the path to the ChromeDriver executable
		WebDriverManager.chromedriver().setup();

        // Initialize ChromeDriver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // Navigate to the website
        driver.get("https://www.tendable.com"); // Replace this with the actual URL of the website
        
        //driver.findElement(By.xpath("/html/body/header/div/div[1]/a[3]")).click();
        driver.findElement(By.xpath("//a[text()='https://www.tendable.com/book-a-demo']")).click();
        
    }

	

}
