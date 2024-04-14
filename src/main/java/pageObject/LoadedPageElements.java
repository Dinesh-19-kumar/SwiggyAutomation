package pageObject;

public interface LoadedPageElements {

	String searchButton = "//a[@href='/search']";

	String searchBar = "//input[@placeholder='Search for restaurants and food']";

	String sortOpt = "//span[contains(text(),'Dishes')]";

	String dish = "//p[@class='ScreenReaderOnly_screenReaderOnly___ww-V']";

	String selectRest = "//div[contains(text(),'A2B - Adyar Ananda Bhavan')]";

	String menuBar = "//div[text()='MENU']";

}
