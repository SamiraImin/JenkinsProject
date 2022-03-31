package day11;

import org.testng.annotations.BeforeMethod;

public class newTestCaseToAdd {
	public class dependsOnTest {

		@BeforeMethod
		public void beforeMethod() {

			System.out.println("beforeMethod");
		}
	}
}

