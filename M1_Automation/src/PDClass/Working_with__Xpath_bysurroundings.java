package PDClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with__Xpath_bysurroundings {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Gift Cards")).click();
		Thread.sleep(3000);
		//xpath surrounding
		driver.findElement(By.xpath("//a[contains(text(),'$50 Physical Gift Card')]/../..//input")).click();
		Thread.sleep(2000);

	}

}
