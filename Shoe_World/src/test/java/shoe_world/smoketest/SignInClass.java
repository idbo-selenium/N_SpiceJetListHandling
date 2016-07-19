package shoe_world.smoketest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SignInClass {

	
	public static void WaitForm(WebDriver driver,String xpath){
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}
	
	@Test
	public void SignInTest() throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://182.72.246.195:8088/");
		Thread.sleep(4000);
		driver.findElement(By.className("login")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("email_create")).sendKeys("knskumari@gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.id("SubmitCreate")).click();
		Thread.sleep(4000);
		String value = driver.findElement(By.id("email")).getAttribute("value");
		Thread.sleep(4000);
		System.out.println("Value is : "+value);
	}	
}