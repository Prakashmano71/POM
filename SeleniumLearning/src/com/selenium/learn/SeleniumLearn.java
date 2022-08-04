package com.selenium.learn;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class SeleniumLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\moosu\\Downloads\\geckodriver-v0.31.0-win32\\geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
    
    driver.get("https://www.amazon.in/?tag=admpdesktopin-21&ref=pd_sl_aFC2650EA07B443E926F75DA1B");
    
    driver.findElement(By.linkText("Mobiles")).click();
    
   
    
	}

}
