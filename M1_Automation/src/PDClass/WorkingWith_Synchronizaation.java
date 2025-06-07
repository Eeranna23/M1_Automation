package PDClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingWith_Synchronizaation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
		driver.findElement(By.id("reveal")).click();
		//driver.findElement(By.id("revealed")).sendKeys("Eers");
		//driver.get("https://www.flipkart.com/motorola-g85-5g-olive-green-128-gb/p/itm1c4b849213a0e?pid=MOBHY9PQMNCMDVCD&lid=LSTMOBHY9PQMNCMDVCDI6UUHQ&marketplace=FLIPKART&store=tyy%2F4io&spotlightTagId=default_BestsellerId_tyy%2F4io&srno=b_1_1&otracker=CLP_BannerX3&fm=organic&iid=61bb98f2-f22a-4d80-9eb8-f42f1c7a7549.MOBHY9PQMNCMDVCD.SEARCH&ppt=browse&ppn=browse&ssid=gkjc6v6ohc0000001743830969227");
		//driver.findElement(By.id("pincodeInputId")).sendKeys("123456");
		driver.findElement(By.id("revealed"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		

	}

}
