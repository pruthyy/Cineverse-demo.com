package com.CineverseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.CineverseBase.Base;

public class UITest extends Base {
	
	@Test (priority = 1)
	public void verify_the_FrontBannerUI_of_HomePage_TC_007() throws InterruptedException {	
	WebElement HomeBanner=	driver.findElement(By.xpath(prop.getProperty("HomeBanner")));
	org.openqa.selenium.Dimension size = HomeBanner.getSize();
	int width = size.getWidth();
	int height = size.getHeight();
	 // Verify the size of the element
    int expectedWidth = 1525; // Example: set your expected width
    int expectedHeight = 444; // Example: set your expected height
	
	System.out.println("Width"+width);
	System.out.println("Height"+height);
	Assert.assertEquals(size.getWidth(), expectedWidth);
    Assert.assertEquals(size.getHeight(), expectedHeight);
	}
	@Test (priority = 2)
	public  void verify_the_company_Logo_TC_008() {
		
	WebElement HomeCompanyLogo=	driver.findElement(By.xpath(prop.getProperty("HomeCompanyLogo")));
	org.openqa.selenium.Dimension size = HomeCompanyLogo.getSize();
	int width = size.getWidth();
	int height = size.getHeight();
	int expectedWidth = 155; 
    int expectedHeight = 50;
    System.out.println("Width"+width);
	System.out.println("Height"+height);
	Assert.assertEquals(size.getWidth(), expectedWidth);
    Assert.assertEquals(size.getHeight(), expectedHeight);
		
		
		
	}
}
