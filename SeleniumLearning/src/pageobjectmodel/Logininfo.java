package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Logininfo {
	
	public static WebElement userName(WebDriver driver) {
	    	return driver.findElement(By.xpath("//*[@id=\'fadein\']/div[1]/div/div[2]/div[2]/div/form/div[1]/div/input"));
	}
 
    public static WebElement passWord(WebDriver driver) {
	         return driver.findElement(By.xpath("//*[@id=\'fadein\']/div[1]/div/div[2]/div[2]/div/form/div[2]/div[1]/input"));
    }

    public static WebElement submitButton(WebDriver driver) {
	         return driver.findElement(By.xpath("//*[@id=\'fadein\']/div[1]/div/div[2]/div[2]/div/form/div[3]/button"));
    }
	         
    public static WebElement myInfo(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\'fadein\']/div[1]/div/div[3]/ul/li[4]/a"));
	}
	
	public static WebElement contactDetails(WebDriver driver) {
		
		return driver.findElement(By.xpath("//*[@id=\'fadein\']/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[1]/table/tbody/tr[3]/td[3]/div/input"));
	}
	
	public static WebElement addressDetails(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\'fadein\']/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[3]/button"));
	}

	
	
}

