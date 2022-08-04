package pomusingpagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdateImplementation {
	
	@FindBy(linkText="My Info")
	public static WebElement myInfo;
	@FindBy(linkText="Contact Details")
	public static WebElement contactDetails;
	@FindBy(id="btnSave")
	public static WebElement editButton;
	@FindBy(name="contact[city]")
	public static WebElement city;
	@FindBy(id="btnSave")
	public static WebElement saveButton;
	
	
}
