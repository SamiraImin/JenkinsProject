package listeners;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.SkipException;


public class TestNGListenerDemo {

	
	@Test
	public void test1() {
		System.out.println("I am inside test 1");
		
	}
	
	@Test
	public void test2() {
		System.out.println("I am inside test 2");
		AssertJUnit.assertTrue(false);
	}
	
	@Test
	public void test3() {
		System.out.println("I am inside test 3");
		throw new SkipException("This test is skipped");
	}
}
