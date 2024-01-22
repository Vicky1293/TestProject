package javaFirstPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation1ForDragAndDrop {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\javasoftwares\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		//switching to frame
		driver.switchTo().frame(0);
		System.out.println("switched to frame");
		//Draggable web element
		WebElement drag = driver.findElement(By.id("draggable"));
		//droppable web element
		WebElement drop = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		Thread.sleep(5000);
		act.dragAndDrop(drag, drop).build().perform();

	}

}
