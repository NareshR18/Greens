package Maven.CucumberProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CucumberBase extends CucumberPOM {
	public static WebDriver driver;
	public static void Brow(String a) {
		if (a.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\nares\\eclipse-workspace\\CucumberProject\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (a.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\nares\\eclipse-workspace\\CucumberProject\\driver\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
	}
	public static void url() {
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}
	public static void keys(WebElement ele, String val) {
		ele.sendKeys(val);
	}
	public static void ck(WebElement elem) {
		elem.click();
	}
	public static void wait(int i) {
		driver.manage().timeouts().implicitlyWait(i, TimeUnit.SECONDS);
	}
	public static void slp(int a) throws InterruptedException {
		Thread.sleep(a);
	}

	public static void quit() {
		driver.close();
	}

}
