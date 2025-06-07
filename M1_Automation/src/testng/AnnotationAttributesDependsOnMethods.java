package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AnnotationAttributesDependsOnMethods {
	@Test
	public void register() {
		WebDriver driver = new ChromeDriver();
		//driver.get("https://demowebshop.tricentis.com/register");
		driver.get("demowebshop.tricentis.com/register");// when not fully qualified url
		Reporter.log("register testcase executed",true);
	}
	@Test(dependsOnMethods = "register")
	public void login() {//testcase
		//test steps
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		Reporter.log("login testcase executed",true);
		
		// register testcase will fail and login testcase will pass
	}
}
