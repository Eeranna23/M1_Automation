package SelliniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAutomationBlogsSpotPaginationCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[text()='Smartphone']/..//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//td[text()='Laptop']/..//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//td[text()='Tablet ']/..//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//td[text()='Smartwatch']/..//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//td[text()='Wireless Earbuds']/..//input[@type='checkbox']")).click();
		Thread.sleep(3000);
		driver.quit();

	}

}
