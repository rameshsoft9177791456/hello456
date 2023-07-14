package com.rameshsoft.automation.seleniumcore;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo1 {
public static void main(String[] args) throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver", "D:\\may7am2023\\demo\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.get("https://jqueryui.com/");
	
	driver.findElement(By.linkText("Autocomplete")).click();
	
	List<WebElement> frames = driver.findElements(By.tagName("iframe"));
	System.out.println("Noof frames are: "+frames.size());
	
	//driver.switchTo().frame(0);
	//TargetLocator targetLocator = driver.switchTo();
	//targetLocator.frame(0);
	
	WebElement frame = driver.findElement(By.className("demo-frame"));
	driver.switchTo().frame(frame);
	
	driver.switchTo().frame("job");
	
	driver.findElement(By.id("tags")).sendKeys("JAVA");
	
	Thread.sleep(6000);
	driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*driver.findElement(By.name("q")).sendKeys("RAMESHSOFT");
	
	Actions actions = new Actions(driver);
	actions.sendKeys(Keys.ENTER).build().perform();
	
	WebElement element = driver.findElement(By.xpath("//h3[contains(text(),'No.1 JAVA Automation Training Institute')]"));
	
	//actions.contextClick(element).sendKeys(Keys.ARROW_DOWN).build().perform();
	//actions.contextClick(element).sendKeys(Keys.ARROW_DOWN).perform();
	//actions.contextClick(element).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
	actions.contextClick(element).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN).perform();
	*/
	
	
	
	
	
}
}
