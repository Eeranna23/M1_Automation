package assertion;

import org.testng.annotations.DataProvider;

public class DataStorage {
	@DataProvider
	public String[][] dataSender(){
		String[][] data = {{"admin","admin"},{"admin","ad"},{"ad","admin"},{"ad","ad"}};
		return data;

}
	@DataProvider
	public String[][] registerdata(){
		String[][] data = {{"admin","admin"},{"admin","ad"},{"ad","admin"},{"ad","ad"}};
		return data;
}
	@DataProvider
	public String[][] logindata(){
		String[][] data = {{"admin","admin"},{"admin","ad"},{"ad","admin"},{"ad","ad"}};
		return data;
	
}
	
}
