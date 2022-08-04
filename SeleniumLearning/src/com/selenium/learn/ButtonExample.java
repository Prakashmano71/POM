package com.selenium.learn;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\moosu\\Downloads\\geckodriver-v0.31.0-win32\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.leafground.com/pages/Button.html");
		
		WebElement findPosition = driver.findElement(By.id("position"));
		Point point = findPosition.getLocation();
		int xvalue = point.getX();
		int yvalue = point.getY();
		System.out.println(" the x axis is : "  + xvalue );
		System.out.println(" the Y axis is : "  + yvalue );
		
		WebElement findColor = driver.findElement(By.id("color"));
		String color = findColor.getCssValue("background-color");
		System.out.println(color);
		
		WebElement findSize = driver.findElement(By.id("size"));
		int hieght = findSize.getSize().getHeight();
		int width = findSize.getSize().getWidth();
        System.out.println("find the Hieght :"+ hieght);
        System.out.println("find the width :"+ width);	
        
        WebElement goToHome = driver.findElement(By.id("home"));
        goToHome.click();
        
		
	}

}
