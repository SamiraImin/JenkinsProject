package day11;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parallelTest {

	
	public WebDriver driver;
	
	   @Test
	    public void SafariTest() {
	        WebDriverManager.safaridriver().setup();
	        driver = new SafariDriver();
	        driver.get("https://www.google.com");
	        System.out.println("I am inside SafariTest| "+Thread.currentThread().getId());
	    }
	    
	    @Test
	    public void ChromeTest() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.get("https://www.google.com");
	        System.out.println("I am inside ChromeTest| "+Thread.currentThread().getId());
	    }
}