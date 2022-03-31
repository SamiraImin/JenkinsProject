package day11;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderTesting {

	@Test(dataProvider = "nameList")
	public void myTest(String Name) {
		System.out.println("My name is " + Name);
	}

	@Test(dataProvider = "ageList", enabled = false)
	public void ageTest(String Age) {
		System.out.println("My name is " + Age);
	}

	@DataProvider(name = "nameList")
	public Object[][] nameMethod() {
		return new Object[][] { { "Luna" }, { "moon" } };

	}

	@DataProvider(name = "ageList")
	public Object[][] ageMethod() {
		return new Object[][] { { "22" }, { "33" } };

	}

	@DataProvider
	public Object[][] getData() {
		// 1st username password -good credit history = ROW
		// 2nd -username password -no credit hsitory
		// 3rd username password -fraudelent credit history

		Object[][] data = new Object[3][2];

		// 1st set
		data[0][0] = "firstsetusername";
		data[0][1] = "password";
		// columns in the row are values for that particular combination(row)

		// 2nd set
		data[1][0] = "secondsetusername";
		data[1][1] = "secondpassword";

		// 3rd set
		data[2][0] = "thirdsetusername";
		data[2][1] = "thirdpassword";
		return data;
	}
}
