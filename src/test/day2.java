package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	@Test
	public void last() {

		System.out.println("I am last");
	}

	@Test(groups= {"smoke"})
	public void home1() {

		System.out.println("i love mysore");
	}

	@Test
	public void home2() {

		System.out.println("I am jcian");
	}

	@Test
	public void home3() {

		System.out.println("I am oswald");
	}

	@Test
	public void cool() {

		System.out.println("I am poke");
	}

	@Test
	public void first() {

		System.out.println("I am firstsuite");
	}

}
