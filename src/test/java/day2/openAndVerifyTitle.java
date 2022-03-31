package day2;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class openAndVerifyTitle {
	WebDriver driver; 

	@BeforeMethod
	public void beforeTest() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(" https://www.youtube.com/ ");
	driver.manage().window().maximize();
	
	}
	
	@Test
	public void verifyTitle() {
		String actualPageTitle = driver.getTitle();
		String expectedPageTitle = "Youtube";

		if (expectedPageTitle.equalsIgnoreCase(actualPageTitle)) {

			System.out.println("Title matches and Passed");
		} else {

			System.out.println("FAILD");
			System.out.println("Expected to see-->" + expectedPageTitle);
			System.out.println("The Driver got -->" + actualPageTitle);
		}

	}
	
	
	@Test
	public void verifyUrl() {
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.youtube.com/ ";

		if (expectedUrl.equalsIgnoreCase(actualUrl)) {

			System.out.println("Url matches and Passed");
			
		}else {
			
			System.out.println("FAILD");
			System.out.println("Expected to see-->" + expectedUrl);
			System.out.println("The Driver got -->" + actualUrl);
			
		}
	}
	
		@Test
		public void pageSourcePrint() {
			
			String source=driver.getPageSource();
			System.out.println(source);
		driver.navigate().to("https://www.blockchain.com/");
		
	}	
		
		
		
		@BeforeMethod
		public void setup() {
			WebDriver driver;
			WebDriverManager.chromiumdriver().setup();
			driver= new ChromeDriver();
			driver.get("https://www.youtube.com/");

			System.out.println("Opening Browser");
			
		}
		@AfterMethod
		public void teardown() {
		
			System.out.println("Closing Browser");
			
}
}

