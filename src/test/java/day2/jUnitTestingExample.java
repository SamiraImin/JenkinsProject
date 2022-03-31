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


public class jUnitTestingExample {


	@BeforeMethod
	public void setup() {
//		WebDriver driver;
//		WebDriverManager.chromiumdriver().setup();
//		driver= new ChromeDriver();
//		driver.get("https://www.blockchain.com/ ");

		System.out.println("Opening Browser");
		
	}
	@AfterMethod
	public void teardown() {
	
		System.out.println("Closing Browser");
	}
	
	@Test
	public void test1() {

		System.out.println("Test1");
	}
	
	
	@Test
	public void test2() {
		System.out.println("Test2");
	}
	
	
}
