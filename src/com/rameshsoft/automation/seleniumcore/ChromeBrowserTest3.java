package com.rameshsoft.automation.seleniumcore;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


public class ChromeBrowserTest3 {

	public static void main(String[] args) throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver", "D:\\may7am2023\\demo\\Drivers\\chromedriver.exe");
	//ChromeDriver driver = new ChromeDriver();
	
	RemoteWebDriver driver = new ChromeDriver();
	//WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.gmail.com");
	
	//1. identify the element
	//WebElement un = driver.findElement(By.id("identifierId"));
	//WebElement un = driver.findElement(By.ById.id("identifierId"));
	WebElement un = driver.findElementById("identifierId");
	
	//2. perform the action
	un.clear();
	un.sendKeys("rameshsoft.9177791456@gmail.com");
	
	//1. identify the element
	//WebElement nxt = driver.findElement(By.id("identifierNext"));
	//WebElement nxt = driver.findElement(By.ById.id("identifierNext"));
	WebElement nxt = driver.findElementById("identifierNext");
	
	//2. perform the action
	nxt.click();
	
	Thread.sleep(5000);
	driver.close();
	
	
	
}
}
