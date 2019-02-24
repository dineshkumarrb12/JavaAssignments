package com.testng;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.BookingConfirmation;

public class MyTest {
	SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss.SSS");
	

	
	@Test
	public void test1() {
		System.out.println("Test#1 Starting at: " +sdf.format(new Date()));
		System.out.println("Thread: " + Thread.currentThread().getId());
		//navigate
		//ticket booking enter details
		BookingConfirmation page = new BookingConfirmation();
		String actual = page.getConfirmationMessage();
		String expected = "Ticket Booked";
		System.out.println("Test#1 Ending at: " +sdf.format(new Date()));
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void test2() {
		System.out.println("Test#2 Starting at: " +sdf.format(new Date()));
		//navigate
		//ticket booking enter details
		//Error message validation
		System.out.println("Thread: " + Thread.currentThread().getId());
		System.out.println("Test#2 Ending at: " +sdf.format(new Date()));
	}
	
	@Test
	public void test3() {
		System.out.println("Test#3 Starting at: " +sdf.format(new Date()));
		//Login
		//navigate
		//ticket booking enter details
		//Error message validation
		//logout
		System.out.println("Thread: " + Thread.currentThread().getId());
		System.out.println("Test#3 Ending at: " +sdf.format(new Date()));
	}
	
	@Test
	public void test4() {
		System.out.println("Test#4 Starting at: " +sdf.format(new Date()));
		//navigate
		//ticket booking enter details
		//Error message validation
		System.out.println("Thread: " + Thread.currentThread().getId());
		System.out.println("Test#4 Ending at: " +sdf.format(new Date()));
	}
	
	
	@Test
	public void test5() {
		System.out.println("Test#5 Starting at: " +sdf.format(new Date()));
		//navigate
		//ticket booking enter details
		//Error message validation
		System.out.println("Thread: " + Thread.currentThread().getId());
		System.out.println("Test#5 Ending at: " +sdf.format(new Date()));
	}
	
	
	@Test
	public void test6() {
		System.out.println("Test#6 Starting at: " +sdf.format(new Date()));
		//navigate
		//ticket booking enter details
		//Error message validation
		System.out.println("Thread: " + Thread.currentThread().getId());
		System.out.println("Test#6 Ending at: " +sdf.format(new Date()));
	}
	
	
	@Test
	public void test7() {
		System.out.println("Test#7 Starting at: " +sdf.format(new Date()));
		//navigate
		//ticket booking enter details
		//Error message validation
		System.out.println("Thread: " + Thread.currentThread().getId());
		System.out.println("Test#7 Ending at: " +sdf.format(new Date()));
	}
	
	
	@Test
	public void test8() {
		System.out.println("Test#8 Starting at: " +sdf.format(new Date()));
		//navigate
		//ticket booking enter details
		//Error message validation
		System.out.println("Thread: " + Thread.currentThread().getId());
		System.out.println("Test#8 Ending at: " +sdf.format(new Date()));
	}
	
	
	@Test
	public void test9() {
		System.out.println("Test#9 Starting at: " +sdf.format(new Date()));
		//navigate
		//ticket booking enter details
		//Error message validation
		System.out.println("Thread: " + Thread.currentThread().getId());
		System.out.println("Test#9 Ending at: " +sdf.format(new Date()));
	}
	
	
	@Test
	public void test10() {
		System.out.println("Test#10 Starting at: " +sdf.format(new Date()));
		//navigate
		//ticket booking enter details
		//Error message validation
		System.out.println("Thread: " + Thread.currentThread().getId());
		System.out.println("Test#10 Ending at: " +sdf.format(new Date()));
	}
	
	
}
