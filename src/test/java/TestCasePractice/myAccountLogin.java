package TestCasePractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.PropertiesReader;

public class myAccountLogin {

	
	

	WebDriver driver;

	@BeforeMethod
	
	// 1) Open the browser 2) Enter the URL “http://practice.automationtesting.in/”
	public void beoforeMethod() {

		WebDriverManager.chromiumdriver().setup();
		driver = new ChromeDriver();
		driver.get(PropertiesReader.getProperty("testcaseURL"));
	}

	@Test
	public void TestCase1() {

//	        3) Click on Shop Menu
		driver.findElement(By.xpath("//*[@id=\"menu-item-40\"]")).click();
	}
}
