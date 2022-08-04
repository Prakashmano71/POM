package com.selenium.learn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceConceptsToolTip {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\gallery\\drivers for selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/tooltip.html");

		WebElement toolTip = driver.findElement(By.id("age"));

		String toolTipText =	toolTip.getAttribute("title");

		System.out.println(toolTipText);


	}

}
