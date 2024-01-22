package javaFirstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.net.URL;

public class SeleniumGrid {
	@DataProvider(parallel=true) //we use parallel=true to instruct this set of data should go parallel 
	public Object[][] sendData() {
		
		Object arr[][]= new Object[2][2];
		arr[0][0] = "email_1";
		arr[0][1] = "chrome";
		arr[1][0] = "email_2";
		arr[1][1] = "chrome";
		
		return arr;
	}
	
	@Test(dataProvider = "sendData")
	public void login(String userName, String browserName) throws Exception {
		
		DesiredCapabilities cap = null;
		if(browserName.equalsIgnoreCase("chrome")) {
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.ANY);
			RemoteWebDriver driver= new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
			driver.get("https://www.facebook.com/");
			driver.findElement(By.id("email")).sendKeys(userName);
			
		}
		
	}
}
