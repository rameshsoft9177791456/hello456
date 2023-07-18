package com.rameshsoft.automation.seleniumadv;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExamTest2 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "D:\\may7am2023\\demo\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	
	driver.get("https://www.adp.com");
	
	int enabledCount = 0;
	int disCount = 0;
	
	//List<WebElement> list = driver.findElements(By.xpath("//*"));
	List<WebElement> list = driver.findElements(By.cssSelector("*"));
	System.out.println("Noof elements in adp.com page is: "+list.size());
	
	Iterator<WebElement> itr = list.iterator();
	while(itr.hasNext())
	{
		WebElement webElement = itr.next();
		if (webElement.isDisplayed()&&webElement.isEnabled()) {
			enabledCount++;
		}
		else {
			disCount++;
		}
	}
	
	System.out.println("enabled count is: "+enabledCount);
	System.out.println("disabled count is: "+disCount);
	
	driver.close();
	
		
}
}
