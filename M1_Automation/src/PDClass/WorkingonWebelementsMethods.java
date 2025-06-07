package PDClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class WorkingonWebelementsMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//launch
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		//enter search field
		driver.findElement(By.id("small-searchterms")).sendKeys("Mobiles");
		Thread.sleep(3000);
		//clear
		driver.findElement(By.id("small-searchterms")).clear();
		Thread.sleep(3000);
		//enter search
		driver.findElement(By.id("small-searchterms")).sendKeys("electronics");
		Thread.sleep(3000);
		//submit and click
		WebElement ref = driver.findElement(By.id("small-searchterms"));
		driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(ref)).click();
		Thread.sleep(3000);
		//enter and submit
		//org.openqa.selenium.StaleElementReferenceException:
		driver.findElement(By.id("small-searchterms")).sendKeys("Mobiles");
		driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(ref)).submit();
		Thread.sleep(3000);
		driver.quit();
		

	}

}
