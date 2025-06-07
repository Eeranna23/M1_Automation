package SelliniumLaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnId {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.get("https://demowebshop.tricentis.com/");
	// to find element
	driver.findElement(By.id("small-searchterms")).sendKeys("Eeranna");
	Thread.sleep(3000);

	}

}
