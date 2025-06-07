package SelliniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//Working of xpath by axes on demowebshop’s search text field and news letter’s subscribe button 
		driver.findElement(By.id("newsletter-email")).sendKeys("abcd@gmail.com");
		//clicking on newslater's subscribe button using following sibling
		driver.findElement(By.xpath("//div[@class='newsletter-email']/following-sibling::div")).click();
		Thread.sleep(3000);
		
		//entering text inside search text field using preceding sibling
		driver.findElement(By.xpath("//input[@value='Search']/preceding-sibling::input")).sendKeys("Books");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
