package PDClass;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayWithNavigate {
	public static void main (String[] args) throws MalformedURLException, InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dunzo.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://in.bookmyshow.com/");
		Thread.sleep(2000);
		/// it is deplicated
		driver.navigate().to(new URL("https://www.wonderla.com/"));
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
