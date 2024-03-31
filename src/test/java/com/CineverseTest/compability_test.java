package com.CineverseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.CineverseBase.Base;

public class compability_test extends Base {
		
	@Test
	public void Compability_test() throws InterruptedException {
		WebElement liveTv= driver.findElement(By.xpath(prop.getProperty("livetv")));
		liveTv.click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		WebElement Movies= driver.findElement(By.xpath(prop.getProperty("Movies")));
		Movies.click();
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		WebElement Shows= driver.findElement(By.xpath(prop.getProperty("Movies")));
		Shows.click();
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().back();
		
		
	}
	

}
