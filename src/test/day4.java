package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	@Parameters({"URL","APIKey/username"})
	@Test
	public void demo(String abc,String xyz) {
		
		System.out.println("This is executing before");
		System.out.println(abc);
		System.out.println(xyz);
	}
	


	
	
	
	

}
