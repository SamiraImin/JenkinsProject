package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class openBrowser {

	public static void main(String[] args) {
		
		
//		WebDriver driver;
//		WebDriverManager.chromiumdriver().setup();
//		
//		driver= new ChromeDriver();
//		
//		driver.get("  ");
//
//	}

	
	WebDriver driver = new ChromeDriver();
	driver.get("http://youtube.com/");
	
	}
	
}
