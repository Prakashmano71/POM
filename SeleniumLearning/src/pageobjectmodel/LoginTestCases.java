package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class LoginTestCases {
	
	@Test
	public void logindata() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\gallery\\drivers for selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		ChromeOptions chromeoptions = new ChromeOptions();
		chromeoptions.addArguments("--start-maximized");
		driver.get("https://www.phptravels.net/login");
		
		Logininfo.userName(driver).sendKeys("user@phptravels.com");
		Logininfo.passWord(driver).sendKeys("demouser");
		Thread.sleep(3000);
		Logininfo.submitButton(driver).click();
		Logininfo.myInfo(driver).click();
		Logininfo.contactDetails(driver).sendKeys("1261421");
		Logininfo.addressDetails(driver).click();
		
		driver.close();
		
	}

}
