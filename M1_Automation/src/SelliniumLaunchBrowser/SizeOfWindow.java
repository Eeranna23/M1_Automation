package SelliniumLaunchBrowser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeOfWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		//System.out.println(size.getHeight() );
		//System.out.println(size.getWidth());
		//driver.close();
		driver.manage().window().setSize(new Dimension(400, 550));
		Thread.sleep(3000);
		driver.close();
		
		
		

	}

}
