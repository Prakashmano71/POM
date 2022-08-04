package pageobjectmodel;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginimplementation {
	
	
	public static WebElement username(WebDriver driver) {
	      return driver.findElement(By.id("txtUsername"));	
		
	}
	
	public static  WebElement password(WebDriver driver) {
		return driver.findElement(By.id("txtPassword"));
		
	}
	
	public static WebElement login(WebDriver driver) {
		return driver.findElement(By.id("btnLogin"));
		
		
	}
	public static WebElement myInfo(WebDriver driver) {
          return driver.findElement(By.linkText("My Info"));
	}
	public static WebElement details(WebDriver driver) {
		return driver.findElement(By.id("btnSave"));
		
	}
	
	
	
	public static WebElement nickname(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\'personal_txtEmpNickName\']"));
	}

}
