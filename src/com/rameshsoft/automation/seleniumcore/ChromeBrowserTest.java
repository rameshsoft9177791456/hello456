package com.rameshsoft.automation.seleniumcore;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


public class ChromeBrowserTest {

	public static void main(String[] args) throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver", "D:\\may7am2023\\demo\\Drivers\\chromedriver.exe");
	//ChromeDriver driver = new ChromeDriver();
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.get("https://www.gmail.com");
	
	String actualTitle = driver.getTitle();
	System.out.println("Title is: "+actualTitle);
	
	String curUrl = driver.getCurrentUrl();
	System.out.println("Current url is: "+curUrl);
	
	String curWindow = driver.getWindowHandle();
	System.out.println("Current window name is: "+curWindow);
	
	//1. identify the element
	WebElement un = driver.findElement(By.id("identifierId"));
	
	if (un.isDisplayed()&&un.isEnabled()) {
		//2. perform the action
		un.clear();
		un.sendKeys("rameshsoft.9177791456@gmail.com");
	}
	else {
		//throw the exception
		System.out.println("UserName is not displayed & enabled");
	}
	
	
	//1. identify the element
	WebElement nxt = driver.findElement(By.id("identifierNext"));
	
	if (un.isDisplayed()) {
		if (un.isEnabled()) {
			//2. perform the action
			un.clear();
			un.sendKeys("rameshsoft.9177791456@gmail.com");
		}
		else {
			//throw the exception
			System.out.println("UserName is not displayed");
		}
	}
	else {
		//throw the exception
		System.out.println("UserName is not enabled");
	}
	
	//2. perform the action
	nxt.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	Thread.sleep(5000);
	driver.close();
	
	
	
}
}
