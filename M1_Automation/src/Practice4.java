import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice4 {
	public static void main(String[]args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(10000);
		driver.findElement(By.id("PopUp")).click();
		String childid = driver.getWindowHandle();
		Set<String> parentid = driver.getWindowHandles();
		parentid.remove(childid);
		for (String Windowid:parentid) {
			driver.switchTo().window(Windowid);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
		}
		driver.switchTo().window(childid);
		driver.findElement(By.name("start")).click();
		driver.close();
		
	}

}
