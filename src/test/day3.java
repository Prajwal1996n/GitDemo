package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day3 {
	@Test
	public void one() {
		
		System.out.println("i am after suite");
	}
	
	@Test
	public void two() {
		
		System.out.println("i love h");
	}
	
	
	@Test(groups= {"smoke"})
	public void three() {
		
		System.out.println("i love hari");
	}

}
