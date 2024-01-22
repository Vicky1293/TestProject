package javaFirstPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimul2DragUsingCoordinate {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\javasoftwares\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		//switching to frame
		driver.switchTo().frame(0);
		System.out.println("switched to frame");
		//Draggable web element
		WebElement drag = driver.findElement(By.id("draggable"));
		Actions act = new Actions(driver);
		Thread.sleep(5000);
		//Drag web element by using coordinate
		
		act.dragAndDropBy(drag, 100, 50).build().perform();
		//used to click and hold the web element until next operation getting performed
		Thread.sleep(2000);
		act.clickAndHold(drag).dragAndDropBy(drag, 100, 50).build().perform();
		
		

	}

}
