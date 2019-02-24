package com.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfter {
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("This is @BeforeTest method");
		//This method is called only ONCE before executing any tests for this class
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("This is @AfterTest method");
		//This method is called only ONCE after executing any tests for this class
	}
	
	
	@BeforeMethod
	public void before() {
		System.out.println("===========");
		//This method is called everytime before executing any tests for this class
		System.out.println("This is @BeforeMethod method for " + Thread.currentThread().getId());
		//Browser invoking
	}
	
	@AfterMethod
	public void after() {
		//This method is called everytime after executing any tests for this class
		System.out.println("This is @AfterMethod method for " + Thread.currentThread().getId());
		//Logout
		System.out.println("===========");
	}
	
	@Test
	public void test1() {
		System.out.println("This is test1");
	}
	
	@Test
	public void test2() {
		System.out.println("This is test2");
	}

}
