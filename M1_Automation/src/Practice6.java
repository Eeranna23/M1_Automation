import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Risha");
		driver.findElement(By.id("LastName")).sendKeys("Eeranna");
		driver.findElement(By.id("Email")).sendKeys("abcd1234@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Risha1234");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Risha1234");
		Thread.sleep(3000);
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(1000);
		driver.close();
	}

}
