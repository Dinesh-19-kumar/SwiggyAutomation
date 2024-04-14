package test;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvents.DishCount;
import pageEvents.HomePageEvents;
import pageEvents.LoadedPageEvents;
import pageEvents.MenuPageEvents;

public class NewTest001 extends BaseTest {
	
	HomePageEvents homePage = new HomePageEvents();
	LoadedPageEvents loadedPage = new LoadedPageEvents();
	DishCount dishCoun = new DishCount();
	MenuPageEvents menuPage = new MenuPageEvents();
	
	
  @Test(priority=0)
  public void DishCount() {
	  
	  loadedPage.homePageLoaded();
	  homePage.clickSearchButton();
	  loadedPage.searchPageLoaded();
	  dishCoun.searchFood();
	  loadedPage.sortOptLoaded();
	  dishCoun.sortOpt();
	  loadedPage.dishPageLoaded();
	  dishCoun.countFood();
	  
  }
  
  @Test(priority=1)
  public void menuList() {
	  
	  loadedPage.homePageLoaded();
	  homePage.clickSearchButton();
	  loadedPage.searchPageLoaded();
	  menuPage.searchRest();
	  loadedPage.restPageLoaded();
	  menuPage.selectRestaurant();
	  loadedPage.menuPageLoaded();
	  menuPage.dishMenu();
  }
}
