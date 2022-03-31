package day7;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass_iframeTest {

	WebDriver driver;
	private String url = "https://jqueryui.com/droppable/";

	@BeforeMethod
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
		@Test
		public void dragAndDropTest() throws InterruptedException {
		
		Actions action =new Actions(driver);
		List<WebElement> iframes =driver.findElements(By.xpath("//iframe"));
		//print your number of frames
		System.out.println(iframes.size());
		
		driver.switchTo().frame(0);
		
		WebElement draggble = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		
		Thread.sleep(1000);
		action.dragAndDrop(draggble, droppable).build().perform();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[2]/ul/li[3]/a")).click();
	}

		

	}
