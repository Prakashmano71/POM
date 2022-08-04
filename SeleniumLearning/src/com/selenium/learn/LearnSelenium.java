package com.selenium.learn;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class LearnSelenium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:\\gallery\\drivers for selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Prakashmano71"+Keys.ENTER);
        //driver.close();
	}

}
