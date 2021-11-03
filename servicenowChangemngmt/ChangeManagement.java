package servicenowChangemngmt;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ChangeManagement extends BaseClassSn {
	@Test
	public String changeCreate() throws InterruptedException {

		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[text()='Create New'])[3]")).click();
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.xpath("(//div[@class='change-model-card-component'])[2]")).click();

		changeId = driver.findElement(By.id("change_request.number")).getAttribute("value");
		System.out.println(changeId);

		driver.findElement(By.xpath("//span[@class='icon icon-search']")).click();

		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);

		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowList = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windowList.get(1));

		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("It",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='glide_ref_item_link']")).click();
		driver.switchTo().window(windowList.get(0));
		driver.switchTo().frame("gsft_main");
		
		  WebElement shrtdesc = driver.findElement(By.id("change_request.short_description")); 
		  shrtdesc .sendKeys("New Normal change request"); String attribute2 =
		  shrtdesc.getAttribute("value");
		  
		  driver.findElement(By.id("sysverb_insert_bottom")).click();	 		  
		  
		  
		  driver.switchTo().defaultContent();
		  
		  driver.findElement(By.xpath("(//div[text()='Open'])[3]")).click();
		  driver.switchTo().frame("gsft_main");
		  
		  driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys( changeId,Keys.ENTER);
		  
		  String newNormalChange =
		  driver.findElement(By.xpath("//td[text()='New Normal change request']")).
		  getText(); 
		  System.out.println(newNormalChange);
		  if
		  (attribute2.equals(newNormalChange)) {
		  System.out.println("entered Text is : " +newNormalChange);
		  } else {
		  System.out.println("The incident is not verified");
		  }
		return newNormalChange;
		  
		  
		  
		 
	}

}
