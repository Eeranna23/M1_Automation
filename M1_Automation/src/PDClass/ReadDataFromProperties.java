package PDClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//STEP cfreate fileinputstream object
		FileInputStream fis = new FileInputStream("./TestData/Data.properties");
		// step 2  create respective file type object
		
		Properties prop = new Properties();
		//step 3  call read methods
		prop.load(fis);
		String url = prop.getProperty("url");
		System.out.println(url);
		
		// load email
		String email = prop.getProperty("email");
		System.out.println(email);
		
		//load password
		String pass = prop.getProperty("password");
		System.out.println(pass);
		
		// login to browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		
		
		

	}

}
