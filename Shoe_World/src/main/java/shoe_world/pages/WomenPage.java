package shoe_world.pages;

import org.openqa.selenium.By;

import shoe_world.Browser.Browser;

public class WomenPage {
	
	public static void GoTo() {
		// TODO Auto-generated method stub
		Homepage.NavigateTo();
		Browser.driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a")).click();
	}

	public static boolean IsAt() {
		// TODO Auto-generated method stub
		return Browser.driver.getTitle().equals("WOMEN - ShoeFactory");
	}	
}