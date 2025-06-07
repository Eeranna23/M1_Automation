package listeners;

import java.io.File;
import java.io.IOException;
import java.time.LocalTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImplementation extends BaseClass implements ITestListener{

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test script is pass",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String time = LocalTime.now().toString().replace(":", "-"); //to capute system date and time
		String methodname = result.getName(); // to capture running method name
		
		Reporter.log("Test script is failed",true);
		TakesScreenshot ts =  (TakesScreenshot) driver;
		File temp =ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/"+methodname+time+".png");
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("Test script is skipped",true);
	}
	

}
