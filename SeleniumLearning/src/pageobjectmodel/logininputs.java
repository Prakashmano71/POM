package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class logininputs {
	
     @Test
	public void giveninput() {
		System.setProperty("webdriver.chrome.driver","F:\\gallery\\drivers for selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		loginimplementation.username(driver).sendKeys("Admin");
		loginimplementation.password(driver).sendKeys("admin123");
		loginimplementation.login(driver).click();
		loginimplementation.myInfo(driver).click();
		loginimplementation.details(driver).click();
		loginimplementation.nickname(driver).clear();
		loginimplementation.nickname(driver).sendKeys("gal");
		
		//driver.close();//		
	
	}
}
