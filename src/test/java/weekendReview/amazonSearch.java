package weekendReview;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazonSearch {

	/*
	 * 1.Go to Amazon 2.Send any Key 3.Click search 4.Select one of the item 5.Add
	 * it to care 6.Validate the item in the cart 7.remove the item 8.validate the
	 * cart is empty 9. navigate to youtube 10.validate the tittle is youtube // *
	 * 11.search video 12 play the videO
	 */

	WebDriver driver;

	@BeforeMethod
	public void beforeTest() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
	}

//	@After
//public void afterTest() {
//	
//	driver.close();
//}

	@Test
	public void AmazonSearch() throws InterruptedException {

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("TESLA", Keys.ENTER);
		driver.findElement(By
				.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[4]/div/div/div/div/div[1]/span/a/div"))
				.click();
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.findElement(By.xpath("//*[@id=\"nav-cart\"]")).click();

		String actualItemTitle = driver.findElement(By.xpath("//*[.=\"Tesla Motors 24' Cable Wall Connector\"]")) //having error here, title do not match
				.getText();

		String expectedItemTitle = "Tesla Motors 24' Cable Wall Connector";

		if (actualItemTitle.equalsIgnoreCase(expectedItemTitle)) {
			System.out.println("have this item in cart");
		} else {
			System.out.println("do not have this item in cart");

			driver.get("https://www.youtube.com");

			String actualWebTitle = driver.findElement(By.xpath("//*[@id=\"logo\"]")).getText();

			String expectedTitle = "YouTube Home";

			if (actualWebTitle.equalsIgnoreCase(expectedTitle)) {
				System.out.println("YouTube Home");
			} else {
				System.out.println("Not YouTube");

				WebElement inputElem = driver.findElement(By.xpath(
						"/html/body/ytd-app/div/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/form/div/div[1]/input"));

				inputElem.sendKeys("Tesla");
				driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]/yt-icon")).click();
				driver.findElement(
						By.xpath("/html/body/ytd-app/div/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/button")).click();
				Thread.sleep(1000);

				driver.findElement(By.xpath("//a[@href=\"/watch?v=MQa087cBU-4")).click();// error, could not open the link

			}

		}
	}
}
