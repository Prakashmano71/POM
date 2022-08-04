package com.selenium.learn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LearnTextbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\moosu\\Downloads\\geckodriver-v0.31.0-win32\\geckodriver.exe");
	
	WebDriver driver = new FirefoxDriver();
	
	driver.get("http://www.leafground.com/pages/Edit.html");
	
	WebElement emailBox = driver.findElement(By.id("email"));
	emailBox.sendKeys("karpomjava@gmail.com");
	
	WebElement appendBox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input"));
     appendBox.sendKeys("Love Selenium");
     
     WebElement getTextBox = driver.findElement(By.name("username"));
     String value =getTextBox.getAttribute("value");
     System.out.println(value);
     
     WebElement getClearBox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div/div/input"));
     getClearBox.clear();
     
     WebElement findBox = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[5]/div/div/input"));
    boolean neevenum = findBox.isEnabled();
    System.out.println(neevenum);
	
	}

}
