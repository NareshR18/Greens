package Maven.CucumberProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

public class AdactinhotelProject extends CucumberBase {
	
	public static void main(String[] args) throws IOException {
		
		Brow("chrome");
		url();	
		FileInputStream fis=new FileInputStream("C:\\Users\\nares\\eclipse-workspace\\CucumberProject\\src\\main\\java\\Maven\\CucumberProject\\AdactinHotel.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String uname = prop.getProperty("us");
		String pword = prop.getProperty("pw");
		
		PageFactory.initElements(driver, CucumberPOM.class);
		
		keys(CucumberPOM.username, uname);
		keys(CucumberPOM.password,pword);
		
		ck(login);
		
	}

	
}
