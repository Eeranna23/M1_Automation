package SelliniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithXpathBySurroundingPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//driver.findElement(By.partialLinkText("Gift Cards")).click();
		//Demowebshop choosing $100 giftcard’s add to cart
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='$100 Physical Gift Card']/../..//input[@value='Add to cart']")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
