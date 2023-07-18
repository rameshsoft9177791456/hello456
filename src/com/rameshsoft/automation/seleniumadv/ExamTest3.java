package com.rameshsoft.automation.seleniumadv;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExamTest3 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "D:\\may7am2023\\demo\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	
	driver.get("https://www.adp.com");
	
	int radioBtnsCount = 0;
	int chkBxsCount = 0;
	int ddCount = 0;
	
	//List<WebElement> list = driver.findElements(By.xpath("//*"));
	List<WebElement> list = driver.findElements(By.cssSelector("*"));
	System.out.println("Noof elements in adp.com page is: "+list.size());
	
	for(WebElement webElement : list)
	{
		String typeValue = webElement.getAttribute("type");
		if (typeValue!=null) {
			if (typeValue.equalsIgnoreCase("radio")) {
				radioBtnsCount++;
			}
			else if (typeValue.equalsIgnoreCase("checkbox")) {
				chkBxsCount++;
			}
		}
		
		String tagName = webElement.getTagName();
		if (tagName.equalsIgnoreCase("select")) {
			ddCount++;
		}
	}
	
	System.out.println("Radio button count is: "+radioBtnsCount);
	System.out.println("Check  box count is: "+chkBxsCount);
	System.out.println("Drop downs count is: "+ddCount);
	
	driver.close();
	
	
	
	
	
	
	
	
	
	
	
		
}
}
