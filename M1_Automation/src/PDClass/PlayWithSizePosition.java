package PDClass;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayWithSizePosition {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		// play with size and position
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Dimension size = driver.manage().window().getSize();
		System.out.println("size = " + size);
		Point position = driver.manage().window().getPosition();
		System.out.println("position = " + position);
		//set position size
		driver.manage().window().setSize(new Dimension(120, 150));
		Thread.sleep(2000);
		driver.manage().window().setPosition(new Point(4, 4));
		Thread.sleep(2000);
		
	
		driver.manage().window().minimize();
		Thread.sleep(2000);
		Dimension size1 = driver.manage().window().getSize();
		System.out.println("size1 = " + size1);
		Point position1 = driver.manage().window().getPosition();
		System.out.println("position1 = " + position1);
		
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		Dimension size2 = driver.manage().window().getSize();
		System.out.println("size2 = " + size2);
		Point position2 = driver.manage().window().getPosition();
		System.out.println("position2 = " + position2);
		driver.quit();
		

	}

}
