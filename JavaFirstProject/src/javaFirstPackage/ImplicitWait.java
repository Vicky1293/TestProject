package javaFirstPackage;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {

	public static void main(String[] args) {
		/*
		 * System Property Setup: This sets the system property to specify the location
		 * of the ChromeDriver executable. It's required to launch the Google Chrome
		 * browser through WebDriver.
		 */
		//System.setProperty("webdriver.chrome.driver","C:\\javasoftwares\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		/*
		 * WebDriver Initialization: This line initializes a new instance of the
		 * ChromeDriver, which will control the Google Chrome browser.
		 */
		WebDriver driver = new ChromeDriver();
		/*
		 * Implicit Wait Configuration: This line sets an implicit wait for 30 seconds.
		 * An implicit wait instructs the WebDriver to wait for a specified amount of
		 * time before throwing an exception if it cannot find an element immediately.
		 * This is useful for handling dynamic web elements that may take some time to
		 * load.
		 */
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		/*
		 * Navigating to a Website: This navigates the WebDriver to the Google homepage.
		 */
			
		driver.get("https://www.google.com/");
		
		//Handle Auto Suggestion in Selenium
		/*
		 * Handling Auto-Suggestions: This line finds the search input field on the
		 * Google homepage by its XPath and enters the search query "How stuff works"
		 * into it.
		 */
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("How stuff works");
		/*
		 * Locating Auto-Suggestion List: This line finds all the auto-suggestion
		 * elements (search suggestions) that appear in a dropdown list after entering
		 * the search query. It uses the XPath to locate these elements and stores them
		 * in a list.
		 */
		List<WebElement> AllSuggestions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		/*
		 * Expected Result: This line defines the expected search suggestion that we
		 * want to select from the auto-suggestions.
		 * Looping through Auto-Suggestions: This loop iterates through all the
		 * auto-suggestions. For each suggestion, it checks if the text of the
		 * suggestion matches the expected result (case-insensitive). If there is a
		 * match, it clicks on the suggestion and then breaks out of the loop. This way,
		 * it selects the desired auto-suggestion and performs a search.
		 */
		for(int i=0; i<AllSuggestions.size(); i++) {
			String expResult = "how stuff works quiz";
			if(AllSuggestions.get(i).getText().equalsIgnoreCase(expResult)) {
			   AllSuggestions.get(i).click();
				 break;
			}
			
		}
	}

}
