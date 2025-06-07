import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver. manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
               //navigating to dream 11 page
		driver.get("https://www.dream11.com/");
		WebElement frame = driver.findElement(By.id("send-sms-iframe"));

               // identification of frame by id/name
		driver.switchTo().frame("send-sms-iframe");

               //identification of frame by index
                     driver.switchTo().frame(0);
                //identification of frame by webElement/element
                        driver.switchTo().frame(frame);

		driver.findElement(By.id("regEmail")).sendKeys("1234567890");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("youtube_img")).click();
		driver.quit();
		
	}


	}


