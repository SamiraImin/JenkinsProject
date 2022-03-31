package day6;



import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.PropertiesReader;

public class actionClassAmazon {
	
//	    1. go to http://automationpractice.com/index.php
//	    2. click on DRESSES button
//	    3. add items on sale to cart and checkout
//	    4. continue to checkout until you see the 'authentication' page and verify it
	    WebDriver driver;
	    private String url = PropertiesReader.getProperty("AmazonPractice");

	    @BeforeMethod
		public void beforeMethod() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.get(url);
	         driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    }

	    @Test
	    public void test1() {
	        driver.findElement(By.xpath("")).click();

	        Actions action = new Actions(driver);
	        WebElement selectItem = driver.findElement(By.xpath(PropertiesReader.getProperty("selectItem")));
	        action.moveToElement(selectItem).build().perform();
	        
	        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span")).click();

	    }

	}

