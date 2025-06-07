package SelliniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxesPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		//preceding sibling
		driver.findElement(By.xpath("//a[@id='lenovo']/preceding-sibling::a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		//following sibling
		driver.findElement(By.xpath("//a[@id='lenovo']/following-sibling::a")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
