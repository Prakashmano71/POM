package pomusingpagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginInputs {
	
	@Test
	public void inputsData() {
		
        System.setProperty("webdriver.chrome.driver","F:\\gallery\\drivers for selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		PageFactory.initElements(driver, LoginImplementation.class);
		
		LoginImplementation.username.sendKeys("Admin");
		LoginImplementation.password.sendKeys("admin123");
		LoginImplementation.login.click();
	}

}
