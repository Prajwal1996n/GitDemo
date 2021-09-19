package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {
	@Test
	public void demo() {

		System.out.println("i love one");
	}

	@Parameters({ "URL" })
	@Test
	public void abc(String urlname) {

		System.out.println("i love two");
		System.out.println(urlname);
	}

	@Test
	public void qwr() {

		System.out.println("i love th");
	}

	@Test(dataProvider="getData")
	public void demos(String a,String b) {

		System.out.println("This is executing before");
		System.out.println(a);
		System.out.println(b);
	}

	@DataProvider
	public Object[][] getData() {

		Object[][] data = new Object[3][2];
		data[0][0] = "firstuser";
		data[0][1] = "firstpass";
		data[1][0] = "seconduser";
		data[1][1] = "secondpass";
		data[2][0] = "thirduser";
		data[2][1] = "thirdpass";
		return data;

	}
}
