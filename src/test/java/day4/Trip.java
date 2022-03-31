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

public class Trip {
	
	WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
	
}
	@Test
	public void test1() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("root")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div/div/div[1]/label/input")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys("nyc");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]/p[1]")).click();

    }
		
	}

