package PDClass;

import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T0CloseEbayChildWindow {
	//shopper’s stack-- to close only ebay child window

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/24");
		Thread.sleep(10000);
		driver.findElement(By.id("compare")).click();
		String parentid = driver.getWindowHandle();
		Set<String> allwindowsid = driver.getWindowHandles();
		allwindowsid.remove(parentid);
		for (String window:allwindowsid) {
			driver.switchTo().window(window);
			
			String tittle = driver.getTitle();
			System.out.println(tittle);
			if(tittle.contains("eBay")) {
				driver.close();
				Thread.sleep(3000);
			}
			driver.switchTo().window(parentid);
			driver.close();
		}
		

		
	}

}
