package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AnnotationAttributesThreadPoolSize {
	@Test(priority =  1, invocationCount = 4, threadPoolSize = 2)
	public void register() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		Reporter.log("register testcase executed",true);
	}
	@Test(priority = 2, invocationCount = 0)
	public void login() {//testcase
		//test steps
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		Reporter.log("login testcase executed",true);
		
		
	}
}
