import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement animalid = driver.findElement(By.id("animals"));
		Select sel= new Select(animalid);
		sel.selectByVisibleText("Cat");
		 sel.selectByValue("cheetah");
		 sel.selectByIndex(2);
		 Thread.sleep(1000);
		 sel.deselectByValue("cheetah");
		 Thread.sleep(1000);
		 sel.deselectByVisibleText("Deer");
		 Thread.sleep(1000);
		  sel.deselectByIndex(0);
			    
		  //sel.deselectAll();
			    
		  List<WebElement> allselopt = sel.getAllSelectedOptions();
		 for(WebElement opt:allselopt) {
			    	System.out.println(opt.getText());
			}
		 WebElement firstopt = sel.getFirstSelectedOption();
		  System.out.println(firstopt.getText());
		  List<WebElement> allopt = sel.getOptions();
		  for(WebElement opt1:allopt) {
			    	System.out.println(opt1.getText());
			    }
			    
			    
			}

		
	}


