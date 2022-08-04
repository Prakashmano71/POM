package com.selenium.learn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExample {
	
	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.chrome.driver" , "E:\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.leafground.com/pages/radio.html");
	
	WebElement Unchecked = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input[1]"));
	
    boolean Status1 =	Unchecked.isSelected();
    
    WebElement Checked = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input[2]"));
	
    boolean Status2 =	Checked.isSelected();		
	
    System.out.println(Status1);
    System.out.println(Status2);
    
	}

}
