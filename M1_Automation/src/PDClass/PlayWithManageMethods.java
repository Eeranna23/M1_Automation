package PDClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayWithManageMethods {

	public static void main(String[] args) throws InterruptedException {
		//launch url
		WebDriver driver = new ChromeDriver();
		//play with manage actions
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		driver.quit();
		

	}

}
