package com.selenium.learn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AdvanceConceptsDroppable {

	public static void main(String[] args) {
		
	// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", "F:\\gallery\\drivers for selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/drop.html");
		
		WebElement from = driver.findElement(By.id("draggable"));
		WebElement to = driver.findElement(By.id("droppable"));
		
		Actions doActions = new Actions(driver);
		
		//1st way for drag and drop
		doActions.clickAndHold(from).moveToElement(to).release().build().perform();
		
		
		//2nd way for drag and drop
		doActions.dragAndDrop(from, to).build().perform();

	}

}
