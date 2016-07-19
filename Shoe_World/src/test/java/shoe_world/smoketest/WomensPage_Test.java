package shoe_world.smoketest;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import shoe_world.Browser.Browser;
import shoe_world.pages.WomenPage;

public class WomensPage_Test {

	@BeforeTest
	public void Init(){
		Browser.OpenWindow();		
	}
	
	@AfterTest
	public void CleanUp(){
		Browser.CloseWindow();
	}
	
	@Test
	public void IsAt_WomenPage(){
		WomenPage.GoTo();
		Assert.assertTrue(WomenPage.IsAt());
	}	
}