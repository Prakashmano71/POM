package com.selenium.learn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "F:\\gallery\\drivers for selenium\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://www.tamilpdfbooks.com/");
			
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().impl
		 
		 WebElement selectBook = driver.findElement(By.xpath("//img[@src= 'http://www.tamilpdfbooks.com/thumbs/1588903324.jpg']"));
		 
		 selectBook.click();
		 

	}

}
