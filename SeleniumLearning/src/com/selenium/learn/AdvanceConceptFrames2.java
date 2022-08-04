package com.selenium.learn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceConceptFrames2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\gallery\\drivers for selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/frame.html");
		
		driver.switchTo().frame(0);
		
		WebElement button1 = driver.findElement(By.id("Click"));
		button1.click();
		
		WebElement button2 = driver.findElement(By.id("Click"));
		String getInsideText = button2.getText();
	    System.out.println(getInsideText);
	    
	    driver.switchTo().defaultContent();
	    
	    driver.switchTo().frame(1);
	    driver.switchTo().frame("frame2");
	    
	    WebElement button3 = driver.findElement(By.id("Click1"));
	    button3.click();
	    
	    driver.switchTo().defaultContent();
	    
	   List<WebElement> noOfFrames = driver.findElements(By.tagName("iframe"));
	   
	   int totalFrames = noOfFrames.size();
	   
	   System.out.println(totalFrames);

	}

}
