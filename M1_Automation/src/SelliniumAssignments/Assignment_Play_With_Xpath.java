package SelliniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_Play_With_Xpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[(@alt='Hero Hoodie')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("option-label-size-143-item-170")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("option-label-color-93-item-53")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("product-addtocart-button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='action showcart']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Remove item']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'OK')]")).click();
		driver.quit();
	}

}
