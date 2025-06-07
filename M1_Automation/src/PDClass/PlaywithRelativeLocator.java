package PDClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class PlaywithRelativeLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//launch
		driver.get("https://demowebshop.tricentis.com/");
		//add search value
		WebElement ref1 = driver.findElement(By.id("newsletter-email"));
		//enter search content
		driver.findElement(By.id("newsletter-email")).sendKeys("abcd@gmail.com");
		//click on subscribe 
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(ref1)).click();
		Thread.sleep(3000);
		driver.quit();
		

	}

}
