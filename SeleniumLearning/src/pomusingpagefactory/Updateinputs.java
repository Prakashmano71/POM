package pomusingpagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Updateinputs {
	@Test
	public void updatedemo(){
		System.setProperty("webdriver.chrome.driver", "F:\\gallery\\drivers for selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	
	PageFactory.initElements(driver, LoginImplementation.class);
	
	LoginImplementation.username.sendKeys("Admin");
	LoginImplementation.password.sendKeys("admin123");
	LoginImplementation.login.click();
	PageFactory.initElements(driver,UpdateImplementation.class);
	
	UpdateImplementation.myInfo.click();
	UpdateImplementation.contactDetails.click();
	UpdateImplementation.editButton.click();
	UpdateImplementation.city.clear();
	UpdateImplementation.city.sendKeys("chennai");
	UpdateImplementation.saveButton.click();
}
	
	}
