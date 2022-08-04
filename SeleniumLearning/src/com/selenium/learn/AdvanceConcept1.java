package com.selenium.learn;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdvanceConcept1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\moosu\\Downloads\\geckodriver-v0.31.0-win32\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.leafground.com/pages/Window.html");
		
		String oldWindow = driver.getWindowHandle();
		
		WebElement Window = driver.findElement(By.id("home"));
		
		Window.click();
		
		Set<String> handles = driver.getWindowHandles();
		
		 for (String newWindow : handles) {
			 
			 driver.switchTo().window(newWindow);
			
		}
		 
		WebElement editBox = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[3]/a"));
		
		editBox.click();
		
		driver.close();
		
		driver.switchTo().window(oldWindow);
		
		
	 
		
		
		}

}
