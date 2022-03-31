package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class myAccountLogin {
		
  
public WebDriver driver;

@Parameters({"browser"})
@Test(priority=1)
public void beforeTest(String browser, String url) {
	
	System.out.println("running browser is : "+ browser);
	
    if (browser.equalsIgnoreCase("safari")) {
        WebDriverManager.safaridriver().setup();
        driver = new SafariDriver();
    } else if (browser.equalsIgnoreCase("chrome")) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    driver.get(url);
    
}


  @Parameters({"username","password"})
  
  @Test(priority=2)
  public void loginTest(String email, String password) {
	  
	  
	  driver.findElement(By.xpath("//*[@id=\"gnav-header-inner\"]/div[4]/nav/ul/li[1]")).click();
	  System.out.println("username: " +email + "and password "+ password);
	  driver.findElement(By.name("email")).sendKeys(email);
	  driver.findElement(By.name("password")).sendKeys(password);
	  
  }
  
  
  
	}
	
	

