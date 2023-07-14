package com.rameshsoft.automation.seleniumcore;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownsTest {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "D:\\may7am2023\\demo\\Drivers\\chromedriver.exe");
	//ChromeDriver driver = new ChromeDriver();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.get("https://www.facebook.com");
	
	WebElement dayDD = driver.findElement(By.id("day"));
	
	String actualTagName = dayDD.getTagName();
	if (actualTagName.equalsIgnoreCase("select")) {
		Select select = new Select(dayDD);
		select.selectByIndex(2);
		select.selectByValue("5");
		select.selectByVisibleText("26");
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		System.out.println("Noof selected options are: "+allSelectedOptions.size());
		WebElement firstOption = select.getFirstSelectedOption();
		System.out.println("First selected option is: "+firstOption.getText());
		List<WebElement> allOptions = select.getOptions();
		System.out.println("All drop down values are: "+allOptions.size());
	}
	else {
		List<WebElement> allOptions = driver.findElements(By.xpath("//*[@id='day']/option"));
		System.out.println("All drop down values are: "+allOptions.size());
		driver.findElement(By.xpath("//*[@id='day']/option[24]")).click();
	}
	
}
}
