package com.rameshsoft.automation.seleniumcore;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {
public static void main(String[] args) throws MalformedURLException, InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver", "D:\\may7am2023\\demo\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.get("https://www.gmail.com");
	//driver.navigate().to("https://www.gmail.com");
	//driver.navigate().to(new URL("https://www.gmail.com"));
	/*Navigation navigation = driver.navigate();
	navigation.to("https://www.gmail.com");*/
	//driver.findElement(By.id("identifierId")).clear();
	//driver.findElement(By.id("identifierId")).sendKeys("rameshsoft.9177791456@gmail.com");
		
	
	WebElement un = driver.findElement(By.id("identifierId"));
	//un.clear();
	//un.sendKeys("rameshsoft.9177791456@gmail.com");
	
	//Using JavaScriptExecutor
	
	Actions actions = new Actions(driver);
	//actions.sendKeys(un, "rameshsoft.9177791456@gmail.com").build().perform();
	
	actions.click(un).sendKeys("rameshsoft.9177791456@gmail.com").build().perform();
	/*Actions actions2 = actions.click(un);
	Actions actions3 = actions2.sendKeys("rameshsoft.9177791456@gmail.com");
	Action action = actions3.build();
	action.perform();*/
	
	WebElement nxt = driver.findElement(By.id("identifierNext"));
	//nxt.click();
	
	//actions.click(nxt).build().perform();
	//actions.doubleClick(nxt).build().perform();
	//actions.sendKeys(nxt, Keys.ENTER).build().perform();
	//Using JavaScriptExecutor
	
	actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.HOME).build().perform();
	actions.sendKeys(Keys.HOME).sendKeys(Keys.END).build().perform();
	actions.sendKeys(Keys.HOME,Keys.END).build().perform();
	
	actions.sendKeys(Keys.ARROW_DOWN).build().perform();
	
	
	actions.sendKeys(Keys.chord(Keys.CONTROL),"s").build().perform();
	actions.sendKeys(Keys.chord(Keys.CONTROL),"a").build().perform();
	
	actions.sendKeys(Keys.chord(Keys.CONTROL,Keys.SHIFT),"s").build().perform();
	actions.sendKeys(Keys.chord(Keys.CONTROL,Keys.SHIFT),"a").build().perform();
	
	Thread.sleep(6000);
	
	driver.close();
	
	driver.get("https://www.amazon.in/");
	
	WebElement en = driver.findElement(By.xpath("//span[@class='nav-line-2']/div"));
	
	actions.moveToElement(en).build().perform();
	
	
	
}
}
