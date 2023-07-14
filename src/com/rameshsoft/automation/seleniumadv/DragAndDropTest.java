package com.rameshsoft.automation.seleniumadv;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "D:\\may7am2023\\demo\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.MINUTES);
	//driver.manage().timeouts().setScriptTimeout(5, TimeUnit.MINUTES);
	
	/*Options options = driver.manage();
	Timeouts timeouts = options.timeouts();
	timeouts.implicitlyWait(45, TimeUnit.SECONDS);*/
	
	driver.get("https://www.jqueryui.com");
	
	driver.findElement(By.linkText("Draggable")).click();
	
	driver.switchTo().frame(0);
	
	Thread.sleep(6000);
	
	WebElement draggable = driver.findElement(By.id("draggable"));
	Actions actions = new Actions(driver);
	actions.dragAndDropBy(draggable, 150, 150).build().perform();
	
	driver.switchTo().defaultContent();
	
	driver.findElement(By.linkText("Droppable")).click();
	
	driver.switchTo().frame(0);
	
	WebElement draggable1 = driver.findElement(By.id("draggable"));
	WebElement droppable1 = driver.findElement(By.id("droppable"));
	
	actions.dragAndDrop(draggable1, droppable1).build().perform();
	
	
	WebElement frameActEle = driver.switchTo().activeElement();
	System.out.println(frameActEle);
	
	driver.switchTo().defaultContent();
	
	WebElement mainWinActEle = driver.switchTo().activeElement();
	System.out.println(mainWinActEle);
	
	driver.close();
	
	
	
	
	
	
	
}
}
