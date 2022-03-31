package day5;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkSliders {

	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://practice.automationtesting.in/");

	}

	@AfterMethod
	public void afterMehtod() {
		driver.close();

	}

	@Test
	public void TestCase1() {

//		3)Click on Shop Menu
		driver.findElement(By.id("menu-item-40")).click();
//		4)Now click on Home menu Button
		driver.findElement(By.xpath("//*[@id=\"content\"]/nav/a")).click();
//		5)Test wether the Home page has Three Sliders only
		List<WebElement> sliders = driver.findElements(By.xpath("//*[@id='n2-ss-6']/div"));

		int numberOfSliders = sliders.size();

		if (numberOfSliders == 3) {

			System.out.println("Sliders count is 3");
		} else {

			System.out.println("failed");

		}

	}

}
