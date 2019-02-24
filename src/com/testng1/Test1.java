package com.testng1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is @Before suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("This is @After suite");
	}


	@BeforeTest
	public void beforeTest() {
		System.out.println("This is @BeforeTest for class 1");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("This is @AfterTest for class 1");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is @BeforeMethod for class 1");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("This is @AfterMethod for class 1");
	}


	@Test
	public void test1() {
		System.out.println("Test Class 1 - Test 1");
	}

	@Test
	public void test2() {
		System.out.println("Test Class 1 - Test 2");
	}

}
