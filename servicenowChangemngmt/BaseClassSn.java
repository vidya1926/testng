package servicenowChangemngmt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassSn {
	public ChromeDriver driver;
	public static String changeId;
   @BeforeMethod
	public void preConditions() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://dev113175.service-now.com");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.switchTo().frame(0);
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("Vidya12#");

		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		driver.findElement(By.id("filter")).sendKeys("change");

	}
   @AfterMethod
   public void postCondition() {
	   driver.close();
   }

}
