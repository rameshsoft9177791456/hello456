package com.rameshsoft.automation.seleniumadv;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExamTest1 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "D:\\may7am2023\\demo\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	
	driver.get("https://www.adp.com");
	
	int adpCount = 0;
	int ADPCount = 0;
	
	List<WebElement> list = driver.findElements(By.xpath("//*"));
	System.out.println("Noof elements in adp.com page is: "+list.size());
	
	for(WebElement webElement : list)
	{
		String txt = webElement.getText(); //Pay role adp
		if (txt!=null) {
			/*if (txt.contains("adp") || txt.contains("ADP")) {
				adpCount++;
			}*/
			if (txt.contains("adp")) {
				adpCount++;
			}
			else if (txt.contains("ADP")) {
				ADPCount++;
			}
		}
	}
	
	System.out.println("adp count is: "+adpCount);
	System.out.println("ADP count is: "+ADPCount);
	
	driver.close();
	
		
}
}
