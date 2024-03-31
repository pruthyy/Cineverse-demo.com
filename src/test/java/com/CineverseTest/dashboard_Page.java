package com.CineverseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.CineverseBase.Base;

public class dashboard_Page extends Base{
	
	@Test(priority = 1 , groups = {"smoke"})
	
	public void Verify_the_title_of_The_Home_Page_TC_001 () {
		
		String My_title= driver.getTitle();
		System.out.println("My title is "+My_title);
		Assert.assertTrue(My_title.contains("Your Ticket to a World of Entertainment Delights | On-Demand Content & Free Linear Channels"));
	}
	@Test (priority = 2)
	public void Verify_the_live_TV_button_is_clickable_or_nut_TC_002() throws InterruptedException {
		WebElement liveTv= driver.findElement(By.xpath(prop.getProperty("livetv")));
		Assert.assertTrue(liveTv.isDisplayed());
		liveTv.click();
		Thread.sleep(5000);
		//liveTv.getSize();
		String actualUrl="https://www.cineverse.com/livetv";
		String expectedUrl=driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
	}
	
	@Test(priority = 3, groups = {"smoke"})
	public void Verify_the_Movie_buttoon_TC_003() throws InterruptedException {
		
		WebElement movies= driver.findElement(By.xpath(prop.getProperty("Movies")));
		Assert.assertTrue(movies.isDisplayed());
		movies.click();
		Thread.sleep(5000);
		String actualUrl="https://www.cineverse.com/movies";
		String expectedUrl=driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
		
	}
	
	@Test(priority = 4)
	public  void verify_the_showsButton_TC_004() throws InterruptedException {
		 
	WebElement	showsButton= driver.findElement(By.xpath(prop.getProperty("showsButton")));
	Assert.assertTrue(showsButton.isDisplayed());
	showsButton.click();
	Thread.sleep(5000);
	String actualUrl="https://www.cineverse.com/shows";
	String expectedUrl=driver.getCurrentUrl();
	Assert.assertEquals(actualUrl, expectedUrl);
	}
	@Test(priority = 5)
	public void verify_the_genresButton_TC_005() throws InterruptedException {
		
		WebElement genresButton= driver.findElement(By.xpath(prop.getProperty("genresButton")));
		Assert.assertTrue(genresButton.isDisplayed());
		genresButton.click();
		Thread.sleep(7000);
		String actualUrl="https://www.cineverse.com/genres";
		String expectedUrl=driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
	}
	@Test(priority = 6, groups = {"smoke"})
	public void verify_the_watchlistButton_TC_006() throws InterruptedException {
	WebElement watchlist=	driver.findElement(By.xpath(prop.getProperty("Watchlist")));
	Assert.assertTrue(watchlist.isDisplayed());
	watchlist.click();
	Thread.sleep(5000);
	String actualUrl="https://www.cineverse.com/watchlist";
	String expectedUrl=driver.getCurrentUrl();
	Assert.assertEquals(actualUrl, expectedUrl);
	}
	
	

}
