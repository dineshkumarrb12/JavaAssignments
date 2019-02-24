package com.testng1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {
	@BeforeTest
	public void beforeTest() {
		System.out.println("This is @BeforeTest for class 2");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("This is @AfterTest for class 2");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is @BeforeMethod for class 2");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This is @AfterMethod for class 2");
	}
	
	
	@Test
	public void test1() {
		System.out.println("Test Class 2 - Test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("Test Class 2 - Test 2");
	}
}
