package Handling_Lists;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class List_Handling {

	@Test
	public void Handling() throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://182.72.246.195:8088/");	
		Thread.sleep(2000);
		//WebElement element = driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li/a"));
		List<WebElement> navList = driver.findElements(By.xpath("//div[@id='block_top_menu']/ul/li/a"));
		System.out.println("Nav items count : "+navList.size());
		int navListSize = navList.size();
		for(int i = 1;i<=navListSize;i++){			
			WebElement element = driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li["+i+"]/a"));
			System.out.println("Nav Item Name : "+element.getText());
			List<WebElement> sub_navList = driver.findElements(By.xpath("//div[@id='block_top_menu']/ul/li["+i+"]/ul/li/a"));
			System.out.println("sub nav Items count : "+sub_navList.size());
			int sub_navListSize = sub_navList.size();
			for(int j=1;j<=sub_navListSize;j++){
				WebElement sub_element = driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li["+i+"]/ul/li["+j+"]/a"));
				System.out.println("sub nav List Item name : "+sub_element.getAttribute("title"));
				List<WebElement> sub_sub_navList = driver.findElements(By.xpath("//div[@id='block_top_menu']/ul/li["+i+"]/ul/li["+j+"]/ul/li/a"));
				System.out.println("sub sub nav items count : "+sub_sub_navList.size());
				int sub_sub_navListSize = sub_sub_navList.size();
				for(int k = 1;k<=sub_sub_navListSize;k++){
					WebElement sub_sub_element = driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li["+i+"]/ul/li["+j+"]/ul/li["+k+"]/a"));
					System.out.println("sub sub nav List Item name : "+sub_sub_element.getAttribute("title"));
				}
			}
			System.out.println("-------------------------------------------------------------------");
		}		
	}	
}