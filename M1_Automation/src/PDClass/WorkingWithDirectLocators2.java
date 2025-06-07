package PDClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithDirectLocators2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//driver.findElement(By.className("button-1 search-box-button"));
		//we will get exception as "org.openqa.selenium.InvalidSelectorException"
		driver.findElement(By.tagName("input")).click();
		Thread.sleep(2000);
		// it will click somewhere because of multiple input now find how many input files are there
		//in home page
		List<WebElement> tn = driver.findElements(By.tagName("input"));
		//Checking from Github
		System.out.println(tn.size());
		driver.quit();
		

	}

}
