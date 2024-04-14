/**
 * 
 */
package pageEvents;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import base.BaseTest;
import pageObject.HomePageElements;
import pageObject.LoadedPageElements;

/*
 * 
 */
public class DishCount extends BaseTest {
	

	public void searchFood() {

		WebElement ele = driver.findElement(By.xpath(HomePageElements.searchBar));
		ele.sendKeys("food",Keys.ENTER);
	}
	
	public void sortOpt() {
		
		WebElement ele = driver.findElement(By.xpath(HomePageElements.sortOpt));
		ele.click();
	}
	
	public void countFood() {
		
		List<WebElement> itemElements = driver.findElements(By.xpath(LoadedPageElements.dish));

        int vegItemCount = 0;
        int nonVegItemCount = 0;

        for (WebElement itemElement : itemElements) {

            if (itemElement.getText().contains("Veg Item")) {
                vegItemCount++;
            } else {
                nonVegItemCount++;
            }
        }
        
        System.out.println("Veg item count: " + vegItemCount);
        System.out.println("Non-veg item count: " + nonVegItemCount);
	}

}
