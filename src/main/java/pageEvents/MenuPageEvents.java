/**
 * 
 */
package pageEvents;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import base.BaseTest;
import pageObject.HomePageElements;
import pageObject.MenuPageElements;

/**
 * 
 */
public class MenuPageEvents extends BaseTest{

	public void searchRest() {

		WebElement ele = driver.findElement(By.xpath(HomePageElements.searchBar));
		ele.sendKeys("A2B-Adyar Ananda Bhavan",Keys.ENTER);
	}
	
	public void selectRestaurant() {

		WebElement ele = driver.findElement(By.xpath(MenuPageElements.selectRest));
		ele.click();
	}

	public void dishMenu() {

		List<WebElement> dishElements = driver.findElements(By.xpath("(//div[contains(@class,'sc-aXZVg kDrzID')])"));
		List<String> dishNames = new ArrayList<>();

		if (dishElements.size() == 0) {
		    System.out.println("No dish elements found");
		} else {
		    // Extract dish names
		    for (WebElement dishElement : dishElements) {
		        dishNames.add(dishElement.getText());
		    }
		    
		    // Sort dish names alphabetically
		    Collections.sort(dishNames);

		    // Print the sorted dish names
		    for (int i = 0; i < dishNames.size(); i++) {
		        System.out.println((i + 1) + ". " + dishNames.get(i));
		    }
		}

		System.out.println();
	}

}
