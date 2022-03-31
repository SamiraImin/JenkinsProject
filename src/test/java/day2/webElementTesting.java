package day2;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webElementTesting {

	WebDriver driver;
	@BeforeMethod
	public void beforeTest() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		//driver.get("http://demo.automationtesting.in/Index.html");
		driver.get("https://www.amazon.com/gp/product/B085M66LH1/ref=as_li_tl?ie=UTF8&tag=jagdeepjenkin-20&camp=1789&creative=9325&linkCode=as2&creativeASIN=B085M66LH1&linkId=afac89500c48e8d7f417da4887435946&th=1");
		
	}
	
	
	
	@Test
	public void inputEmailAddress() {

//		driver.findElement(By.id("email")).sendKeys("@abc@gmail.com");
//		driver.findElement(By.id("enterimg")).click();
//		//FirstName
//		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Samira");
//		//LastName
//		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Imin");
//		//Address
//		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("The Space");
//		//EmailAddress
//		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("samira@gmail.com");
//		//Phone
//		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("2888888");
		
		
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("ysaimire@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("921122");
		
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.findElement(By.xpath("//*[@id=\"submit.add-to-cart-announce\"]"));
		
		
	}
	}

	
	

