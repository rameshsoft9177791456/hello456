package com.rameshsoft.automation.seleniumadv;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CollFwExam2 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "D:\\may7am2023\\demo\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.adp.com");
	
	WebElement jobDD = driver.findElement(By.id("job"));
	
	String actualTagName = jobDD.getTagName();
	if (actualTagName.equalsIgnoreCase("select")) {
		Select select = new Select(jobDD);
		List<WebElement> list = select.getOptions();
		List listDup = new ArrayList();
		
		Set set = new HashSet<>();
		for(int i=0; i<list.size(); i++)
		{
			WebElement element = list.get(i);
			String txt = element.getText();
			boolean status = set.add(txt);
			if (status) {
				;;;;;
			}
			else {
				listDup.add(txt);
			}
		}
		System.out.println("Removed duplicates are: "+listDup);
		System.out.println("After removed duplicates: "+set);
		
	}
	else {
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
