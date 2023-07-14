package com.rameshsoft.automation.seleniumadv;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTest {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "D:\\may7am2023\\demo\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
	
	driver.get("https://www.gmail.com");
	
	WebElement un = driver.findElement(By.id("identifierId"));
	
	WebDriverWait wait = new WebDriverWait(driver, 56);
	wait.until(ExpectedConditions.visibilityOf(un));
	
	wait.until(ExpectedConditions.attributeContains(By.id("identifierId"), "name", "identifier"));
	
	wait.until(ExpectedConditions.attributeContains(un, "type", "email"));
	
	wait.until(ExpectedConditions.elementToBeClickable(un));
	
	un.clear();
	un.sendKeys("rameshsoft.9177791456");
	
	
	
	
	
	
	
	
	
	
}
}
