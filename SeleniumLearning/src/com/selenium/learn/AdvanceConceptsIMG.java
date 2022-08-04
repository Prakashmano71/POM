package com.selenium.learn;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceConceptsIMG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "F:\\gallery\\drivers for selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Image.html");
		
		//String oldWindow=driver.getWindowHandle();
		
		WebElement imageOpen =driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/img"));
        
		imageOpen.click();
		
		//Set<String> allWindows = driver.getWindowHandles();
		
		WebElement imageWindow = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[4]/a/img"));
		
		imageWindow.click();
		
		WebElement brokenImage=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/img"));
		
		if(brokenImage.getAttribute("naturalWidth").equals("0")) {
			System.out.println("this image is broken");
		}
		else {
			System.out.println("this image is not broken");
		}
		}
			
		
		
	
}
