package com.selenium.learn;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlingAdvancedSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\gallery\\drivers for selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Window.html");
		

		String oldWindow =driver.getWindowHandle();

		WebElement openWindow = driver.findElement(By.id("home"));
		openWindow.click();

		Set<String> newWindow = driver.getWindowHandles();

		for (String access : newWindow) {

			driver.switchTo().window(access);

		}

		WebElement openBox = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img"));

		openBox.click();

		driver.close();

		driver.switchTo().window(oldWindow);

		WebElement multipleWindows = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));

		multipleWindows.click();

		int numberOfWindows = driver.getWindowHandles().size();

		System.out.println("number of windows opened :" + numberOfWindows);

		WebElement openOnlyOne = driver.findElement(By.id("color"));

		openOnlyOne.click();

		Set<String> MultiOpen = driver.getWindowHandles();

		for (String allWindow : MultiOpen) {

			if(!allWindow.equals(oldWindow)) {

				driver.switchTo().window(allWindow);

				driver.close();
			}
		}

		driver.quit();





  


	}

}
