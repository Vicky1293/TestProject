package javaFirstPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers");
		List<WebElement> AllCompanies=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		System.out.println("count of companies: "+AllCompanies.size());
		List<WebElement> CurrentPrice=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("count of CurrentPrice: "+ CurrentPrice);
		String expCompName= "Sunita Tools";
		for(int i=0; i<AllCompanies.size();i++) {
			
			if(AllCompanies.get(i).getText().equalsIgnoreCase(expCompName)) {
				AllCompanies.get(i).click();
				System.out.println("company name: "+AllCompanies.get(i).getText()+"Current Price: "+CurrentPrice.get(i).getText());
				break;
			}
			
		}
		

	}

}
