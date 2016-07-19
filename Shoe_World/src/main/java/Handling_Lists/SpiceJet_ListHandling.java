package Handling_Lists;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SpiceJet_ListHandling {

	@Test(priority = 1)
	public void SpiceJet_ListHandling_LeavingFrom(){
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.spicejet.com/?gclid=CKGCyY7lqMkCFRIfaAodvYEMyQ");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		System.out.println("Leaving from cities and country names");
		List<WebElement> type = driver.findElements(By.xpath("//table[@id='citydropdown']//h3"));
		int count = type.size();
		//System.out.println("Count is : "+count);
		for (int i = 1;i<=count;i++){
			WebElement element = driver.findElement(By.xpath("//table[@id='citydropdown']//div[@id='dropdownGroup"+i+"']/h3"));
			System.out.println("Type is : "+element.getText());
			List<WebElement> typesInside = driver.findElements(By.xpath("//table[@id='citydropdown']//div[@id='dropdownGroup"+i+"']//ul"));
			int count1 = typesInside.size();
			//System.out.println("Count is : "+count1);
			for(int j=1;j<=count1;j++){
				List<WebElement> citiesCount = driver.findElements(By.xpath("//table[@id='citydropdown']//div[@id='dropdownGroup"+i+"']//ul["+j+"]/li"));
				int noOfColumns = citiesCount.size();
				//System.out.println("No of Columns : "+noOfColumns);
				for(int k = 1;k<=noOfColumns;k++){
					WebElement cityName = driver.findElement(By.xpath("//table[@id='citydropdown']//div[@id='dropdownGroup"+i+"']//ul["+j+"]/li["+k+"]/a"));
					if(i==1){
						System.out.println("City Name is : "+cityName.getText());
					}
					else if(i == 2){
						System.out.println("Country name is : "+cityName.getText());
					}
				}
			}
			System.out.println("-----------------------------------------------");
		}
		driver.findElement(By.linkText("Hyderabad (HYD)")).click();	
		driver.close();
	}
	
	@Test(priority = 2)
	public void SpiceJet_ListHandling_Going_To() throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.spicejet.com/?gclid=CKGCyY7lqMkCFRIfaAodvYEMyQ");		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		System.out.println("Going to cities and country names");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Hyderabad (HYD)")).click();	
		List<WebElement> element = driver.findElements(By.xpath("//table[@id='citydropdown']//h3"));
		int count = element.size();
		//System.out.println("count value is : "+count);
		for(int i=1;i<=count;i++){
			Thread.sleep(2000);
			WebElement listType = driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//table[@id='citydropdown']//div[@id='dropdownGroup"+i+"']/h3"));
			System.out.println("List type is : "+listType.getText());
			List<WebElement> cities = driver.findElements(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//table[@id='citydropdown']//div[@id='dropdownGroup"+i+"']//ul"));
			int count1 = cities.size();////div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//table[@id='citydropdown']//div[@id='dropdownGroup1']//ul
			//System.out.println("count1 value "+count1);
			for(int j = 1;j<=count1;j++){
				List<WebElement> cites = driver.findElements(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//table[@id='citydropdown']//div[@id='dropdownGroup"+i+"']//ul["+j+"]/li"));
				int count2 = cites.size();
				//System.out.println("count2 value : "+count2);
				for(int k = 1;k<= count2;k++){
					WebElement names_city = driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//table[@id='citydropdown']//div[@id='dropdownGroup"+i+"']//ul["+j+"]/li["+k+"]"));
					if(i==1){
						System.out.println("City name is :"+names_city.getText());
					}
					else if(i==2){
						System.out.println("Country name is :"+names_city.getText());
					}
				}
			}
			System.out.println("------------------------------------------------");
		}
		driver.close();
	}
}