package com.CineverseBase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Base {
	
	public static WebDriver driver;
	public static Properties prop=new Properties();
	public static FileReader fr;
	
	@BeforeMethod
	
	public void main() throws IOException {
		
		fr = new FileReader(System.getProperty("user.dir") +"\\src\\test\\java\\com\\cineverseProperties\\prop.cineverse");
		prop.load(fr);
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter browser name");
//		String browser = sc.nextLine();
//	
//		
//		if (browser.equals("Chrome"))
//		{
//			driver= new ChromeDriver();
//		}
//		else if (browser.equals("Firefox"))
//		{
//			driver=new FirefoxDriver();
//		}else if (browser.equals("Edgedriver"))
//		{
//			driver=new EdgeDriver();
//		}
		  String browser = System.getProperty("browser");
	        if (browser == null || browser.isEmpty()) {
	            System.out.println("No browser specified. Defaulting to Chrome.");
	            browser = "Chrome";
	        }

	        switch (browser.toLowerCase()) {
	            case "chrome":
	                driver = new ChromeDriver();
	                break;
	            case "firefox":
	                driver = new FirefoxDriver();
	                break;
	            case "edge":
	                driver = new EdgeDriver();
	                break;
	          //  default:
	         //       throw new IllegalArgumentException("Unsupported browser: " + browser);
	        }
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get(prop.getProperty("URL"));
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.close();
	}
		
			}
		
		
