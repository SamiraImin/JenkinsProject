package day11;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class passingParameter {

	@Parameters({"val1" , "val2"})
	@Test
	public void sumOf(int v1, int v2) {

		int finalsum = v1 + v2;

		System.out.println("The final sum of the gien value is " + finalsum);

	}
	
}
