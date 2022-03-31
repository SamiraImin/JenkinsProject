package TestCasePractice;

import java.util.concurrent.TimeUnit;

import org.bouncycastle.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class myAccount {
	
	WebDriver driver;
	
	public void beforeMethod() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get(Properties.getPropertyValue("testcaseURL"));
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}

}
