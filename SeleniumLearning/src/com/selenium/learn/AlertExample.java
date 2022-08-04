package com.selenium.learn;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver" , "C:\\Users\\moosu\\Downloads\\geckodriver-v0.31.0-win32\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		WebElement AlertBox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/button"));
		
		AlertBox.click();
		
		Alert alert1 = driver.switchTo().alert();
		
		alert1.accept();
		
		WebElement AlertBox2 = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/button"));
		
		AlertBox2.click();
		
		Alert alert2 = driver.switchTo().alert();
		
		alert2.dismiss();
		
		WebElement AlertBox3 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		
		AlertBox3.click();
		
		Alert alert3 = driver.switchTo().alert();
		
		AlertBox3.sendKeys("TestLeaf Moosu");
		
         alert3.accept();
		
		
		
		
		
		

	}

}
