package day6;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.PropertiesReader;

public class actionClassTest {

WebDriver driver;
Actions action;

@BeforeMethod
public void beforeMethod() {
	
	WebDriverManager.chromedriver().setup();
	driver =new ChromeDriver();
	driver.get(PropertiesReader.getProperty("AmazonURL"));
	driver.manage().window().maximize();
}
	
	@Test
	public void test1() {
		
		Actions action =new Actions(driver);
		
		WebElement accountListButton = driver.findElement(By.xpath(PropertiesReader.getProperty("accountListButton")));
		action.moveToElement(accountListButton).build().perform();
		
	}
	
	@Test
	public void moveToElementTest() {

		
		driver.navigate().to("http://automationpractice.com/index.php?id_category=3&controller=category");
		action = new Actions(driver);

		WebElement accountListButton2 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]"));

		action.moveToElement(accountListButton2).build().perform();
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span")).click();
	}
	
	
	@Test
	public void dragAndDropTest() throws InterruptedException {
		driver.navigate().to("http://the-internet.heroluapp.com/drag_and_drop");
		action = new Actions(driver);
		
		Thread.sleep(1000);
		action.dragAndDrop(driver.findElement(By.id("column-a")), driver.findElement(By.id("column-b"))).build().perform();
		
		
		
		
		
		
		
		
		
	}
}
