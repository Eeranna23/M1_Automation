package PDClass;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//pre conditions
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//launch browser
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement simple = driver.findElement(By.id("alertBtn"));
		WebElement confirm = driver.findElement(By.id("confirmBtn"));
		WebElement promt = driver.findElement(By.id("promptBtn"));
		//clicking on simple alert button
		simple.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		
		// clicking on confirmaation button
		confirm.click();
		Thread.sleep(2000);
		Alert alert1 = driver.switchTo().alert();
		alert1.dismiss();
		
		//clicking on promt alert button
		promt.click();
		Thread.sleep(2000);
		Alert alert2 = driver.switchTo().alert();
		alert2.sendKeys("adfg");
		System.out.println(alert2.getText());
		alert2.dismiss();
		
		
		
		
		

	}

}
