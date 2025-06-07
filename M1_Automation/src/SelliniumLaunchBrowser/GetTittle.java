package SelliniumLaunchBrowser;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTittle {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//Launch the url
		driver.get("https://www.flipkart.com/");
		//tittle
		String tittle = driver.getTitle();
		System.out.println (tittle);
		// verify home page
		if (tittle.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!")){
			System.out.println("Home page is displayed");
		}
		else {
			System.out.println("Home page is not displayed");
		}
		
			
		}
	}


