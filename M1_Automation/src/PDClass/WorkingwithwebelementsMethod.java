package PDClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithwebelementsMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		//launch
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("https://demowebshop.tricentis.com/")).click();
		Thread.sleep(3000);
		WebElement ref = driver.findElement(By.id("https://demowebshop.tricentis.com/"));
		///getter methods
		System.out.println(ref.getText());
		System.out.println(ref.getSize());
		System.out.println(ref.getLocation());
		System.out.println(ref.getCssValue("color"));
		System.out.println(ref.getTagName());
		
		
		
		

	}

}
