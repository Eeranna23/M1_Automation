package SelliniumLaunchBrowser;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shoppersstack.com/products_page/23/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.id("compare")).click();
		Set<String> wids = driver.getWindowHandles();
		System.out.println(wids);

	}

}
