import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("PopUp")).click();
		String parentid = driver.getWindowHandle();
		Set<String> allwindowid = driver.getWindowHandles();
		allwindowid.remove(parentid);
		for (String childwindow :allwindowid) {
			driver.switchTo().window(childwindow);
			driver.manage().window().maximize();
			driver.close();
			
		}
		System.out.println("I have close Child window");
			driver.switchTo().window(parentid);
			System.out.println("Now I am in Parent window");
			driver.findElement(By.name("start")).click();
			Thread.sleep(2000);
			driver.quit();
			
	}

}
