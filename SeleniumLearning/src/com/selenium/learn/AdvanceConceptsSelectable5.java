package com.selenium.learn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AdvanceConceptsSelectable5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", "F:\\gallery\\drivers for selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/selectable.html");
		
		List<WebElement> selectable = driver.findElements(By.xpath("//*[@id=\'selectable\']/li"));
		
	    /*Actions multiSelect = new Actions(driver);
		multiSelect.keyDown(Keys.CONTROL)
		.click(selectable.get(0))
		.click(selectable.get(1))
		.click(selectable.get(2))*/
		
		
		Actions multiSelect = new Actions(driver);
		multiSelect.clickAndHold(selectable.get(0));
		multiSelect.clickAndHold(selectable.get(1));
		multiSelect.clickAndHold(selectable.get(2));
		multiSelect.build().perform();
		
		

	}

}
