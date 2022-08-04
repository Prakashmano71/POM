package pomusingpagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;
import org.testng.annotations.Test;

public class LogicWithoutFindBy {
	public static WebElement txtUsername;
	public static WebElement txtPassword;
	public static WebElement btnLogin;

@Test
public void login(){
	System.setProperty("webdriver.chrome.driver", "F:\\gallery\\drivers for selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
	PageFactory.initElements(driver,LogicWithoutFindBy.class );
	
txtUsername.sendKeys("Admin");                                                                                           
txtPassword.sendKeys("admin123");
btnLogin.click();

}}
                                                                                                                                                                                                                                                                                                                                             