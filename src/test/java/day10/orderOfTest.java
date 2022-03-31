package day10;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class orderOfTest {

	@BeforeTest
	public void beforeTest() {

		System.out.println("beforeTest");
	}

	@AfterTest
	public void afterTest() {

		System.out.println("afterTest");
	}
	
	@Test(priority=1)
	public void test1() {
		System.out.println("Test1");
	}
	
	@Test(priority=2,enabled=true)
	public void test2() {
		System.out.println("Test2");
	}
	
	@Test(priority=3)
	public void test3() {
		System.out.println("Test3");
	}
	
	@Test(priority=4, enabled=false)
	public void test4() {
		System.out.println("Test4");
	}
	
	
}
