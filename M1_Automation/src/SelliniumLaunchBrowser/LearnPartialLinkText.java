package SelliniumLaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnPartialLinkText {

	
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.get("https://demowebshop.tricentis.com/");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.findElement(By.partialLinkText("Apparel ")).click();
			Thread.sleep(2000);
			

	}

}
