package SelliniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LenovoLinkUsingXpathBySAxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		//Test automation BlogSpot – clicking on lenovo link using xpath by axes
		driver.findElement(By.xpath("//a[@id='apple']/following-sibling::a")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
