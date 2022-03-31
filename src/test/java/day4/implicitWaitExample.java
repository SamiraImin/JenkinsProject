package day4;

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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class implicitWaitExample {
	
	
WebDriver driver;
WebDriverWait Wait;
	// what is driver instant?
	//-
	@BeforeMethod
	public void beforeMethod() {
		
//			1)Open the Browser
//			2)Enter the URL "http://practice.automationtesting.in/"
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}
	@Test
    public void test1() {
        
        //login
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();

        //initiating explicit wait object
        Wait = new WebDriverWait(driver, 30);
        
        //waiting for the element to be visible
        Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("welcome")));
        
        //after visibility is true, then store the element text for verification
        String actualWelcomeText = driver.findElement(By.id("welcome")).getText();
        String expected = "Welcome Paul";
    
        
        
        
        if(actualWelcomeText.equalsIgnoreCase(expected)) {
            System.out.println("PASSED");
        }else {
            System.out.println("GO LEARN JAVA");
        }
        
    }
		
	//Fluent Wait--CHECK every 5 second for 30 sec
	//Explicit Wait - CHECK at the 30 sec mark
	
	
//	@Test
//	public void fluentWaitTest() {
////		
////		Note that is method is deprecated meaning out of use but in interview this will come up.
//		
//		FluentWait wait =new FluentWait(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(Exception.class)
//				
//				wait.until(ExpectedConditions.alertIsPresent());
//						
//	}
	
	
	
	
	
	
	}
	
	
	
	
	
	

