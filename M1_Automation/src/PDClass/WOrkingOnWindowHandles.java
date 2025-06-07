package PDClass;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WOrkingOnWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.id("PopUp")).click();
		Thread.sleep(2000);
		String parentwindow = driver.getWindowHandle();
		Set<String> childwindow = driver.getWindowHandles();
		System.out.println(parentwindow);
		System.out.println(childwindow);
		
		for ( String id : childwindow) {
			driver.switchTo().window(id);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
		}
		driver.switchTo().window(parentwindow);
		driver.findElement(By.name("Start")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}
