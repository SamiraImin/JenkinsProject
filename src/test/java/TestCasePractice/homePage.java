package TestCasePractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.PropertiesReader;

public class homePage {

	// Difference btw
// relative xpath: //chromedriver
// absolute xpath: path from the root (directory path)
// :users/samiraimin/Desktop/SELENIUM WEBDRIVER/chromedriver

// tagName[@attribute='value']-->xpath
// $("")-->Css
// input[@
// input[@id='reg_email']
// input[@name='email']
// input[@ytype='email']

/*
 * Creating your own xpath/Css $("") --> Css $x("") --> xpath
 * //tagName[@attribute='value'] --> xpath tagName[attribute='value'] --> Css
 * tagName#id- Css tagname.classname --> Css
 * 
 * //tagName[contains(@attribute,'value')] --> xpath
 * //tagName[Atrribute*='value'] --> Css
 */

WebDriver driver;

@BeforeMethod

// 1) Open the browser 2) Enter the URL “http://practice.automationtesting.in/”
public void beoforeMethod() {

	WebDriverManager.chromiumdriver().setup();
	driver = new ChromeDriver();
	driver.get(PropertiesReader.getProperty("testcaseURL"));
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
}
//	Testcase2
//	3) Click on Shop Menu
//	4) Now click on Home menu button
//	5) Test whether the Home page has Three Arrivals only
//	6) The Home page must contains only three Arrivals
@Test
public void TestCase() throws InterruptedException {
	// 3) Click on Shop Menu
	driver.findElement(By.xpath(PropertiesReader.getProperty("Shop"))).click();
	// 4) Now click on Home menu button
	driver.findElement(By.xpath(PropertiesReader.getProperty("Home"))).click();
	
	// 5) Test whether the Home page has Three Sliders only coming back to this test case next week to complete steps

	List<WebElement> sliders = driver.findElements(By.xpath("//*[@id='n2-ss-6']/div"));

	int numberOfSliders = sliders.size();

	if (numberOfSliders == 3) {
		System.out.println("Sliders count is 3");
	} else {
		System.out.println("failed");
	}
	// 5) Test whether the Home page has Three Arrivals only
	// 6) The Home page must contains only three Arrivals 
	
List <WebElement> Arrivals =driver.findElements(By.xpath("//*[@id=\"themify_builder_content-22\"]/div[2]/div/div/div/div/div[2]/div"));
	int numberOfArrivals =Arrivals.size();
	if(numberOfArrivals==3) {
		
		System.out.println("Arrival counts are 3");
	}else {
		System.out.println("Failed");
	}
	//7) Now click the image in the Arrivals
	WebElement imageArrivals = driver.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-2-0\"]/div/ul/li/a[1]/img"));
	imageArrivals.click();
	//8) Test whether it is navigating to next page where the user can add that book into his basket.
	//9)Image should be clickable and should navigate to next page where user can add that book to his basket
	driver.findElement(By.xpath("//form[@class='cart']/button")).click();
	WebElement addToBasketButton=driver.findElement(By.xpath("//*[@id=\"product-165\"]/div[2]/form/button"));
	AssertJUnit.assertTrue(addToBasketButton.isDisplayed());
	System.out.println(addToBasketButton.getText()+" Works!");
	//10) Click on Description tab for the book you clicked on.
	//11) There should be a description regarding that book the user clicked on
	driver.findElement(By.xpath("//*[@id=\"product-165\"]/div[3]/ul/li[1]/a")).click();
	WebElement BookDescription = driver.findElement(By.xpath("//*[@id=\"tab-description\"]/div"));
	AssertJUnit.assertTrue(BookDescription.isDisplayed());
	System.out.println("There is a description regarding that book the user clicked on");
	//10) Now clock on Reviews tab for the book you clicked on.
	//11) There should be a Reviews regarding that book the user clicked on
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"product-165\"]/div[3]/ul/li[2]/a")).click();
	WebElement BookReview= driver.findElement(By.xpath("//*[@id=\"comments\"]/p"));
	AssertJUnit.assertTrue(BookReview.isDisplayed());
	System.out.println("There is a review regarding that book the user clicked on");
	//10) Click on the Add To Basket button which adds that book to your basket
	
	//11).User can view that Book in the Menu item with price
	WebElement Item= driver.findElement(By.xpath("//*[@id=\"wpmenucartli\"]/a"));
	AssertJUnit.assertTrue(Item.isDisplayed());
	System.out.println("User can view that Book in the Menu item with price");
	//13) Select more books than the books in stock.Ex if the stock has 20 books, try to add 21.
	driver.findElement(By.xpath("//*[@id=\"product-165\"]/div[2]/form/div/input")).sendKeys("7551");
	//14) Click the add to basket button
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"product-165\"]/div[2]/form/button")).click();
	//15) Now it throws an error prompt like you must enter a value between 1 and 20
	System.out.println("Availible Value exceeded In-Stock Value");
	//12) Now click on Item link which navigates to proceed to check out page.
	Item.click();
	//14) Enter the Coupon code as ‘krishnasakinala’ to get 50rps off on the total.
	driver.findElement(By.xpath("//*[@id=\"coupon_code\"]")).sendKeys("krishnasakinala");
	//15) User can not to apply coupon by entering ‘krishnasakinala’ in the coupon textbox which give 50rps off on the total price 
		//because the coupon is applicable for the book price > 450 rps
	driver.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/form/table/tbody/tr[2]/td/div/input[2]"));
	Thread.sleep(3000);
	
	WebElement cannotAddCoupon=driver.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]"));
	AssertJUnit.assertTrue(cannotAddCoupon.isDisplayed());
	System.out.println(cannotAddCoupon.getText());
	//13) Now click on Remove this icon in Check out page which removes that book from the grid.
	//14) User has the feasibility to remove the book at the time of check out also
	WebElement RemoveIcon=driver.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/form/table/tbody/tr[1]/td[1]/a"));
	AssertJUnit.assertTrue(RemoveIcon.isDisplayed());
	System.out.println("Remove Icon Exist");
//		RemoveIcon.click();
//QQ	//13) Click on textbox value under quantity in Check out page to add or subtract books.
	Thread.sleep(3000);
	
//QQ	Actions action =new Actions(driver);
//		WebElement AddSubtract =driver.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/form/table/tbody/tr[1]/td[5]/div/input"));
//		action.moveToElement(AddSubtract).build().perform();
	
	//14) Now after the above change ‘Update Basket’ button will turn into Clickable mode.
	//15) Now click on Update Basket to reflect those changes
	//16) User has the feasibility to Update Basket at the time of check out.
	//13) Now User can find the Total price of the book in the Check out grid.
	//14) User has the feasibility to find the total price of the books at to find the total price of the books at the time of check out
	WebElement TotalPrice= driver.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/div/div/table/tbody/tr[3]/td/strong"));
	AssertJUnit.assertTrue(TotalPrice.isDisplayed());
	//13) Now user can find total and subtotal values just above the Proceed to Checkout button.
	System.out.println("user can find total and subtotal values just above the Proceed to Checkout button");
	
	//14) The total always > subtotal because taxes are added in the subtotal
	WebElement SubTotal =driver.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/div/div/table/tbody/tr[1]/td/span"));
	String Tprice=TotalPrice.getText();
	String newTprice = Tprice.replaceAll("₹","");
	String SubTP=SubTotal.getText();
	String newSubTprice = SubTP.replaceAll("₹","");
	System.out.println(newTprice);
	System.out.println(newSubTprice);
	
	 float Tpriceint=Float.parseFloat(newTprice);
	 float SubTPint=Float.parseFloat(newSubTprice);
	 AssertJUnit.assertTrue(Tpriceint>SubTPint);
	 System.out.println("The total is > subtotal");
	 
	 driver.findElement(By.xpath("//div[@class='quantity']/input")).clear();
	 driver.findElement(By.xpath("//div[@class='quantity']/input")).sendKeys("3");
	 System.out.println(driver.findElement(By.xpath("//div[@class='quantity']/input")));
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/form/table/tbody/tr[2]/td/input[1]")).click();
//	 WebElement UpdateBasket=driver.findElement(By.xpath("//*[@id=\\\"page-34\\\"]/div/div[1]/form/table/tbody/tr[2]/td/input[1]"));
//	 Assert.assertTrue(UpdateBasket.isDisplayed());
//	 System.out.println("UpdateBasket feasible");
//	 UpdateBasket.click();
	//15) Now click on Proceed to Check out button which navigates to payment gateway page.
	//16) Clicking on Proceed to Checkout button leads to payment gateway page
	 
	 WebElement CheckOutButton =driver.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/div[2]/div/div/a"));
	 CheckOutButton.click();

//	 driver.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/div/div/div/a")).click();
	//16)User can view Billing Details,Order Details,Additional details and Payment gateway details.
	 WebElement BillDetails=driver.findElement(By.xpath("//*[@id=\"customer_details\"]/div[1]/div/h3"));
	 WebElement OrderDetails=driver.findElement(By.xpath("//*[@id=\"order_review_heading\"]"));
	 WebElement AdditionalDetails=driver.findElement(By.xpath("//*[@id=\"customer_details\"]/div[2]/div/h3"));
	 WebElement PaymentGateWayDetails=driver.findElement(By.xpath("//*[@id=\"payment\"]/ul"));
	 
	 AssertJUnit.assertTrue(BillDetails.isDisplayed());
	 AssertJUnit.assertTrue(OrderDetails.isDisplayed());
	 AssertJUnit.assertTrue(AdditionalDetails.isDisplayed());
	 AssertJUnit.assertTrue(PaymentGateWayDetails.isDisplayed());
	 System.out.println("User can view all Details");
	//17)Now user can fill his details in billing details form and can opt any payment in the payment gateway like Direct bank transfer,cheque,cash or paypal.
	 
	//18)User has the feasibility to add coupon in the payment gateway page and also he can find billing,order and additional details.
	 WebElement Coupon=driver.findElement(By.xpath("//*[@id=\"customer_details\"]/div[1]/div/h3"));
	 AssertJUnit.assertTrue(Coupon.isDisplayed());
	 System.out.println("user can add coupon");
	
	//18) Now click on Place Order button to complete process
	 driver.findElement(By.xpath("//*[@id=\"place_order\"]")).click();
	 
	}
	}

	
		 

	
