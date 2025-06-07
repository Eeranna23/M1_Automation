package testng;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript_2 extends BaseClass {
	@Test
	public void clickOnComputersLink() {
		driver.findElement(By.partialLinkText("Computers")).click();
		if(driver.getCurrentUrl().equals("https://demowebshop.tricentis.com/computers")) {
			Reporter.log("Computers page is Displayed",true);
		}
		else {
			Reporter.log("Computers page is not displayed",true);
		}
	}

}
