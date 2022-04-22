package Maven.CucumberProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CucumberPOM  {
	
	
	@FindBy(name="username")
	public static WebElement username;
	
	@FindBy(id="password")
	public static WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	public static WebElement login;
	
	
	
	

}
