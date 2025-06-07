package PDClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithDirectorLocatores {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		//locate register button
		driver.findElement(By.linkText("Register")).click();
		//fill the details
		// send key method is used to pass the data and click key method is used to click the button
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Eeranna");
		driver.findElement(By.id("LastName")).sendKeys("Shankar");
		driver.findElement(By.id("Email")).sendKeys("eerannashankar@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Abcd@123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Abcd@123");
		Thread.sleep(2000);
		driver.findElement(By.id("register-button")).click();
		// try post registor click on electronics
		driver.findElement(By.partialLinkText("Electronics")).click();
		Thread.sleep(2000);
		driver.quit();
		
		
		
		

	}

}
