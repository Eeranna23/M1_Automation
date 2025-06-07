package SelliniumAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownsUSingSelectClasss {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize(); 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get(" https://testautomationpractice.blogspot.com/");
			WebElement animaldd = driver.findElement(By.id("animals"));
			 Select sel=new Select(animaldd);
				    
			  sel.selectByVisibleText("Cat");
			 sel.selectByValue("cheetah");
			 sel.selectByIndex(2);
			 Thread.sleep(1000);
			 sel.deselectByValue("cheetah");
			 Thread.sleep(1000);
			 sel.deselectByVisibleText("Deer");
			 Thread.sleep(1000);
			  sel.deselectByIndex(0);

	

}
}
