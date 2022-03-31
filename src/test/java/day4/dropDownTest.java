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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropDownTest {

	WebDriver driver;
	
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
	public void staticDropDown () throws InterruptedException {
		
		
		WebElement element= driver.findElement(By.id("dropdown"));
		
		Select select =new Select(element);
		
		Thread.sleep(2000);
		
		select.selectByIndex(1); //option1
		Thread.sleep(2000);
		select.selectByValue("2"); //option2
		Thread.sleep(2000);
		select.selectByVisibleText("Option 1"); //option3
		
	}
	
	
	
	
	
	
	
}