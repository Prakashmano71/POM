+package com.selenium.learn;

import java.io.File;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceConceptsGetFiles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\gallery\\drivers for selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.guru99.com/download-sample-test-case-template-with-explanation-of-important-fields.html");
		
		driver.manage().window().maximize();
		
		WebElement download = driver.findElement(By.xpath("//*[@id=\'post-738\']/div/div/p[3]/a"));
		
		download.click();
		
		Thread.sleep(3000);
		
		File getFile = new File("C:\\Users\\moosu\\Downloads");
		
		File[] totalFiles = getFile.listFiles();
		
		for (File output : totalFiles) {
			
			if(output.getName().equals("TestCaseTemplate.xls")) {
				
				System.out.println("file downloaded");
				
				break;
				
			}
				
			}
	}
}
		

	
