package assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UtilizeDataFromDataStorage {
	@Test(dataProviderClass = DataStorage.class, dataProvider = "registerdata")
	public void login(String[] cred) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.id("user-name")).sendKeys(cred[0]);
		driver.findElement(By.id("password")).sendKeys(cred[1]);

}
}
