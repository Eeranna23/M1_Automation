package PDClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Working_With_Auto_Suggestion {

	
		public static void main(String[] args) {
			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://www.amazon.in/");
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone");
			List<WebElement> opt = driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div"));
			for (WebElement ele:opt) {
				System.out.println(ele.getText());
			}

	}

}
