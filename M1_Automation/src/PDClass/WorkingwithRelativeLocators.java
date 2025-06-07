package PDClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class WorkingwithRelativeLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//launch browser
		driver.get("https://demowebshop.tricentis.com/");
		//locate search
		WebElement ref = driver.findElement(By.xpath("//input[@value='Search']"));
		//relative locator
		driver.findElement(RelativeLocator.with(By.tagName("input")).toLeftOf(ref)).sendKeys("mobiles");
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
