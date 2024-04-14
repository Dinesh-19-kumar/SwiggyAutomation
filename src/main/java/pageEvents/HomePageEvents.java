package pageEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseTest;
import pageObject.HomePageElements;

public class HomePageEvents extends BaseTest {

	public void clickSearchButton() {

		WebElement ele = driver.findElement(By.xpath(HomePageElements.searchButton));
		ele.click();

	}


}
