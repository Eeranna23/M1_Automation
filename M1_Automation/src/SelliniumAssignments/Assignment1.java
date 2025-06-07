package SelliniumAssignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		//triggger the main url
		driver.get("https://www.zeptonow.com/");
		//navigate to zomato
		driver.get("https://www.zomato.com/");
		//navigate to domino's
		driver.get("https://www.dominos.co.in/store-locations/bangalore");
		//print tittle
	String tittle1	= driver.getTitle();
		System.out.println("tittle = " + tittle1);
		//get currrent url
		String CurrentURL1 = driver.getCurrentUrl();
		System.out.println("CurrentURL = " + CurrentURL1);
		

	}

}
