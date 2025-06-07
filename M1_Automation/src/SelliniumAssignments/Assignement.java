package SelliniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//swiggy signup bn
public class Assignement {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.swiggy.com/auth");
	driver.findElement(By.linkText("create an account")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("mobile")).sendKeys("9874561230");
	driver.findElement(By.id("name")).sendKeys("Rishu");
	driver.findElement(By.id("email")).sendKeys("ee1234@gmail.com");
	Thread.sleep(2000);
}
}
