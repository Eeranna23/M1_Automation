package SelliniumAssignments;

import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_windowhandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(10000);
		driver.findElement(By.id("men")).click();
		driver.findElement(By.xpath("//span[contains(text(),'crocs')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("compare")).click();
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);
		Set<String> allwindowid = driver.getWindowHandles();
		System.out.println(allwindowid);
		allwindowid.remove(parentId);
		for (String window:allwindowid) {
			driver.switchTo().window(window);
			driver.close();
			Thread.sleep(2000);
		}
		driver.switchTo().window(parentId);
		
		String current = driver.getCurrentUrl();
		System.out.println(current);
		driver.close();
		

	}

}
