package com.rameshsoft.automation.seleniumcore;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesCountTest {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "D:\\may7am2023\\demo\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.adp.com");
	
	List<WebElement> elements = driver.findElements(By.cssSelector("*"));
	System.out.println("Total Noof elements are: "+elements.size());
	
	int frameCount = 0;
	
	for(WebElement webElement : elements)
	{
		String actualTagName = webElement.getTagName();
		if (actualTagName.equalsIgnoreCase("iframe")) {
			frameCount++;
			String idValue = webElement.getAttribute("id");
			String nameValue = webElement.getAttribute("name");
			String srcValue = webElement.getAttribute("src");
			String classValue = webElement.getAttribute("class");
			System.out.println("frame id is: "+idValue);
			System.out.println("frame name is: "+nameValue);
			System.out.println("frame src is: "+srcValue);
			System.out.println("frame class is: "+classValue);
			System.out.println("***********************************");
		}
	}
	
	System.out.println("Noof frames are: "+frameCount);
	
	
	Thread.sleep(4000);
	driver.close();
	
	
	
	
	
	
	
	
}
}
