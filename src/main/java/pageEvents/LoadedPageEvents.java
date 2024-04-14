package pageEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import base.BaseTest;
import pageObject.LoadedPageElements;

public class LoadedPageEvents extends BaseTest {

	public void homePageLoaded() {

		WebElement searchButton = driver.findElement(By.xpath(LoadedPageElements.searchButton));


		Assert.assertNotNull(searchButton, "Search button is not displayed");
	}

	public void searchPageLoaded() {

		WebElement searchbar = driver.findElement(By.xpath(LoadedPageElements.searchBar));

		Assert.assertNotNull(searchbar, "Search bar is not displayed");
	}

	public void sortOptLoaded() {

		WebElement searchbar = driver.findElement(By.xpath(LoadedPageElements.sortOpt));

		Assert.assertNotNull(searchbar, "Search bar is not displayed");
	}

	public void dishPageLoaded() {

		WebElement searchbar = driver.findElement(By.xpath(LoadedPageElements.dish));

		Assert.assertNotNull(searchbar, "Search bar is not displayed");
	}

	public void restPageLoaded() {

		WebElement searchbar = driver.findElement(By.xpath(LoadedPageElements.selectRest));

		Assert.assertNotNull(searchbar, "Search bar is not displayed");
	}

	public void menuPageLoaded() {

		WebElement searchbar = driver.findElement(By.xpath(LoadedPageElements.menuBar));

		Assert.assertNotNull(searchbar, "Search bar is not displayed");
	}
}
