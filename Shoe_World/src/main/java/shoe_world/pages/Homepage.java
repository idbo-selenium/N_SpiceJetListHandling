package shoe_world.pages;

import shoe_world.Browser.Browser;

public class Homepage {

	public static void NavigateTo() {
		// TODO Auto-generated method stub
		Browser.driver.navigate().to("http://182.72.246.195:8088/");
	}

	public static boolean IsAt() {
		// TODO Auto-generated method stub
		return Browser.driver.getTitle().equals("ShoeFactory");
	}
}