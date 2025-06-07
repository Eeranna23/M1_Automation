package PDClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		// step 1 create file inputstream object
		FileInputStream fis = new FileInputStream("./TestData/TestScriptsData.xlsx");
		// step 2 create respective file type object
		Workbook wb = WorkbookFactory.create(fis);
		//step 3 call read method
		String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(url);
		
	// email
		String email = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(email);
		
		//password
		String pass = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		System.out.println(pass);
		
		// fetch numbers
		
		double price = wb.getSheet("Sheet1").getRow(1).getCell(3).getNumericCellValue();
		System.out.println(price);
		
		// fetch boolean
		boolean status = wb.getSheet("Sheet1").getRow(1).getCell(4).getBooleanCellValue();
		System.out.println(status);
		
		//fetch date
		LocalDateTime date = wb.getSheet("Sheet1").getRow(1).getCell(5).getLocalDateTimeCellValue();
		System.out.println(date);
		// to fetch day month and year
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getMonth());
		System.out.println(date.getYear());
		
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
	}

}
