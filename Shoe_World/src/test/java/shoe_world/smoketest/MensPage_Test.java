package shoe_world.smoketest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import shoe_world.Browser.Browser;
import shoe_world.pages.MensPage;

public class MensPage_Test {

	@BeforeMethod
	public void Init(){
		Browser.OpenWindow();
	}
	
	@AfterMethod
	public void CleanUp(){
		Browser.CloseWindow();
	}
	
	@Test
	public void MensPageTest(){
		MensPage.GoTo();
		Assert.assertTrue(MensPage.IsAt());
	}	
}