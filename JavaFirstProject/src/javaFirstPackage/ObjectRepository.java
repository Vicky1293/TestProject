package javaFirstPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectRepository {

	public static void main(String[] args) throws Exception {
		//specify the location of property file
		
		File src1 = new File(
				"C:\\Users\\vikram\\eclipse-workspace\\JavaFirstProject\\Repository\\config.properties");
		
		File src2 = new File(
				"C:\\Users\\vikram\\eclipse-workspace\\JavaFirstProject\\Repository\\locators.properties");
		
		File src3 = new File(
				"C:\\Users\\vikram\\eclipse-workspace\\JavaFirstProject\\Repository\\testdata.properties");
		
		//create FileInputStream class object to read the file
		FileInputStream fis1 = new FileInputStream(src1);
		FileInputStream fis2 = new FileInputStream(src2);
		FileInputStream fis3 = new FileInputStream(src3);
		
		//create properties class object to load the previously created file
		
		Properties pro1 = new Properties();
		pro1.load(fis1);
		
		Properties pro2 = new Properties();
		pro2.load(fis2);
		
		Properties pro3 = new Properties();
		pro3.load(fis3);
		
		System.setProperty("webdriver.chrome.driver", "C:\\javasoftwares\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(pro1.getProperty("URL"));
		driver.findElement(By.xpath(pro2.getProperty("Email"))).sendKeys(pro3.getProperty("TestData1"));
		driver.findElement(By.xpath(pro2.getProperty("Password"))).sendKeys(pro3.getProperty("TestData2"));
	}

}
