package PDClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_Xpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.name("search_query")).sendKeys("tauba tauba");
		driver.findElement(By.xpath("//button[@title='Search']")).click();
		//driver.findElement(By.xpath("))
		Thread.sleep(2000);
		driver.findElement(By.xpath("//yt-formatted-string[starts-with(@aria-label,'Tauba Tauba | Bad Newz | Vicky Kaushal | Triptii Dimri |')]")).click();
		

	}

}
