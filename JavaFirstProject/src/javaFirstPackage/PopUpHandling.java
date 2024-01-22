package javaFirstPackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpHandling {
     //TAB HANDLING
	public static void main(String[] args) throws Exception {
		//SETTING CHROME DRIVER PATH
		System.setProperty("webdriver.chrome.driver", "C:\\javasoftwares\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		//Create a WebDriver instance:
		WebDriver driver = new ChromeDriver();
		//Configure WebDriver:
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//Navigate to a URL:
		driver.get("https://demoqa.com/browser-windows");
		//Tab Handling
		Thread.sleep(2000);
		//CLICK ON A BUTTON TO OPEN A NEW TAB:
		driver.findElement(By.id("tabButton")).click();
		//Get Window Handles:It retrieves all window handles (IDs) and 
		//stores them in a Set.
		Set<String> allwindowsID = driver.getWindowHandles();
		System.out.println(allwindowsID);
		
		/*IN CASE OF LIST WE USE LOOP AND IN CASE OF SET WE USE ITERATOR
		Iterating Through Window Handles:
		It creates an Iterator to go through the window handles and 
		assigns the handles to win1 (parent window) and win2 (child window).*/
		Iterator<String> abc = allwindowsID.iterator();
		String win1 = abc.next();
		String win2 = abc.next();
		
		//Switch to Parent Window and Print Title:
		driver.switchTo().window(win1);
		System.out.println("parentwindow id:- " + win1);
		System.out.println("parentwindow title:- " + driver.getTitle());
		
		//Switch to Child Window and Print Title:
		Thread.sleep(2000);
		driver.switchTo().window(win2);
		Thread.sleep(2000);
		System.out.println("parentwindow id:- " + win2);
		System.out.println("childwindow title:- " + driver.getCurrentUrl());
		driver.close();
		
		//WINDOW/POPUP HANDLING
		Thread.sleep(2000);
		driver.switchTo().window(win1);
		Thread.sleep(2000);
		driver.findElement(By.id("windowButton")).click();
		
		//Get Window Handles:It retrieves all window handles (IDs) and 
		//stores them in a Set.
		Set<String> allwindowsID2 = driver.getWindowHandles();
		System.out.println(allwindowsID2);
		
		/*IN CASE OF LIST WE USE LOOP AND IN CASE OF SET WE USE ITERATOR
		Iterating Through Window Handles:
		It creates an Iterator to go through the window handles and 
		assigns the handles to win3 (parent window) and win4 (child window).*/
		
		Iterator<String> abc1 = allwindowsID2.iterator();
		String win3 = abc1.next();
		String win4 = abc1.next();
		Thread.sleep(2000);
		
		//Switch to Child Window and Print Title And current url
		
		driver.switchTo().window(win4);
		Thread.sleep(2000);
		System.out.println("Child windowID:- " + win4);
		System.out.println("Child window title:- " + driver.getTitle());
		System.out.println("Child window url:- " + driver.getCurrentUrl());
		driver.quit();
		
		
		
		
		
		

	}

}
