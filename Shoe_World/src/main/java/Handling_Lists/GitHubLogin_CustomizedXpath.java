package Handling_Lists;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class GitHubLogin_CustomizedXpath {
	
	public void Waitmethod(WebDriver driver,String xpath){
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}
	
	@Test
	public void GitHubLogin(){
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://github.com/login");
		driver.findElement(By.id("login_field")).sendKeys("nirmalakumari");
		driver.findElement(By.id("password")).sendKeys("pass@word1");
		driver.findElement(By.xpath("//div[@id='login']//input[@type='submit']")).click();
		Waitmethod(driver, "//div[@id='js-pjax-container']//a[contains(text(), 'Read the guide')]");
		driver.findElement(By.xpath("//ul[@id='user-links']/li[3]//img[@class='avatar']")).click();
		driver.findElement(By.xpath("//ul[@id='user-links']//button[contains(text(), 'Sign out')]")).click();
		driver.close();
	}	
}