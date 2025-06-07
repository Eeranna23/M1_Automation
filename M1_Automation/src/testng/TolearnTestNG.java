package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TolearnTestNG {
	@Test
	public void demo() {
		Reporter.log("Welcome to TestNG",true);
	}
}
