import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import SelliniumLaunchBrowser.Manage;

public class Mock_practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shoppersstack.com/products_page/17");
		driver.manage().window().maximize();
//		driver.manage().window().minimize();
//		driver.manage().window().fullscreen();
//		driver.navigate().to("https://www.amazon.in/");
//		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(10000);
		driver.findElement(By.id("compare")).click();
		String parentid = driver.getWindowHandle();
		 Set<String> childid = driver.getWindowHandles();
		 childid.remove(parentid);
		 for (String window:childid)
		 {
			 driver.switchTo().window(window);
			 driver.close();
			 Thread.sleep(2000);
			 
		 }
		 driver.switchTo().window(parentid);
		 driver.close();
		 
	}

}
