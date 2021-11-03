package servicenowChangemngmt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChangeManagementexixtingRequest extends BaseClassSn{
@Test
	public  void existingChid() throws InterruptedException {
		
		
		Thread.sleep(4000);
        
		driver.findElement(By.xpath("(//div[text()='Open'])[3]")).click();
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys(changeId);
		WebElement cHG = driver.findElement(By.xpath("//a[@class='linked formlink']"));
		cHG.click();
		
		
		
		
		
		
		
		
		
	}

}
