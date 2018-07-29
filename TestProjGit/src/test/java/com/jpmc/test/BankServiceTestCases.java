package com.jpmc.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.jpmc.service.BankService;
import com.jpmc.service.BankServiceImpl;

public class BankServiceTestCases {
	private static BankService service;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("BankServiceTestCases::setUpBeforeClass()");
		service = new BankServiceImpl();
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception{
		System.out.println("BankServiceTestCases::tearDownAfterClass()");
		service = null;
	}
	
	@Before
	public void setUp() throws Exception{
		System.out.println("BankServiceTestCases::setUp()");
	}
	
	@After
	public void tearDown() throws Exception{
		System.out.println("BankServiceTestCases::tearDown()");
	}
	
	
	@Test
	public void testcalcSimpleIntrAmtWithInts(){
		int pAmt = 10000;
		int rate = 2;
		int time = 20;
		float expectedIntrAmt = 4000.0f;
		float actualIntrAmt = service.calcSimpleIntrAmt(pAmt, rate, time);
		assertEquals("Test1", expectedIntrAmt, actualIntrAmt, 0.0f);
	}
	
	

}
