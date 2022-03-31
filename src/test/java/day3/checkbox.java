package day3;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


//import: command + shift +O
public class checkbox {

	WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod() {
		
//			1)Open the Browser
//			2)Enter the URL "http://practice.automationtesting.in/"
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
	
	
	}
	
	@Test
	public void test1 (){
		
		//Navigate to checkBox page
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[6]/a")).click();
		
		WebElement FirstCheckboxElement = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
		WebElement SecondCheckboxElement = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));
	
		Boolean FirstCheckbox = FirstCheckboxElement.isSelected();
		Boolean SecondCheckbox =SecondCheckboxElement.isSelected();
		
		
		if(FirstCheckbox) {
			
			System.out.println("Checkbox is already selected");
		} else {
			FirstCheckboxElement.click();
		}
		
	}
	
}
