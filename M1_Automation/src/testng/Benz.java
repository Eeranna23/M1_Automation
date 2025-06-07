package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Benz {
	@Test(groups = "smoke")
	public void launch() {
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.mercedes-benz.co.in/");
		Reporter.log("Benz launched",true);
		
	}
}
