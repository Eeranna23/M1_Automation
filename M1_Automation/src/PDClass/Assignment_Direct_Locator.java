package PDClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_Direct_Locator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Create an Account")).click();
		driver.findElement(By.id("firstname")).sendKeys("Eeranna");
		driver.findElement(By.id("lastname")).sendKeys("Shankar");
		driver.findElement(By.id("email_address")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Abcd@1234");
		driver.findElement(By.id("password-confirmation")).sendKeys("Abcd@1234");
		Thread.sleep(2000);
		//USING Xpath by attribute
		driver.findElement(By.xpath("//button[@title='Create an Account']")).click();
		Thread.sleep(2000);
		
		
		

	}

}
