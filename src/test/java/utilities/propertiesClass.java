package utilities;



import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class propertiesClass {

	WebDriver driver;
	private String url = PropertiesReader.getProperty("url");
	

	@BeforeMethod
	public void beforeMethod() {
		
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
	
	}
@Test
public void test1() {
}
}
	
	



