package com.selenium.learn;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","F:\\gallery\\drivers for selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		String newWindow = driver.getWindowHandle();
		
		driver.manage().window().maximize();
		
		WebElement closeButton = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		
		closeButton.click();
		
		Set<String> handles = driver.getWindowHandles();
		
	   driver.findElement(By.name("q")).sendKeys("electronics" + Keys.ENTER); 
	   
	   WebElement trimmerSearch = driver.findElement(By.xpath("//*[@id=\'container\']/div/div[3]/div[1]/div[2]/div[2]/div/div[2]/div/a[2]"));
	   
	   trimmerSearch.click();
		
		
		
		
		
		
		
	}

}
