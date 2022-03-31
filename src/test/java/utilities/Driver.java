package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {

	private Driver() {
		
	}
	
	public static WebDriver driver;
	
	public static WebDriver getDriver() {
		if(driver==null) {
			
			switch (PropertiesReader.getProperty("browser1")) {

				
			case"chrome":
				WebDriverManager.chromedriver().setup();
				driver =new ChromeDriver();
				break;
				
			case "safari":
			//code
			break;
			case "exploror":
			break;
		
			}
			driver.get(PropertiesReader.getProperty("url"));
			driver.manage().window().maximize();
			
		}
		return driver;
	}
	
	}
	
	
