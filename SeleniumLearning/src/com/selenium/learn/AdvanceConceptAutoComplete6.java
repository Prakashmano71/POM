package com.selenium.learn;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.jodah.failsafe.Timeout;

public class AdvanceConceptAutoComplete6 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "F:\\gallery\\drivers for selenium\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://www.leafground.com/pages/autoComplete.html");
			
		    WebElement input = driver.findElement(By.id("tags"));
		    
		    input.sendKeys("s");
		    
		    driver.manage().timeouts().implicitlyWait (2 , TimeUnit.SECONDS);
		    
		    List<WebElement> selectto = driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
		    
		    System.out.println(selectto.size());
		    
             for (WebElement selectpanrom : selectto) {
		    	
		    	if(selectpanrom.getText().equals("Web Services")) {
		    		
		    		selectpanrom.click();
		    		break;
		    	}
				
			}
		    
		   
		    
		   
		    
		    

	}

}
