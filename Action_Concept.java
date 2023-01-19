package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v106.webaudio.model.AutomationRate;
import org.openqa.selenium.interactions.Actions;

public class Action_Concept {
	
	 static WebDriver driver;
	 static Actions a;
	
public static void main(String[] args) throws InterruptedException {
	
	driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	a=new Actions(driver);      //  Actions a=new Actions();
	gmail();
	driver.navigate().to("http://www.greenstechnologys.com/");
	courses();
	Robotic();
	Automation();
	
}
public static void gmail() {
	WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
//	a.click().build().perform();
	a.click(gmail).build().perform();
//	a.contextClick().build().perform();
//	a.contextClick(gmail).build().perform();
//	a.doubleClick().build().perform();
//	a.doubleClick(gmail).build().perform();	
	
}
 public static void courses() {
	 
	 WebElement course = driver.findElement(By.xpath("//a[text()='COURSES']"));
	 a.moveToElement(course).build().perform();	 
	 String currentUrl = driver.getCurrentUrl();
	 System.out.println(currentUrl);
}
 public static void Robotic() {
	 
     WebElement robot = driver.findElement(By.xpath("//span[text()='Robotic Process Automation Training']"));
	 a.moveToElement(robot).build().perform();
}
public static void Automation() {
	
 	WebElement auto = driver.findElement(By.xpath("//span[text()='Automation Anywhere Training']"));
	a.moveToElement(auto).build().perform();
	a.click(auto).build().perform();
	
}

}

