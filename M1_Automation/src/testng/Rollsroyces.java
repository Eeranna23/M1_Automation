package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Rollsroyces {
	@Test(groups = "regression")
	public void launch() {
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.rolls-roycemotorcars.com/en_GB/home.html");
		Reporter.log("Rollsroyces launched",true);
		
	}
}
