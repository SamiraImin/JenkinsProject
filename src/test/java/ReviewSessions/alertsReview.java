package ReviewSessions;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertsReview {

	
	
	WebDriver driver;
	
	@BeforeMethod
	public void BeforeMehtod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@Test
	public void alertTest123() throws InterruptedException {
		
		//First
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	
		
		
	}
	}

