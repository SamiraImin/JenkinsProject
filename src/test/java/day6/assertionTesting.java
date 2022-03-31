package day6;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assertionTesting {

	WebDriver driver;

	@BeforeMethod
	public void beforeMehtod() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public void afterMethod() {

		driver.close();
	}

	@Test
	public void assertFalseTest() {
//checkBox1
		WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")); //storing checkboxes
		// we want this to be false.
//		checkbox1.isSelected();
		// --for the entire thing to be true
		// --Meaning the fact that "this checkbox is not selected" is true.
//		Assert.assertTrue(checkbox1.isSelected());
//		//if line 47 fail, line 49 should never print, thus checkbox1 is not selected, this is not true, so this will not print
//		System.out.println("hello");
//		
		AssertJUnit.assertFalse(checkbox1.isSelected());
		//Assert.assertFalse(false)
		// if line 50 succeed, line 49 should print, thus checkbox1 is not selected,
		// this is true, so this will print
		System.out.println("hello");

//checkBox2
		WebElement checkbox2= driver.findElement(By.xpath("//*[@id=\\\"checkboxes\\\"]/input[2]"));
		AssertJUnit.assertFalse(checkbox2.isSelected()); // boolean inside is true, thus this statement is not false--it will not print
		//Assert.assertFalse(true)
		System.out.println("hello2");
	}

	
	@Test
	public void assertTrueTest() {
		AssertJUnit.assertTrue(driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3")).isDisplayed());
		System.out.println(" code did not throw an exception on assertTrueTest");
		//Assert.assertTrue(true);
	}
	
	
	public void assertEqualTest() {
		
		String actualTitle = driver.findElement(By.xpath("//*[@id=\\\"content\\\"]/div/h3")).getText();
		String expectedTitle = "Checkboxes";
		
		AssertJUnit.assertEquals(actualTitle, expectedTitle);
	}
		
	}

