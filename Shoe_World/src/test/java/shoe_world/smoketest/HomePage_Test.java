package shoe_world.smoketest;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import shoe_world.Browser.Browser;
import shoe_world.pages.Homepage;

public class HomePage_Test {

	@BeforeTest
	public void Init(){
		System.out.println("It is in Init Method");
		Browser.OpenWindow();
	}
	
	@AfterTest
	public void CleanUp(){
		System.out.println("It is in CleanUp Method");
		Browser.CloseWindow();
	}
	
	@Test
	public void IsAt_HomePageTest(){
		System.out.println("Now it is in Test Method");
		Homepage.NavigateTo();
		Assert.assertTrue(Homepage.IsAt());
	}	
}