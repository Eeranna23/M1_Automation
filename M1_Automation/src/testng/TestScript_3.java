package testng;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript_3 extends BaseClass{
	@Test
	public void clickOnElectronics() {
		driver.findElement(By.partialLinkText("Electronics")).click();
		if(driver.getTitle().endsWith("Demo Web Shop. Electronics")) {
			Reporter.log("Electronics page is displayed",true);
		}
		else {
			Reporter.log("Electronics page is not displayed",true);
		}
	}

}
