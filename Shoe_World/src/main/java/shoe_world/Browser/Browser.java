package shoe_world.Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	public static WebDriver driver;
	
	public static void OpenWindow(){
		driver = new FirefoxDriver();
	}
	
	public static void CloseWindow(){
		driver.close();
	}	
}