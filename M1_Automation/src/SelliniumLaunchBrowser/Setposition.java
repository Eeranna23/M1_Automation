package SelliniumLaunchBrowser;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setposition {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		Point res = driver.manage().window().getPosition();
		System.out.println(res);
		//System.out.println(res.getY());
		//System.out.println(res.getX());
		Thread.sleep(3000);
		driver.manage().window().setPosition(new Point(5, 4) );
		Point res1 = driver.manage().window().getPosition();
		System.out.println(res1);
		driver.close();

	}

}
