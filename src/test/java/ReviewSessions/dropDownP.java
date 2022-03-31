package ReviewSessions;
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
import utilities.PropertiesReader;

public class dropDownP {
	
	WebDriver driver;
	
	private String url ="http://demo.guru99.com/test/newtours/register.php";
	
	@BeforeMethod
	public void beforeMethod() {
		
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		
		driver.get(url); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}
	
	@Test
	public void Test1() {
	//country
	WebElement country =driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select"));
		
		Select select = new Select(country);
		select.selectByVisibleText("United States");
		
	}
	

}
