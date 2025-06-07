package PDClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//pre conditions
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//launch applications
		driver.get("https://www.facebook.com/");
		Actions action= new Actions(driver);
		WebElement un = driver.findElement(By.id("email"));
		un.sendKeys("abcd@gmail.com");
		WebElement password = driver.findElement(By.id("pass"));
		//copy user name
		action.keyDown(un, Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).perform();
		action.keyDown(password, Keys.CONTROL).sendKeys("v").perform();
		Thread.sleep(2000);
		WebElement eyeicon = driver.findElement(By.xpath("//div[@class='_9lsa']"));
		action.doubleClick(eyeicon).clickAndHold(eyeicon).release().perform();
		
		
	}

}
