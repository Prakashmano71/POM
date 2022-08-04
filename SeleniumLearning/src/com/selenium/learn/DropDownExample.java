package com.selenium.learn;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDownExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver" , "C:\\Users\\moosu\\Downloads\\geckodriver-v0.31.0-win32\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.leafground.com/pages/Dropdown.html");

		WebElement Selectone = driver.findElement(By.id("dropdown1"));

		Select pleaseSelect = new Select(Selectone);

		pleaseSelect.selectByIndex(2);

		WebElement selectText = driver.findElement(By.name("dropdown2"));

		Select TextSelect = new Select (selectText);

		TextSelect.selectByVisibleText("Selenium");

		WebElement selectText1 = driver.findElement(By.name("dropdown3"));

		Select TextSelect2 = new Select (selectText1);

		TextSelect2.selectByValue("3");
		
		List<WebElement> numberOfOptions = TextSelect2.getOptions();
		
		int findSize = numberOfOptions.size();
		
		System.out.println("find the number of elements : " + findSize);
		
		WebElement enterText = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/select"));
		
		enterText.sendKeys("Loadrunner");
		
		WebElement multiSelect = driver.findElement
				(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		
		Select multiSelectBox = new Select(multiSelect);
		
		multiSelectBox.selectByIndex(1);
		multiSelectBox.selectByIndex(2);
		multiSelectBox.selectByIndex(4);
		
		



	}
}
